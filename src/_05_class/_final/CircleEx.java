package _05_class._final;

import java.util.Scanner;

public class CircleEx {
    public static void main(String[] args) {
        System.out.print("원의 반지름을 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();


        Circle circle = new Circle(radius);

        System.out.println("원의 반지름: " + radius);
        System.out.println("원의 넓이: " + circle.calculateArea());
    }
}
