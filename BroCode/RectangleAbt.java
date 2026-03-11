public class RectangleAbt extends ShapesAbt{

    double length;
    double width;

    RectangleAbt(double length,double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length*width;

    }
    
}
