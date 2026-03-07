import java.util.Scanner;

public class quizArray {
    public static void main(String[] args) {
        
        // JAVA QUIZ GAME

        // QUESTIONS array[][]
        String questions[] ={"Which is an end Point Device ?",
                            "What does LAN stand for?",
                            "Which device is used to connect two dissimilar types of networks",
                            "What is the length of an IPv4 address?",
                            "Which protocol is primarily used for browsing data on the internet"};

        // OPTIONS array[][]
        String options[][] = {  {"1. Router", "2. Switch", "3. Printer", "4. Hub"},
                                {"1. Local Area Network", "2. Long Area Network","3. Logical Area Network","4. Linked Area Network"},
                                {"1. Hub","2. Switch","3. Bridge","4. Gateway"},
                                {"1. 16 bits","2. 32 bits","3. 64 bits","4. 128 bits"},
                                {"1. FTP","2. TFTP","3. HTTP","4. SMTP"}};

        // DECLARE VARIABLES 
        //  Correct Answers
        int answers[] = {3,1,4,2,3};
        int score = 0;
        int guess ;

        Scanner sc = new Scanner(System.in);

        // WELCOME MESSAGE
        System.out.println("**********************");
        System.out.println("Welcome To the QUIZ !");
        System.out.println("**********************");


        
        // QUESTION (Loop)
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            //      OPTIONS
            for (String option : options[i]){
                System.out.println(option);

            }
            //      GET GUESS FROM USER
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            //      CHECK OUR GUESS
            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********"); 
                score++;
            }
            else {
                System.out.println("********");
                System.out.println("WRONG!");
                System.out.println("********");
            }
        }
        
        
        
        // DISPLAY FINAL SCORE
        System.out.println("Your Final score out of " + questions.length + " is : "+ score);


        sc.close();
    }
}
