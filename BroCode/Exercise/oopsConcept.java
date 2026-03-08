public class oopsConcept {
    public static void main(String[] args) {
        // Object = An entity that holds data (attributes)
        // and can perform actions (methods)
        // It is a reference data type

        // calling a object
        Car car = new Car();

        car.year = 2025; // we can alter the attributes also

        System.out.println(car.name); // using .(dot) operator 
        System.out.println(car.Model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.carRunning);

        // calling methonds
        car.start();
        car.stop();
    }
}
