public class CircleAbt extends ShapesAbt{

    double radius;

    CircleAbt(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius*radius;

    }
    
}
