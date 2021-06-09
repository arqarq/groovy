package xml

import groovy.xml.MarkupBuilder

final def builder = new MarkupBuilder()

builder.people {
    person(id: 1, atrybut: 'a') {
        imię 'Słoń'
    }
    person(id: 2, atrybutDrugi: 'b') {
        nazwisko('Trąbalski')
    }
}
