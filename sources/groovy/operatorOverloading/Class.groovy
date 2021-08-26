package operatorOverloading

class Class {
    private String temp

    Class(init) {
        temp = init
    }

    String leftShift(String input) {
        this.temp += input
        println this.temp
        this.temp
    }
}
