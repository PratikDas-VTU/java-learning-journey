import java.util.*;
public class Shopping_Card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Welcome to Das' Stationary Store !!");
        System.out.println("Please enter the item you wanna buy :");
        String item = sc.nextLine();
        System.out.println("What is the price of each "+ item);
        double price = sc.nextDouble();

        System.out.println("Enter the number of quantities: ");
        int quantity = sc.nextInt();

        double bill = price * quantity;

        System.out.println("Your total bill is "+bill);

        System.out.println("Thank you for shopping with Das' Stationary Store !!");
    }
}
