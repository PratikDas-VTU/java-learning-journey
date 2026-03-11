public class TriangleAbt extends ShapesAbt{

    double base;
    double height;

    TriangleAbt(double base,double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return 0.5*base*height;

    }
    
}
