package SoftwareEngAssignmentOne;

import java.util.ArrayList;

public class Lecturer {
    private String name;
    private String dob;
    private ArrayList<Module> modules;
    private int id;
    private int age;

    public Lecturer(String n, String d, int id, int age) {
        setName(n);
        dob = d;
        this.id = id;
        this.age = age;
        
        this.modules = new ArrayList<>();
    }
    
    //concatenates name and age of lecturer to return a username
    public String getUsername() {
        return name + age;
    }
    
    //accessor methods
    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
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

    public void addModules(Module module) {
        modules.add(module);
    }
}
