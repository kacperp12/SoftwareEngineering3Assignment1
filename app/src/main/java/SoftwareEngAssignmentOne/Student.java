package SoftwareEngAssignmentOne;

/**
 *
 * @author Kacper
 */
public class Student {
    private String name;
    private String dob;
    private CourseProgramme course;
    private Module[] modules;
    private int id;
    private int age;
    
    public Student(String n, String d, int id, int age) {
        setName(n);
        dob = d;
        this.id = id;
        this.age = age;
    }

    //accessor methods
    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    //concatenates name and age of student to return a username
    public String getUsername() {
        return name + age;
    }

    public CourseProgramme getCourse() {
        return course;
    }

    public Module[] getModules() {
        return modules;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
    
    //mutator methods
    //did not create mutator methods for certain fields (e.g. ID) as they should not be changeable
    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(CourseProgramme course) {
        this.course = course;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }
    
}
