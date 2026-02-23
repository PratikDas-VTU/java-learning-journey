import java.util.*; // For input Scanner function
public class Userinput {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter You name: ");
        String name = sc.nextLine(); // For a full next line string input

        System.out.print("Enter you age: ");
        int age = sc.nextInt(); // for an integer input

        sc.nextLine(); // Solving the user input bug 

        System.out.print("Enter your favorite Color :");
        String color = sc.nextLine();

        System.out.print("Enter Your Gpa: ");
        double gpa = sc.nextDouble(); // for double / floating point number

        System.out.print("Hello "+name+"."+" Your age is "+age+"."+" Your current gpa is "+gpa+"."+" Your Favorite Color is "+ color + ".");
    }
}
 