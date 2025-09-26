package utils;
public class Student {
    
    private String name;
    private int age;
    private String id;


    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.id = "N/A";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = "N/A";
    }

 
    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Get y set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    
    public void showInfo() {
        System.out.println("Student Info:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("-----------------------");
    }
}
