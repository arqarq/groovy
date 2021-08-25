package operatorOverloading

class ClassTestGroovy extends GroovyTestCase {
    void testLeftShift() {
        assertEquals('c', Class.leftShift('c'))
    }
}
