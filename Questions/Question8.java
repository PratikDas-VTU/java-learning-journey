import java.util.*;
public class Question8 {
    public static int Factorial(int a){
        int total=1;
        for(int i=1;i<=a;i++){
            total= total*i;
        }
        return total;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        System.out.print("Factorial of "+n+" is : "+ Factorial(n));
    }
}
