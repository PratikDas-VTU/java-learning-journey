import java.util.*;
public class RandomUtility{
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        for ( int i = 0 ; i<5;i++){

            number = random.nextInt(1, 6); // lower limit 1 - included , upper limit 6 - not included
            
            System.out.print("The random generated number is :");
            System.out.println(number);
        }

    }
}