package xml

import groovy.xml.MarkupBuilder

final def builder = new MarkupBuilder(new FileWriter('file.xml'))

builder.doubleQuotes = true
builder.people {
    person(id: 1, atrybut: 'a') {
        imię 'Słoń'
    }
    person(id: 2, atrybutDrugi: 'b') {
        nazwisko('Trąbalski')
    }
}
builder.people2(atrybucik: null, {
    person(id: 3, atrybut: 'c', {
        imię null
    })
})
builder.people3 tylkoAtrybut: null
