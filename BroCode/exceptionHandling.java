import java.util.*;

public class exceptionHandling {
    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program
        // (Dividing by zero, file not found, mismatch input type)
        // Surround any dangerous code with a try{} block
        // try{}, catch{}, finally{}

        

        try (Scanner sc = new Scanner(System.in);){
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("This is not a number !!");
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero !!");
        } catch(Exception e){
            // Safety net
            System.out.println("Something went wrong !!");
        }
        finally{
            System.out.println("This always executes");
        }

        
    }
}
