import org.junit.Test;

import static org.junit.Assert.*;

public class MatematikTest {

    @Test
    public void addition() {
        assertEquals("2+2", 4, Matematik.addition(2,2));
    }

    @Test
    public void subtraction() {
        assertEquals("2-2", 0, Matematik.subtraction(2,2));
    }
}
