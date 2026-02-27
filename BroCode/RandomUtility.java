import java.util.*;
public class RandomUtility {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("-----------Generating Random integer Number-----------");
        int number;
        for (int i = 0; i < 5; i++) {

            number = random.nextInt(1, 6); // lower limit 1 - included , upper limit 6 - not included
            System.out.print("The random generated integer number is : ");
            System.out.println(number);
            
        }
        System.out.println("------------Generating Random floating Number-----------");
        double floatnumber;
        for (int i = 0; i < 5; i++) {

            floatnumber = random.nextDouble(1.0, 6.0); // lower limit 1 - included , upper limit 6 - not included
            System.out.print("The random generated floating number is : ");
            System.out.printf("%.4f",floatnumber);
            System.out.println();
        }

    }
}