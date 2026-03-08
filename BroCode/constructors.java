public class constructors {
    public static void main(String[] args) {
        

        // constructor = A special method to initialize objects
        // You can pass arguments to a constructor
        // and set up initial values

        Students students1 = new Students("Pratik",20,9.56);
        Students students2 = new Students("Lakshya",19,7.5);
        Students students3 = new Students("Das",29,8.5);

        System.out.println(students1.name);
        System.out.println(students1.age);
        System.out.println(students1.gpa);
        System.out.println(students1.isEnrolled);
        students1.Study();
        
        System.out.println(students2.name);
        System.out.println(students2.age);
        System.out.println(students2.gpa);
        System.out.println(students2.isEnrolled);
        students2.Study();

        System.out.println(students3.name);
        System.out.println(students3.age);
        System.out.println(students3.gpa);
        System.out.println(students3.isEnrolled);
        students3.Study();

    }
}
