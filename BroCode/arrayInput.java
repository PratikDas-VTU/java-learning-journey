import java.util.*;

public class arrayInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of foods: ");
        int size = sc.nextInt();
        sc.nextLine(); // avoid default \n - clearing scanner
        String foods[] = new String[size];

        System.out.println("Enter elements of array one by one:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            foods[i] = sc.nextLine();
        }
        System.out.print("The Foods array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(foods[i] + " ");
        }

        for (String food : foods) {
            System.out.print("\n"+food);
        }

        sc.close();
    }
}
