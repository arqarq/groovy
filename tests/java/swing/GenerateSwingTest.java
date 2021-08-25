package swing;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GenerateSwingTest {
    private String a;

    @Before
    public void init() {
        a = "a";
    }

    @Test
    public void edt() {
        final List<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
        assertEquals("a", a);
    }
}
