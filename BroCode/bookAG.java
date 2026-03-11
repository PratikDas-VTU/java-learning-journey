public class bookAG {
    
    String title;
    int pages;

    bookAG(String title,int pages){
        this.title = title;
        this.pages = pages;

    }
    String displayInfo(){
        return this.title + " (" + this.pages + " pages)"; 
    }
}
