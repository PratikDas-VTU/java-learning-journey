import java.util.*;
public class Functions {
    public static void printName(String name){ // Declaration
        System.out.println("Hello "+name+"!");
        System.out.println("Welcome to the Java Functions Practice Course.");
        return;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your name:");
        String name = sc.next();
        printName(name); // Calling Function
    }
}
