import java.util.*;
public class searchInArrayEg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of fruits: ");
        int size = sc.nextInt();

        //---------------------------------
        String fruits[] = new String[size];
        //---------------------------------

        System.out.println("Enter elements of array one by one:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            fruits[i] = sc.nextLine();
        }

        System.out.print(" \n Enter the element to be searched:");
        String search = sc.nextLine();
        boolean found = false;
        int index = 0;

        for (int i = 0; i < size; i++) {
            if (fruits[i] == search) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found !!");
        }

        sc.close();
    }
}
