public class Student {

    // instance variables
    private String name;
    private int age;
    private double gpa;

    // constructor
    public Student(String studentName, int studentAge, double studentGPA) {
        name = studentName;
        age = studentAge;
        gpa = studentGPA;
    }

    // method that introduces the Cat
    public void passOrFail() {
        if (gpa >= 65.0) {
            System.out.println("I have a " + gpa + " gpa so I am passing");
        }else{
            System.out.println("I have a " + gpa + " gpa so I am failing right now");
        }
    }

    // method that prints Cat info
    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
