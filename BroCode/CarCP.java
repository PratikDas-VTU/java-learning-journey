public class CarCP {
    String model;
    int year;
    EngineCP engine;

    CarCP(String model,int year,String engineType){
        this.model = model;
        this.year = year;
        this.engine = new EngineCP(engineType);
    }
    void start(){
        this. engine.start();
        System. out.println("The " + this.model + " is running");

    }
}
