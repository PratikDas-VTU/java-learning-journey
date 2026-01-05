import java.util.*;
public class Question6 {
    public static int Sum(int a , int b){
        int Sum = a + b;
        return Sum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number:");
        int n = sc.nextInt();
        System.out.print("Enter the Second number:");
        int m = sc.nextInt();
        System.out.print("The Sum of the two numbers are: "+Sum(n,m));
    }
}
