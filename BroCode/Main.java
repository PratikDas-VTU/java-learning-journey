public class Main {
    public static void main(String[]args){
        System.out.println("Primitive Datatype");
        // Integer Datatype
        System.out.println("Integer Datatype");
        int age = 20;
        int year = 2026;
        int weight = 58;

        System.out.println(age);
        System.out.println(year);
        System.out.println(weight);
        
        // Double or float datatype
        System.out.println("Double or float datatype");
        double pi = 3.14;
        double price = 45.433;

        System.out.println(pi);
        System.out.println(price);

        //char datatype
        System.out.println("char datatype");
        char grade='A';
        char currency = 'R';

        System.out.println(grade);
        System.out.println(currency);

        // Boolean datatype
        System.out.println("Boolean datatype");
        boolean isStudent = true;
        boolean isOnline = false;

        if (isStudent){
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }
        if (isOnline){
            System.out.println("You are Online.");
        } else {
            System.out.println("You are not Online.");
        }

        // Reference Datatype
        System.out.println("-------------------------------------------");
        System.out.println("Reference Datatype");
        // String datatype
        String name = "Pratik Das";
        String food = "Dal";
        String email = "testing@123gmail.com";


        System.out.print(name);
        System.out.println(food);
        System.out.println("My email address is: "+ email);
        System.out.println("My name is " + name + " and I am "+age+" years old.");
    }
}
