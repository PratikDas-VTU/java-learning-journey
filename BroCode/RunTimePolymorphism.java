// Also called as dynamic polymorphism
import java.util.*;
public class RunTimePolymorphism {
    public static void main(String[] args) {


        // Runtime polymorphism = When the method that gets executed is decided
        // at runtime based on the actual type of the object.
        Scanner sc = new Scanner(System.in);

        AnimalDP animal;

        System.out.print("Would you like a dog or a cat? ( 1 = Dog or 2 = Cat): ");
        int choice = sc.nextInt();

        if(choice == 1){
            animal = new dogDP();
            animal.speak();
        } else if(choice == 2){
            animal = new catDP();
            animal.speak();
        } else {
            System.out.println("Invalid choice");
        }
        

       sc.close(); 
    }
}
