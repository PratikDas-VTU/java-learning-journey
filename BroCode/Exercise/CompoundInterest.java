import java.util.*;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal Amount:");
        int P = sc.nextInt();

        System.out.print("Enter the rate:");
        double R = sc.nextDouble();

        System.out.print("Enter the time(Years) of compunding:");
        int T = sc.nextInt();


        // double CP = P * ( 1 + Math.pow(T, (R/100)));
        double CP = P * Math.pow(( 1 + R/100),T);

        System.out.print("Compund interest of Amount "+P+" at a rate of "+R+"% after "+T+" Years is : "+ CP);
        sc.close();
    }
}
