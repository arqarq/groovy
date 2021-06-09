package json

import groovy.json.JsonBuilder

final def builder = new JsonBuilder()

builder 1, [name: 'Buffy', role: 'slayer'], [name: 'Willow', role: 'witch']
assert builder.toString() == '[1,{"name":"Buffy","role":"slayer"},{"name":"Willow","role":"witch"}]'
builder name: 'Buffy', role: 'slayer'
assert builder.toString() == '{"name":"Buffy","role":"slayer"}'
builder {
    name 'Willow'
    role('witch')
}
assert builder.toString() == '{"name":"Willow","role":"witch"}'
