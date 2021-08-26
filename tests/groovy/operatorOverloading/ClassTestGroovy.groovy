package operatorOverloading

class ClassTestGroovy extends GroovyTestCase {
    Class c

    @Override
    void setUp() throws Exception {
        super.setUp()
        c = new Class('cd')
    }

    void testLeftShift() {
        assertEquals('cd..', c << '..')
    }

    void testDoubleLeftShift() {
        assertNotSame('cd..', c << '.' << '.')
    }

    void testDoubleLeftShiftWithTypeCorrection() {
        assertEquals('cd..', c << '.' << '.' as String) // bo drugi '<<' to leftShift z typu StringBuffer
    }
}
