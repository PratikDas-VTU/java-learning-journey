import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 13) {
            System.out.println("You are a Child");
        } 
        else if (age >= 13 && age < 18) {
            System.out.println("You are a Teenager");
        } 
        else {
            System.out.println("You are an Adult");
        }

        sc.close();
    }
}
