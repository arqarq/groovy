package operatorOverloading;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassTest {
    @Test
    public void testLeftShift() {
        assertEquals("cc", new Class('c').leftShift("c"));
    }
}
