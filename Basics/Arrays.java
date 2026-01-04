import java.util.*;
public class Arrays {
    public static void main(String[]args){
        // int[] marks = new int[3];
        int marks[] = new int[3];
        marks[0]=45;
        marks[1]=49;
        marks[2]=55;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println("Using For Loop !!");
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int size = sc.nextInt();
        int numbers[]= new int[size];
        System.out.println("Enter Elements of array: ");
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println(" Elements of array: ");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
