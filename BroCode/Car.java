// car is an object
public class Car {
    
    // these are called attributes
    String name = "BMW";
    String Model = "M4";
    int year = 2024;
    String color = "black";
    double price = 1000000.0;
    boolean carRunning = false;
    
    
    // methods
    void start(){
        System.out.println("Engine Starts !!");
        System.out.println(carRunning = true);
    }
    void stop(){
        System.out.println("Engine Stops !!");
    }

    Car(String model,String color){
        this.Model = model;
        this.color = color;
    }
    void drive(){
        System.out.println("You drive the " + this.color + " " + this.Model);
    }
}
