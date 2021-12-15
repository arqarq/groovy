package metaclass

Expando e = new Expando()

e.name = 'Fido'
e.speak = { it -> "$name says woof!" }
println e.speak()

Expando f = new Expando()

class Dog {}

Dog.getMetaClass().name = 'Phydeaux'
Dog.metaClass.speak = { msg = 'woof' -> "$name says $msg!" }

Dog d = new Dog()

println d.speak()
d.name = 'Rover'
println d.speak()
println d.speak('bow wow')
