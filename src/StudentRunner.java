public class StudentRunner {
    public static void main(String[] args) {

        // creating one instance/object from the Rectangle class
        Student student1 = new Student("Dave", 15, 100.0);
        student1.printStudentInfo();
        student1.passOrFail();  // calling a method on the object
        System.out.println("");

        Student student2 = new Student("Wardell", 17, 55.8);
        student2.printStudentInfo();
        student2.passOrFail();  // calling a method on the object
    }
}

