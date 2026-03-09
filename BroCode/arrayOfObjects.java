public class arrayOfObjects {
    public static void main(String[] args) {
        
        // Car car1 = new Car("Mustang","Red");
        // Car car2 = new Car("BMW","Black");
        // Car car3 = new Car("Tata","White");

        Car[] cars = {new Car("Mustang","Red"),
                        new Car("BMW","Black"),
                        new Car("Tata","White")};

        // for(int i = 0 ; i < cars.length;i++){
        //     cars[i].drive();
        // }

        // Enhanced for loop 

        for(Car car : cars){
            car.drive();
            
        }
        for(Car car : cars){
            car.color = ("black");
            
        }
    }
}
