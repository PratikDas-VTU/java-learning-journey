public class Person {
    
    String first;
    String last;

    Person(String a , String b){
        this.first = a;
        this.last = b;

    }
    void showName(){
        System.out.println(this.first + " "+ this.last);
    }

}
