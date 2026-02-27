import java.util.*;
public class ternaryOperator {
    public static void main(String[] args) {

        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        // -------- example 1 ---------
        System.out.println("-------- example 1 ---------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks in Java: ");
        int marks = sc.nextInt();

        String result = (marks>=50) ? "PASSED" : "FAILED";

        System.out.println("You "+result + " the exam !!!!");

        //-------- example 2 ---------
        System.out.println("-------- example 2 ---------");

        System.out.print("Enter a number to check Even or ODD: ");
        int number = sc.nextInt();

        String sol = ( number%2 == 0) ? "EVEN":"ODD";
        System.out.println("The entered number is "+sol);

        //-------- example 3 ---------
        System.out.println("-------- example 3 ---------");

        System.out.println("Enter the hours of time ( 0 -24) :");
        int hour = sc.nextInt();

        String suffix = (hour<12) ? "A.M." : "P.M.";
        System.out.println("The entered hours determines: "+ suffix);

        //-------- example 4 ---------
        System.out.println("-------- example 4 ---------");

        System.out.println("Enter your income (in rupees): ");
        int income = sc.nextInt();
        String tax = (income<1200000) ? "NO Tax": "TAX will be deducted";
        System.out.println("According to your income: "+ tax);

        sc.close();
        
    }
}
