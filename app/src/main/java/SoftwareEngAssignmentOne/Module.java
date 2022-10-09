package SoftwareEngAssignmentOne;

import java.util.ArrayList;

public class Module {
    private String name;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<CourseProgramme> courseAssociation;
    private Lecturer lecturer;
    
    public Module(String n, String id, Lecturer lecturer) {
        setName(n);
        this.id = id;
        this.lecturer = lecturer;
        
        this.students = new ArrayList<>();
        this.courseAssociation = new ArrayList<>();
    }

    //accessor methods
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<CourseProgramme> getCourseAssociation() {
        return courseAssociation;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    //mutator methods
    //did not create mutator methods for certain fields (e.g. ID) as they should not be changeable
    public void setName(String name) {
        this.name = name;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public void addCourse(CourseProgramme course) {
        courseAssociation.add(course);
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
