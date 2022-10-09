package SoftwareEngAssignmentOne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStudent {
    private Student s1;
    
    public TestStudent() {
        s1 = new Student("Tom", "25/09/2000", 19471182, 22);
    }
    
    @Test
    public void getUsername() {
        assertEquals("Tom22", s1.getUsername());
    }
    
    @Test
    public void getName() {
        assertEquals("Tom", s1.getName());
    }
    
    @Test
    public void getDob() {
        assertEquals("25/09/2000", s1.getDob());
    }
    
    @Test
    public void getId() {
        assertEquals(19471182, s1.getId());
    }
    
    @Test
    public void getAge() {
        assertEquals(22, s1.getAge());
    }
}
