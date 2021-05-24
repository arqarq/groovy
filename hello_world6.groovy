List nums = [3, 1, 4, 1, 5, 9]
nums.each { n ->
    println n
}
nums.eachWithIndex { n, idx ->
    println "nums[$idx] == $n"
}

Map m = [a: 1, b: 2, c: 3]
m.each { e ->
    println "m[${e.key}] == ${e.getValue()}"
}
Integer i = 90
m.each { k, v ->
    println "m[$k] == $v"
    println i
    i += 1 
}
println '----------------------'

10.downto(7, { print it; it == 7 ? println() : void })
10.downto(7) { print it; it == 7 ? println() : void }
10.downto 7, { print it }
