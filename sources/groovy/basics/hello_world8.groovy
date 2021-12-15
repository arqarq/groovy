package basics

def s = 'https://oreilly.com'.toURL().getText()
s = s.dropRight(s.size() - s.indexOf('</title>'))
final def found = s.find(/<title[\s\S]*>/)
println "Title is: ${s.drop(s.indexOf(found) + found.size())}"

final String base = 'https://maps.googleapis.com/maps/api/geocode/xml?'
def encoded = ['10 Fawcett Street', 'Cambridge', 'MA'].collect {
    URLEncoder.encode it, 'UTF-8'
}.join(',')
final def qs = "address=$encoded"
final def root = new XmlSlurper().parse("$base$qs")
println "Google Maps' response:\nstatus: ${root.status},\nerror message: ${root.error_message}"
