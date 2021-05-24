println(-3..3)
println([-3..3])
assert 'https://oreilly.com'.toURL().readLines()*.size() == 'https://oreilly.com'.toURL().text.readLines()*.size()
