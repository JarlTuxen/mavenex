import org.junit.Test;

import static org.junit.Assert.*;

public class GeometriTest {

    @Test
    public void arealFirkant() {
        assertEquals("arealFirkant(2,2)", 4, Geometri.arealFirkant(2,2));
    }
}