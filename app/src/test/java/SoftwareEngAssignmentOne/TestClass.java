package SoftwareEngAssignmentOne;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

public class TestClass {
    static CourseProgramme c1;
    
    static Student[] students = new Student[3];
    static Student s1, s2, s3;
    
    static Module[] modules = new Module[3];
    static Module m1, m2, m3;
    
    static Lecturer l1;
    
    @BeforeAll
    public static void init() {
        //create course
        c1 = new CourseProgramme("Computer Science", new DateTime(2019, 9, 5, 9, 0), new DateTime(2023, 3, 28, 9, 0));

        //create students
        s1 = new Student("Tom", "25/09/2000", 19471182, 22);
        s2 = new Student("Bill", "26/08/2001", 19471183, 21);
        s3 = new Student("Chap", "27/07/2000", 19471184, 22);
        
        //add students to array
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        //add course to students
        for(Student student : students) {
            student.setCourse(c1);
        }
        
        //create lecturer
        l1 = new Lecturer("Owen Finlay", "1/1/1999", 19461111, 23);
        
        //add modules to lecturer
        l1.setModules(modules);

        //create modules
        m1 = new Module("Software Engineering 3", "CT410");
        m2 = new Module("Software Engineering 4", "CT411");
        m3 = new Module("Software Engineering 5", "CT412");
        
        //set students to modules
        m1.setStudents(students);
        m2.setStudents(students);
        m3.setStudents(students);
        
        //add modules to array
        modules[0] = m1;
        modules[1] = m2;
        modules[2] = m3;
        
        //add modules to course
        c1.setModules(modules);
        
        //add students to course
        c1.setStudents(students);
        
        //add students to modules and add lecturer to modules and add course programme to modules
        for(Module module : modules) {
            module.setStudents(students);
            module.setLecturer(l1);
            module.setCourseAssociation(c1);
        }
        
        //add modules to students
        for(Student student : students) {
            student.setModules(modules);
        }
    }
    
    @Test
    void getStudentUsernameWorks() {
        String[] usernames = new String[3];
        int i = 0;
        
        for(Student student : students) {
            usernames[i] = student.getUsername();
            i++;
        }
        
        assertEquals(usernames[0], "Tom22");
        assertEquals(usernames[1], "Bill21");
        assertEquals(usernames[2], "Chap22");
    }
}
