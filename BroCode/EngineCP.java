public class EngineCP {

    String type;

    EngineCP(String type){
        this.type = type;
    }
    void start(){
        System.out.println("You start the " + this.type + " engine");
    }
}
