package SoftwareEngAssignmentOne;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCourseProgramme {
    private CourseProgramme c1;
    private DateTime startDate, endDate;
    
    public TestCourseProgramme() {
        startDate = new DateTime(2019, 9, 5, 0, 0);
        endDate = new DateTime(2023, 5, 28, 0, 0);
        c1 = new CourseProgramme("Computer Science", startDate, endDate);
    }
    
    @Test
    public void getName() {
        assertEquals("Computer Science", c1.getName());
    }
    
    @Test
    public void getStartDate() {
        assertEquals(startDate, c1.getStartDate());
    }

    @Test
    public void getEndDate() {
        assertEquals(endDate, c1.getEndDate());
    }
}
