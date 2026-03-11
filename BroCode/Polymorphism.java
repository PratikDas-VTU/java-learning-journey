public class Polymorphism {
    public static void main(String[] args) {
        

        // Polymorphism = "POLY" = "MANY"
                    // "MORPH" = "SHAPE"
                    // Objects can identify as other objects.
                    // Objects can be treated as objects of a common superclass.

        CarPM car = new CarPM();
        BikePM bike = new BikePM();
        BoatPM boat = new BoatPM();

        car.go();
        bike.go();
        boat.go();

        Vehicle[] vehicles = {car,bike,boat};
        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }

    }
}
