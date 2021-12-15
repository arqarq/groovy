package basics

import groovy.transform.*

//@ToString(includeNames = true)
//@EqualsAndHashCode
//@TupleConstructor
@Canonical
class Person {
    String first = ''
    String last
    
    void setLast(final String last) {
        println 'inside setLast'
        this.last = last
    }
    
//    String toString() {
//        "$first $last"
//    }
}

final Person p = new Person()
p.setFirst('David')
p.last = 'Ortiz'
println "${p.getFirst()} ${p.last}"
final Person p2 = new Person(first: 'David', last: 'Ortiz')
println "${p2.getFirst()} ${p2.last}"
final Person p3 = new Person(first: 'B', last: 'C')
Person p4 = new Person('David', 'Ortiz')
println p
println p == p4
println p != p3
Set people = [p, p2, p3, p4]
println people.size()
