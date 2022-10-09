package SoftwareEngAssignmentOne;

import java.util.ArrayList;

public class Student {
    private String name;
    private String dob;
    private ArrayList<CourseProgramme> courses;
    private ArrayList<Module> modules;
    private int id;
    private int age;
    
    public Student(String n, String d, int id, int age) {
        setName(n);
        dob = d;
        this.id = id;
        this.age = age;
        
        this.courses = new ArrayList<>();
        this.modules = new ArrayList<>();
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

    public ArrayList<CourseProgramme> getCourse() {
        return courses;
    }

    public ArrayList<Module> getModules() {
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

    public void addCourse(CourseProgramme course) {
        courses.add(course);
    }

    public void addModules(Module module) {
        modules.add(module);
    }
    
    @Override
    public String toString() {
        String str = "";
        str += "Student Information\n" +
                "----------------------\n" +
                "Name: " + getName() + "\n" +
                "Date of Birth: " + getDob() + "\n" +
                "ID: " + getId() + "\n" + 
                "Age: " + getAge() + "\n";
        
        for(CourseProgramme course : courses) {
            str += "Course: " + course.getName() + "\n";
        }
        
        for(Module module : modules) {
            str += "Modules: " + module.getName() + "\n";
        }
        
        return str;
    }
}
