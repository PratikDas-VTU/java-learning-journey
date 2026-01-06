import java.util.*;
public class Question9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of elements in the array:");
        int n = sc.nextInt();
        int Array[] = new int[n];
        System.out.println("Enter the Elements of Array: ");
        for (int i = 0; i < n; i++) {
            Array[i]=sc.nextInt();
        }
        System.out.print("Enter the Element to be searched:");
        int search = sc.nextInt();
        int found=0;
        int index=0;
        for (int i = 0; i < n; i++) {
            if(Array[i]==search){
                found = 1;
                index=i;
                break;
            }
        }
        if(found==1){
            System.out.print("Element is present at index "+ index);
        }else{
            System.out.print("Element not found ! ");
        }
    }
}
