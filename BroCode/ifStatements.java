import java.util.*;

public class ifStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        if (name.isEmpty()) // learnt a new boolean condition checking built-in function
            {
            System.out.println(" You cannot proceed without entering the name !");
        }
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();

        if (age < 0 || age > 120) {
            System.out.println(" Please Enter a valid age");
        } else if (age < 18) {
            System.out.println(" You are not eligible for voting !!");
        } else {
            System.out.println(" You are permitted for voting. ");
        }
        sc.close();
    }
}
