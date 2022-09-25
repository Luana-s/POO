package exercicio4;

public class Circles extends AbstractShape {
    private double radius;

    public Circles(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;

    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    @Override
    public double Area() {
        return Math.PI * Math.pow(radius, 2);
    }


    
}
