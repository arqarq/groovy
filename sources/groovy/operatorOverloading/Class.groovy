package operatorOverloading

class Class {
    private String temp

    Class(init) {
        temp = init
    }

    String leftShift(String input) {
        temp += input
        println temp
        temp
    }
}
