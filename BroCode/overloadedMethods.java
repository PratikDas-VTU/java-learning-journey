public class overloadedMethods {
    public static void main(String[] args) {

        // overloaded methods = methods that share the same name,
        // but different parameters
        // signature = name + parameters

    //----------------------------------------
    
    /*System.out.println(add(3,5));
    System.out.println(add(3,5,4));
    System.out.println(add(3,5,4,6));
    */

    //----------------------------------------

        
        System.out.println(type("plain"));
        System.out.println(type("plain","double egg"));
        System.out.println(type("plain","double egg","half boiled"));

        
}

    /* static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }
        */
//----------------------------------------

    static String type(String type){
        return type + " omlete";
    }
    static String type(String type,String count){
        return type +" "+ count + " omlete";
    }
    static String type(String type,String count, String boil){
        return type +" "+ count + " omlete" + " "+boil;
    }
    


}
