public class methodOverriding {
    public static void main(String[] args) {
        
        // Method overriding = When a subclass provides its own
        // implementation of a method that is already defined.
        // Allows for code reusability and give specific implementations.

        DogMO dog = new DogMO();
        CatMO cat = new CatMO();
        FishMO fish = new FishMO();

        dog.move();
        cat.move();
        fish.move();

    }
}
