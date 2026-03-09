public class StudentSuper extends Person{
    
    double gpa;

    StudentSuper(String first, String last, double gpa){
        super(first,last);
        this.gpa = gpa;
    }
    
    void showGPA(){
        System.out.println(this.first + "'s GPA is: "+ this.gpa);
    }
    
}
