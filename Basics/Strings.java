import java.util.*;
public class Strings {
    public static void main(String[]args){
        String name ="Pratik";
        String fullName = "Pratik Das";
        String sentence = "My name is Pratik Das.";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter You name: ");
        // String you = sc.next();//only first token
        String you = sc.nextLine();
        System.out.print("Welcome "+you);
        
    }
}
