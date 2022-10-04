package SoftwareEngAssignmentOne;

/**
 *
 * @author Kacper
 */
public class Module {
    private String name;
    private String id;
    private Student[] students;
    private CourseProgramme courseAssociation;
    private Lecturer lecturer;
    
    public Module(String n, String id) {
        setName(n);
        this.id = id;
    }

    //accessor methods
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Student[] getStudents() {
        return students;
    }

    public CourseProgramme getCourseAssociation() {
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

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setCourseAssociation(CourseProgramme courseAssociation) {
        this.courseAssociation = courseAssociation;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
    
    
}
