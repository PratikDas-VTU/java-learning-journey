public class Super {
    public static void main(String[] args) {
        
        // super = Refers to the parent class (subclass <- superclass)
        //  Used in constructors and method overriding
        //  Calls the parent constructor to initialize attributes

        Person person = new Person("Tom","Holland");
        StudentSuper student = new StudentSuper("Pratik","Das",9.56);
        Employee employee = new Employee("Lakshya", "Beta", 580000);

        person.showName();

        student.showName();
        student.showGPA();

        employee.showSalary();

    }

}
