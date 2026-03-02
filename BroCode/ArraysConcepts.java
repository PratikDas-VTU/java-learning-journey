import java.util.*;
public class ArraysConcepts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruits[] = {"Apple","Orange","Banana"};

        fruits[2] = "Grapes"; // value can be changed

        int numOfFruuits = fruits.length; // identify the length of the array
        Arrays.sort(fruits); // sorting the array - String array according to alphabetic order and num array on numeric
        Arrays.fill(fruits, "empty");

        // This is normal for-loop
        for ( int i = 0; i < numOfFruuits; i++){
            System.out.println(fruits[i]);
        }
        // Enhanced for-loop or say for each loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }


        sc.close();
    }
}
