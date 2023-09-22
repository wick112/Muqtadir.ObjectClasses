public class CatRunner {
    public static void main(String[] args) {

        // creating one instance/object from the Rectangle class
        Cat cat1 = new Cat("Garfield", 6, 15.6);
        cat1.introduce();  // calling a method on the object
        cat1.printCatInfo();
        System.out.println("");
        Cat cat2 = new Cat("Puss", 35, 34.8);
        cat2.printCatInfo();
        cat2.introduce();  // calling a method on the object


    }
}

