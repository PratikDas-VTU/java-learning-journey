public class Students {
    String name = "Tom";
    int age;
    double gpa;
    boolean isEnrolled;

    // constructors
    Students(String a, int b, double c) {
        this.name = a;
        this.age = b;
        this.gpa = c;
        this.isEnrolled = true;
    }

    void Study(){
        System.out.println(this.name + " is studying");
    }

}
