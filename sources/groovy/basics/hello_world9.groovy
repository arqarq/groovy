package basics

import groovy.json.*

final String base = 'http://api.icndb.com/jokes/random?'
final def qs = [limitTo: '[nerdy]', firstName: 'Guillaume', lastName: 'Laforge'].collect { k, v -> "$k=$v" }
                                                                                .join('&')
def json = new JsonSlurper().parseText("$base$qs".toURL().text)
println StringEscapeUtils.escapeJava(json.value.joke)
