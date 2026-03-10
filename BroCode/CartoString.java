public class CartoString {
    String make;
    String model;
    int year;
    String color;

    CartoString(String make,String model,int year,String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.model + " " + this.color + " " + this.year + " " + this.make;
    }
}
