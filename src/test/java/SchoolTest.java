import org.junit.Test;

import static org.junit.Assert.*;

public class SchoolTest {

    @Test
    public void test()
    {
        //prepare
        School sch = new School();
        //action
        sch.setBarOpen(true);
        boolean isDone = sch.closeBar();
        //test results
        assertEquals("closeBar: ", true, isDone);
    }

}