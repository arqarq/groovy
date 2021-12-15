package basics

import groovy.transform.ToString

@ToString
class Department {
    Manager boss
}

@ToString
class Manager {
    String name
}

def d = new Department(boss: new Manager(name: 'Mr Burns'))
assert d.boss.name == 'Mr Burns'
println d.boss.name
d = new Department()
println d?.boss?.name

int x = 3
int y = 6
int z = 8
println x <=> y
println y <=> y
println z <=> y

String name
String n = (name != null && name.size() > 0 ? name : 'World')
n = name ? name : 'World'
n = name ?: 'World'
println "Hello, $n!"
println "Hello, ${n + n}!"
