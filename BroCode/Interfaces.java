public class Interfaces {
    public static void main(String[] args) {
        
        // Interface = A blueprint for a class that          specifies a set of abstract methods
        // that implementing classes MUST define.
        // Supports multiple inheritance-like behavior.

        RabbitIT rabbit = new RabbitIT();
        HawkIT hawk = new HawkIT();
        FishIT fish = new FishIT();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();

    }
}
