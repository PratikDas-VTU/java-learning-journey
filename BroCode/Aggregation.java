public class Aggregation {
    public static void main(String[] args) {
        
        // Aggregation = Represents a "has-a" relationship between objects.
        // One object contains another object as part of its structure,
        // but the contained object/s can exist independently.

        

        bookAG book1 = new bookAG("Ethical Hacking", 200);
        bookAG book2 = new bookAG("Pentesting", 153);
        bookAG book3 = new bookAG("Java", 69);

        bookAG[] books = {book1,book2,book3};

        libraryAG library = new libraryAG("Central Public library", 1997, books);

        library.displayInfo();

    }
}
