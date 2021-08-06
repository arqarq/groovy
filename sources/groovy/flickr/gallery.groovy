package flickr

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import groovy.swing.SwingBuilder

import javax.swing.ImageIcon
import javax.swing.WindowConstants
import java.awt.GridLayout

final String key = new File('flickr_key.txt').text
final String endPoint = 'https://api.flickr.com/services/rest?'
paramsAndQsAndJson = [method: 'flickr.photos.search', api_key: key, format: 'json', tags: 'cat,dog', nojsoncallback: 1,
                      media : 'photos', per_page: 6]
paramsAndQsAndJson = paramsAndQsAndJson.collect { k, v -> "$k=$v" }.join('&')
println(paramsAndQsAndJson = "$endPoint$paramsAndQsAndJson")
paramsAndQsAndJson = paramsAndQsAndJson.toURL().text

final f = new File('catsAndDogs.json')
deleteFileIfExists(f)
f << JsonOutput.prettyPrint(paramsAndQsAndJson)
println JsonOutput.prettyPrint(paramsAndQsAndJson)
paramsAndQsAndJson = new JsonSlurper().parseText(paramsAndQsAndJson)
photos = paramsAndQsAndJson.photos.photo
photos.each {
    println(paramsAndQsAndJson = "https://farm${it.farm}.staticflickr.com/${it.server}/${it.id}_${it.secret}.jpg")
    it.bytesFromUrl = paramsAndQsAndJson.toURL().getBytes()
}
new SwingBuilder().edt {
    final frame = frame(title: 'Cat and dog pictures', visible: false, pack: true, defaultCloseOperation: WindowConstants.EXIT_ON_CLOSE,
            layout: new GridLayout(0, 2, 2, 2)) {
        photos.each { final p ->
            label(icon: new ImageIcon(p.bytesFromUrl), toolTipText: p.title)
        }
    }
    frame.setLocation(30, 30)
    frame.setResizable(false) // no maximize option
    frame.setVisible(true) // no small, unprepared window
    frame.requestFocus() // blinking on taskbar
}
deleteFileIfExists(f)

private static void deleteFileIfExists(final File f) {
    if (f) {
        f.delete()
    }
}
