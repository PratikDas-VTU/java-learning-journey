import java.util.*;

public class searchInArrayEg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elments: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter elements of array one by one:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.print(" \n Enter the element to be searched:");
        int search = sc.nextInt();
        boolean found = false;
        int index = 0;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == search) {
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
