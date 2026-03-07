import java.util.*;

public class slotMachine {
    public static void main(String[] args) {

        // declare variables
        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String playAgain;
        String row[];

        // display welcoming message
        System.out.println("***************************");
        System.out.println(" Welcome to Java Slots !! ");
        System.out.println("Systems: $ & @ # %");
        System.out.println("***************************");

        // play if balance > 0
        while (balance > 0) {
            System.out.println("Current balance : " + balance);
            // enter bet amount
            System.out.print("Place your bet Amount: ");
            bet = sc.nextInt();
            sc.nextLine();
            // verify if bet > balance
            if (bet > balance) {
                System.out.println("Insufficient FUNDS !! ");
                continue;
            } // verify if bet > 0
            else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            } // substract bet from balane
            else {
                balance -= bet;

            }
            // spin row
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);

            // get payout
            payout = getPayout(row, bet);
            if(payout>0){
                System.out.println("You won "+payout);
                balance+=payout;
            }else{
                System.out.println("Sorry You lost this round !");
            }
            // ask to play again
            System.out.print("Do you want to play again ? (Y/N):");
            playAgain = sc.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }
        }

        
        // exit message
        System.out.println("Game Over ! Your final balance is : "+balance);
        sc.close();
    }

    static String[] spinRow() {

        String[] symbols = { "$", "&", "@", "#", "%" };
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    // print row
    static void printRow(String[] row) {
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "$" -> bet * 3;
                case "&" -> bet * 4;
                case "@" -> bet * 5;
                case "#" -> bet * 10;
                case "%" -> bet * 20;
                default -> 0;
            };
        } else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "$" -> bet * 2;
                case "&" -> bet * 3;
                case "@" -> bet * 4;
                case "#" -> bet * 5;
                case "%" -> bet * 10;
                default -> 0;
            };
        }else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "$" -> bet * 2;
                case "&" -> bet * 3;
                case "@" -> bet * 4;
                case "#" -> bet * 5;
                case "%" -> bet * 10;
                default -> 0;
            };
        }

        return 0;
    }
}
