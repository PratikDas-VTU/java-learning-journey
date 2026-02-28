import java.util.*;
public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*  System.out.print("Enter birthday boy's name : ");
         String name = sc.nextLine().toUpperCase();
         happyBirthday(name); // name - argument
    ----------------------------------------------------------
    System.out.print("Enter a number to find square and cube :");
    double num = sc.nextDouble();
    System.out.println("Square of the given number is "+Square(num));
    System.out.println("Cube of the given number is "+Cube(num));
    
    ----------------------------------------------------------
    
    System.out.print("Enter your first name:");
    String firstName=sc.nextLine();
    System.out.print("Enter your last name:");
    String lastName=sc.nextLine();
    System.out.println("Your full name is "+ fullName(firstName, lastName));
    */
    
    System.out.print("Enter your age:");
    int age = sc.nextInt();
    if (age < 0 || age > 120){
        System.out.println("Invalid age !");
    }
    else if(ageCheck(age)) // or (ageCheck(age)==true)
        {
        System.out.println("You are an adult.");
    }else {
        System.out.println("You are an minor.");
    }
    sc.close();
    }
    /*
    static void happyBirthday(String name) // name - argument
    {
        System.out.println(" Happy birthday to you !!");
        System.out.println(" Happy birthday to you !!");
        System.out.printf(" Happy birthday dear %s !! \n",name);
        System.out.println(" Happy birthday to you !!");
    }
    ----------------------------------------------------------
    static double Square(double num){
        return num*num;
        }
        static double Cube(double num){
            return num*num*num;
        }
    ----------------------------------------------------------

    static String fullName(String a , String b){
        return a +" "+ b;
    }
    */
    static boolean ageCheck(int age){
        if(age >=18){
            return true;
        } else{
            return false;
        }
    }
}
