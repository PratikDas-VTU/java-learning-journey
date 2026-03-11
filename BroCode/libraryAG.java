public class libraryAG {

    String name;
    int year;

    bookAG[] books;

    libraryAG(String name,int year,bookAG[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + this. year + " " + this.name);
        System.out.println("Books Available: ");
        for(bookAG book : books){
            System.out.println(book.displayInfo());
        }
    }
    
}
