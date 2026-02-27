import java.util.*;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 1. Converting kgs into pounds.\n 2. Converting pounds into kgs.");

        System.out.println("Enter the required conversion (type 1 or 2):");
        int type = sc.nextInt();

        if(type == 1){

            System.out.print("Enter your weight (in kgs): ");
            double kgs = sc.nextDouble();
    
            double pounds = kgs * 2.205;
    
            System.out.println(kgs+" kgs in pounds is "+pounds +"lbs");
        } else if(type == 2){
            System.out.print("Enter your weight (in pounds): ");
            double pounds = sc.nextDouble();
    
            double kgs = pounds / 2.205;
    
            System.out.print(pounds+" pounds in kgs is ");
            System.out.printf("%.2fkgs",kgs);
        } else {
            System.out.println("Please enter valid input ");
        }
        sc.close();
    }
}
