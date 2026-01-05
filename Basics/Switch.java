import java.util.*;
public class Switch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Button 1 / 2 / 3:");
        int button = sc.nextInt();
        switch (button){
            case 1:
                System.out.println("Hello!!");
                break;
            case 2:
                System.out.println("Namaste!!");
                break;
            case 3:
                System.out.println("Hallo!!(German)");
                break;
            default:
                System.out.println("! Invalid Button !");
        }
    }
}
