package basics

def x = 1
println x.class.name
x = 'abc'
println x.class.name
x = new Date()
println x.class.name
x = 1.0
println x.class.name
x = [3, 1, 4, 1, 5, 9]
println x
println x.class.name
x = [3, 1, 4, 1, 5, 9] as LinkedList
println x
println x.class.name
x = [3, 1, 4, 1, 5, 9] as Set
println x
println x.class.name
x = [3, 1, 4, 1, 5, 9] as SortedSet
println x
println x.class.name
x = [a: 1, b: 2, c: 2]
println x
println x.getClass().name
println x.keySet()
println x.entrySet()
println x.values()
x.d = 3
x['e'] = 2
x.put('f', 1)
println x
x = 'a b c'.split() as List
println x
println x.class.name
x.each {
    println it
}
x.eachWithIndex { s, idx ->
    println "x[$idx] == ${s}"
}

boolean isPalindrome(final String s) {
    final String test = s.toLowerCase().replaceAll(/\W/, '')
    test == test.reverse()
}

println isPalindrome("Madam, in Eden, I'm Adam")

import groovy.transform.*

@Canonical
class Person2 {
    String first
    String last
}

final def p1 = new Person2('A', 'B')
println p1
final def p2 = new Person2('C', 'DD')
final def p3 = new Person2('E', 'FG')
final List people = [p1, p2, p3]
println people*.last
println people.collect { "$it.first $it.last" }
              .findAll { it.size() > 3 }
              .join(',')
