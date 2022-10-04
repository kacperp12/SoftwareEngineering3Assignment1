package SoftwareEngAssignmentOne;

import org.joda.time.DateTime;

/**
 *
 * @author Kacper
 */
public class CourseProgramme {
    private String name;
    private Module[] modules;
    private Student[] students;
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String n, DateTime sDate, DateTime eDate) {
        setName(n);
        startDate = sDate;
        endDate = eDate;
    }

    //accessor methods
    public String getName() {
        return name;
    }

    public Module[] getModules() {
        return modules;
    }

    public Student[] getStudents() {
        return students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    //mutator methods
    //did not create mutator methods for certain fields (e.g. start or end date) as they should not be changeable

    public void setName(String name) {
        this.name = name;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
