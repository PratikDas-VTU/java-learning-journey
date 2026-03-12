import java.util.*;
public class Enums {
    public static void main(String[] args) {
        
        // Enums = (Enumerations) A special kind of class that
        // represents a fixed set of constants.
        // They improve code readability and are easy to maintain.
        // More efficient with switches when comparing Strings.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = sc.nextLine().toUpperCase();

        
        // System.out.println(day);
        // System.out.println(day.getDayNumber());
        try{
            DayEnums day = DayEnums.valueOf(response);
            switch (day) {
                        case MONDAY,
                            TUESDAY,
                            WEDNESDAY,
                            THURSDAY,
                            FRIDAY -> System.out.println("It is an weekday");
                        case SATURDAY ,SUNDAY -> System.out.println("It is weekend");
                    }
        } catch(IllegalArgumentException e){
            System.out.println("Please enter a valid Day !!");
        }
        
        sc.close();
    }
}
