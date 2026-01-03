import java.util.*;
public class Question3 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Both are Equal !");
        } else if(a>b){
            System.out.println("First number is Greater !!");
        } else{
            System.out.println("Second number is Greater !!");
        }
    }
}
