import java.util.*;

public class calculatorProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Select an operation( + , - , * , / , ^ ): ");
        char op = sc.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        switch (op) {

            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot be divided by zero (0)");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator");
                validOperation = false;
            }
        }
        if (validOperation) {
            System.out.println(result);
        }
        sc.close();
    }
}
