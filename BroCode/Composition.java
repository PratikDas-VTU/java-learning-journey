public class Composition {
    public static void main(String[] args) {
        // Composition = Represents a "part-of" relationship between objects.
        // For example, an Engine is "part of" a Car.
        // Allows complex objects to be constructed from smaller objects.

        CarCP car = new CarCP("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}
