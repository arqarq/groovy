package swing

import groovy.swing.SwingBuilder

import javax.swing.WindowConstants as WC
import java.awt.*
import java.awt.BorderLayout as BL

static void moveText(src, dest, enter = false) {
    dest.text = src.text + (enter ? " $enter" : '')
}

new SwingBuilder().edt {
    frame(title: 'Hello, Groovy!', visible: true, size: new Dimension(400, 200), defaultCloseOperation: WC.EXIT_ON_CLOSE,
            locationRelativeTo: null) {
        panel(layout: new BL(), {
            final def txt = textField(constraints: BL.NORTH, 'Enter text here')
            final def lab = label(constraints: BL.CENTER, 'Text')
            button(constraints: BL.SOUTH, 'Move text', actionPerformed: { moveText(txt, lab) })

            txt.actionPerformed = { moveText(txt, lab, 'E') }
            lab.mouseClicked = { moveText(txt, lab, 'C') }
        })
    }
}
