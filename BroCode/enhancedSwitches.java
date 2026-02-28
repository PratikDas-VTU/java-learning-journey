import java.util.*;
public class enhancedSwitches { // JAVA 14 FEATURE
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day of the week : ");
        String day = sc.nextLine().toLowerCase();
        switch(day){
            case "monday" -> System.out.println("Weekends Completed , get started !!");

            // case "tuesday" -> System.out.println("Again a working day");
            // case "wednesday" -> System.out.println("Again a working day");
            // case "thursday" -> System.out.println("Again a working day");

            case "tuesday" , "wednesday" , "thursday" -> System.out.println("Again a working day"); // Enhanced method

            case "friday" -> System.out.println("One more day , keep going");
            case "saturday" -> System.out.println("VooHoo weekend starts !!");
            case "sunday" -> System.out.println("2nd and last weekend !!");
            default -> System.out.println("Enter a valid day please");
        }
        sc.close();
    }
    
}
