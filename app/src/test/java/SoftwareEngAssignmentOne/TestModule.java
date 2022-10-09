package SoftwareEngAssignmentOne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestModule {
    private Module m1;
    private Lecturer l1;
    
    public TestModule() {
        l1 = new Lecturer("Tom", "26/09/2000", 19471183, 28);
        m1 = new Module("Software Engineering 24", "CT4100", l1);
    }
    
    @Test
    public void getName() {
        assertEquals("Software Engineering 24", m1.getName());
    }
    
    @Test
    public void getId() {
        assertEquals("CT4100", m1.getId());
    }
    
    @Test
    public void getLecturer() {
        assertEquals(l1.getName(), m1.getLecturer().getName());
    }
}
