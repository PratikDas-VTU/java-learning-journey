import java.util.*;
public class arrayListing {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOfFood = sc.nextInt();
        sc.nextLine();

        for(int i = 1 ; i <=numOfFood;i++){
            System.out.print("Enter the food: ");
            String food = sc.nextLine();
            foods.add(food);
        }

        System.out.println(foods);


        sc.close();
    }
}
