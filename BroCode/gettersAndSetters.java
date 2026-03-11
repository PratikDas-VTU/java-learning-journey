public class gettersAndSetters {
    public static void main(String[] args) {
        

        // They help protect object data and add rules for accessing or modifying them
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        carGandS car = new carGandS("Audi", "Blue", 2500000);

        car.setColor("Blue");
        car.setPrice(550020);
        
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getPrice());
    }
}
