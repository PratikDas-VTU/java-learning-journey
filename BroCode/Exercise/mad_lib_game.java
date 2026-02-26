import java.util.*;
public class mad_lib_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Story Title: A Magical Day");

        System.out.println("It was a _______(1. Adjective) day, so I went to the zoo with my pet _______(2. Animal). When we got there, a zookeeper _______(3. Verb, past tense) a bunch of _______(4. Noun, plural). It was so _______(5. Adjective)! We then went to the _______(6. Place) and bought a _______(7. Noun). ");

        System.out.println("Fill the blanks one by one:");
        String adjective1 = sc.nextLine();
        String animal = sc.nextLine() ;
        String verb = sc.nextLine();
        String noun1 = sc.nextLine();
        String adjective2 = sc.nextLine();
        String Place = sc.nextLine();
        String noun2 = sc.nextLine();

        System.out.print("It was a " + adjective1 +"day, so I went to the zoo with my pet "+animal+". When we got there, a zookeeper "+verb+" a bunch of "+noun1+". It was so "+adjective2+"! We then went to the "+Place+" and bought a "+noun2+". ");

    }
}
