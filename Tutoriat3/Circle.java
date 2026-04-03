public class Circle implements ColorShape{

    double radius;
    public double area(){
        return Math.PI * radius * radius;
    };
    public double volume(){
        return area() * height;
    };

    public String color(){
        return "Red";
    };

    Circle(double radius){
        this.radius = radius;
    }

    // function from object class
    public String toString(){
        return "Circle: radius " + radius + " Color: " + color();
    };


}
