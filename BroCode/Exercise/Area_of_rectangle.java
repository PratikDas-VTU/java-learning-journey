import java.util.*;
public class Area_of_rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle:");
        double b = sc.nextDouble();
        double area = l*b;
        System.out.print("The area of rectangle is : "+ area +"sq unit");
        sc.close();
    }
}
