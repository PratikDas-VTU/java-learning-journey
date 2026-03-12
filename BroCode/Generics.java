
public class Generics {
    public static void main(String[] args) {
        
        // Generics = A concept where you can write a class,interface, or metthod
        // that is compatible with different data types.
        // <T> type parameter (placeholder that gets replaced with a real type) <String> type argument (specifies the type)
            
        ProductGN<String,Double> product1 = new ProductGN<>("Apple", 20.20); 
        ProductGN<String,Double> product2 = new ProductGN<>("Ticket", 60.20); 
        
        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
