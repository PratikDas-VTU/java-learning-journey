public class ProductGN <T,U>{
    T item;
    U price;

    ProductGN(T item , U price){
      this.item = item;
      this.price = price;  
    }
    public T getItem(){
        return this.item;
    }
    public U getPrice(){
        return this.price;
    }
}
