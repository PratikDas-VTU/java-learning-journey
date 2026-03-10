public class toString {
    public static void main(String[] args) {
        
        // .toString() = Method inherited from the Object class.
        //     Used to return a string representation of an object.
        //     By default, it returns a hash code as a unique identifier.
        //     It can be overridden to provide meaningful details.

        CartoString car1 = new CartoString("BMW","M4",2024,"Black");
        CartoString car2 = new CartoString("Tata","Harrier",2023,"Green");

        System.out.println(car1);
        System.out.println(car2);



    }
}
