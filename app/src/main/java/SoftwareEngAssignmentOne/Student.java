package SoftwareEngAssignmentOne;

/**
 *
 * @author Kacper
 */
public class Student {
    private String name;
    private String dob;
    private CourseProgramme[] courses;
    private Module[] modules;
    private int id;
    private int age;
    
    public Student(String n, String d, CourseProgramme[] c, Module[] m,
            int id, int age) {
        setName(n);
        setCourses(c);
        setModules(m);
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

    public CourseProgramme[] getCourses() {
        return courses;
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

    public void setCourses(CourseProgramme[] courses) {
        this.courses = courses;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }
    
}
