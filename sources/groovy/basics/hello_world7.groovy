package basics

List nums = [3, 1, 4, 1, 5, 9]
List results = []
nums.each {
    results << it * 2
}
println results

nums.collect { it * 2 }
    .findAll { it % 3 == 0 }
    .sum()

List strings = 'this is a list of strings'.split()
println strings.collect { it[0] }
println strings.collect { it.size() }
println strings*.size()
println strings.size()

def map = [k1: 'v1', k2: 'v2', k3: 'v3']
map.collect { k, v -> "$k=$v" }.join('&')
