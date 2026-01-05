
import java.util.*;
public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int i =1;
        int mul = 0;
        do{
            mul = n*i;
            System.out.println(n + " * " + i +" = " + mul);
            i++;
        }while(i<=10);
    }
}
