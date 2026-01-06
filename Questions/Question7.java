import java.util.*;
public class Question7 {
    public static int Multiply(int a , int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number:");
        int n = sc.nextInt();
        System.out.print("Enter the Second number:");
        int m = sc.nextInt();
        System.out.print("The Multiplication of the two numbers are: "+Multiply(n,m));
    }
}
