import java.util.*;
public class subString {
    public static void main(String[] args) {

        /* .substring() = A method used to extract a portion of a string
            .substring(start, end)  // the last character is included
        */
        String string = "Testing substring methods";
        System.out.println(string.substring(0,7) + " Successfull");

        System.out.println("--------------Email Indexing--------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        if (email.contains("@")){
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"),email.length());
            System.out.println("Your User name will be: "+username);
            System.out.println("Your domain name will be: "+domain);
        } else {
            System.out.println("Please enter a valid email !!!!!");
        }
        sc.close();
    }
}
