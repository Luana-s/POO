
public class Rectangle {
    private double width;
    private double height;
    


    public  double getWidth(){
       return width;
    }

    public void setWidth(double width) {
        this.width=width;
    }

    public  double getHeight(){
        return height;
     }

    public void setHeight(double height) {
        this.height=height;
    }
    
    

    public double Area(){
        return  getWidth() * getHeight();
          
        
    }

    public double Perimeter(){
        return (2*getWidth() + 2*getHeight());
        
        
    }

    public double Diagonal(){
        return  Math.sqrt((Math.pow(getWidth(),2)) + (Math.pow(getHeight(),2)));
        
        
    }

 
}
