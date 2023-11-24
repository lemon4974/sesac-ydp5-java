package _05_class._final;

public class Circle {

    // 필드
    public final double radius;

    private static final double PI = 3.141592;

    //생성자
    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea() {
        return  this.radius * this.radius * PI;

    }

    public double getRadius() {
        return radius;
    }


}
