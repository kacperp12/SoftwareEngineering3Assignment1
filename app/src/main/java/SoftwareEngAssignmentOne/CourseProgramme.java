package SoftwareEngAssignmentOne;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme {
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgramme(String n, DateTime sDate, DateTime eDate) {
        setName(n);
        startDate = sDate;
        endDate = eDate;
        
        this.modules = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    //accessor methods
    public String getName() {
        return name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Student> getStudents() {
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

    public void addModules(Module module) {
        modules.add(module);
    }

    public void addStudents(Student student) {
        students.add(student);
    }
}
