import java.util.*;

public class diceRoll {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      Random random = new Random();
      int numOfdice;
      int total = 0;

      System.out.print("Enter the number to roll:");
      numOfdice = sc.nextInt();

      if (numOfdice > 0) {

         for (int i = 0; i < numOfdice; i++) {

            int roll = random.nextInt(1, 7);
            printDie(roll);
            System.out.println("You rolled: " + roll);
            total += roll;
         }
         System.out.println("Total: " + total);
      } else {
         System.out.println("Number of dice must be grater than 0 .");
      }

      sc.close();
   }

   static void printDie(int roll){
      String dice1 = """ 
       -------
      |       |
      |   o   |
      |       |
       -------
       """;
      String dice2 = """ 
       -------
      | o     |
      |       |
      |     o |
       -------
       """;
      String dice3 = """ 
       -------
      | o     |
      |   o   |
      |     o |
       -------
       """;
      String dice4 = """ 
       -------
      | o   o |
      |       |
      | o   o |
       -------
       """;
      String dice5 = """ 
       -------
      | o   o |
      |   o   |
      | o   o |
       -------
       """;
      String dice6 = """ 
       -------
      | o   o |
      | o   o |
      | o   o |
       -------
       """;
      switch(roll){
         case 1 -> System.out.print(dice1);
         case 2 -> System.out.print(dice2);
         case 3 -> System.out.print(dice3);
         case 4 -> System.out.print(dice4);
         case 5 -> System.out.print(dice5);
         case 6 -> System.out.print(dice6);
         default -> System.out.println("Invalid Roll !!");
      }
   }
}
