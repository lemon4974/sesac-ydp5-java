package _05_class._abstract;

// 구체적인 클래스 - 도형 (원)

public class Circle extends Shape {
    public Circle(String color) {
        super(color); // 부모 생성자 호출
    }
 void draw() { //추상 메소드 구현
         System.out.println("원을 그리는 중입니다...");
     }

}
