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
}
