package _05_class._abstract;

public class ShapeEx {

    public static void main(String[] args ) {
        Circle c = new Circle("blue");
        Square s = new Square("yellow");

        c.start(); // 일반 메소드
        c.draw(); // 추상 메소드 구현
        System.out.println("원의 색상은 " + c.getColor());

        s.start(); // 일반 메소드
        s.draw(); // 추상 메소드 구현
        System.out.println("사각형의 색상은 " + s.getColor());
    }


}
