import java.util.*; // For input Scanner function
public class Userinput {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter You name: ");
        String name = sc.nextLine(); // For a full next line string input

        System.out.println("Enter you age: ");
        int age = sc.nextInt(); // for an integer input

        System.out.println("Enter Your Gpa: ");
        double gpa = sc.nextDouble(); // for double / floating point number

        System.out.println("Hello "+name+"."+" Your age is "+age+"."+" Your current gpa is "+gpa+".");
    }
}
 