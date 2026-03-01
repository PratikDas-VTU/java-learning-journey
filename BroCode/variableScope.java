public class variableScope {
    
    static String var = "not-local";
    public static void main(String[] args) {
        
       // String var = "local1"; // LOCAL
        System.out.println("local1 : " + var);
        System.out.print("local2 : ");
        localMethod();

    }

    static void localMethod(){

        String var = "local2"; // LOCAL
        System.out.println(var);

    }
}
