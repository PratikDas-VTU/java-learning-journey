public class Abstraction {
    public static void main(String[] args) {
        
        // abstract = Used to define abstract classes and methods.
        //    Abstraction is the process of hiding implementation details
        //     and showing only the essential features;
        //     Abstract classes CAN'T be instantiated directly
        //     Can contain 'abstract' methods (which must be implemented)
        //     Can contain 'concrete' methods (which are inherited)


        CircleAbt circle = new CircleAbt(3.0);
        TriangleAbt triangle = new TriangleAbt(3,4);
        RectangleAbt rectangle = new RectangleAbt(5,6);
        
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

    }
}
