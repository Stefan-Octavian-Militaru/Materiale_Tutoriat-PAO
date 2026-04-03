public class Triangle implements Shape {
    double triHeight;
    double base;

    public double area(){
        return triHeight * base / 2;
    };

    public double volume(){
        return area() * triHeight;
    };

    Triangle(double triHeight, double base){
        this.triHeight = triHeight;
        this.base = base;

    }

    public String toString(){
        return "Triangle: height " + triHeight + " base: " + base;
    }


}
