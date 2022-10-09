package SoftwareEngAssignmentOne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLecturer {
    private Lecturer l1;
    
    public TestLecturer() {
        l1 = new Lecturer("Tom", "26/09/2000", 19471183, 28);
    }
    
    @Test
    public void getUsername() {
        assertEquals("Tom28", l1.getUsername());
    }
    
    @Test
    public void getName() {
        assertEquals("Tom", l1.getName());
    }
    
    @Test
    public void getDob() {
        assertEquals("26/09/2000", l1.getDob());
    }
    
    @Test
    public void getId() {
        assertEquals(19471183, l1.getId());
    }
    
    @Test
    public void getAge() {
        assertEquals(28, l1.getAge());
    }
}
