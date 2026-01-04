import java.util.*;
public class TwoDArrays {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of Columns: ");
        int c = sc.nextInt();

        int [][] array = new int[r][c];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Thus, The 2D Array Matrix is:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(array[i][j]+" ") ;
            }
            System.out.println();
        }
         
    }
}
