import java.util.*;

public class TempConversion {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

    // ------My code --------

        /* 
        System.out.println(" 1. Celcius to Fahrenheit. \n 2. Fahrenheit to Celcius");

        System.out.print("Select a conversion method (Type 1 or 2 ): ");
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.print(" Enter the temperature in Celcius: ");
            double cel = sc.nextDouble();
            double feh = (cel * (9.0/5.0)) + 32;
            System.out.print(cel +" ° Celcius in Fahrenheit is :"+ feh +" ° F");
        } else if(choice == 2){
            System.out.print(" Enter the temperature in Fahrenheit: ");
            double feh = sc.nextDouble();
            double cel = (feh - 32) * (5.0/9.0);
            System.out.print(feh +" ° Fahrenheit in Fahrenheit is :"+ cel +" ° C");
        } else {
            System.out.println(" Invalid choice !!!");
        }
        */
       // ------Bro code --------

        double temp;
        double newTemp;
        String unit;
        
        System.out.print("Enter the temperature: ");
        temp = sc. nextDouble () ;
        
        System.out.print("Convert to Celsius or Fahrenheit? (C or F) :");
        unit = sc.next().toUpperCase();
        
        // (condition) ? true : false
        newTemp = (unit.equals("C")) ? (temp - 32)*5/9 : (temp*5/9)+ 32;
        
        System.out.printf("%.2f °%s",newTemp,unit);


        sc.close();
    }
}
