import java.util.*;
public class HWP1_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Select Operation :");
        System.out.println("For Addition(+) , Enter 1:");
        System.out.println("For Subtraction(-) , Enter 2:");
        System.out.println("For Multiplication(*) , Enter 3:");
        System.out.println("For Division(/) , Enter 4:");
        System.out.println("For Remainder/Modulo(%) , Enter 5:");
        int op = sc.nextInt();
        switch(op){
            case 1:
                System.out.print("Added Value is:");
                System.out.println(a+b);
                break;
            case 2:
                System.out.print("Subtracted Value is:");
                System.out.println(a-b);
                break;
            case 3:
                System.out.print("Multiplied Value is:");
                System.out.println(a*b);
                break;
            case 4:
                if(b==0){
                    System.out.println("Second Number Cannot be Zero While Dividing!");
                } else{
                    System.out.print("Divided Value is:");
                    System.out.println((double)a/b);
                }
                break;
            case 5:
                System.out.print("Remainder After division is:");
                System.out.println(a%b);
                break;
            default:
                System.out.println("Select a Valid Operator !");
        }
    }
}
