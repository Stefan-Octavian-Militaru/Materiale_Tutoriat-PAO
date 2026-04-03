public class Rectangle implements Shape{
    double length;
    double width;

    public double area(){
        return length * width;
    };
    public double volume(){
        return area() * height;
    };

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public String toString(){
        return "Rectangle: length " + length + " width " + width;
    }
}