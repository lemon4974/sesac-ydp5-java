package _05_class;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import _05_class.Rectangle;

public class RectangleEx {
    public static void main(String[] args) {

//        System.out.println("직사각형의 가로와 세로 길이를 공백으로 구분하여 입력해주세요.");
//        Scanner sc = new Scanner(System.in);
//
//        int w = sc.nextInt();
//        int h = sc.nextInt();
//        // rec1 변수가 Rectangle 객체 참조
//        Rectangle rec1 = new Rectangle(w, h);
//
//        //메소드 사용
//        System.out.println("직사각형의 넓이: " + rec1.area(w,h));



        // 클래스 실습 upgrade
        List<Rectangle> rectangles = new ArrayList<>();

        for(int i = 0 ; i < 5 ; i++){
            System.out.println("직사각형의 가로와 세로 길이를 공백으로 구분하여 입력해주세요.");
            Scanner sc = new Scanner(System.in);

            int w = sc.nextInt();
            int h = sc.nextInt();
            // rec1 변수가 Rectangle 객체 참조

            rectangles.add(new Rectangle(w,h));
        }

//        System.out.println("가로 길이는 : ", getWidth(rectangles));
//        System.out.println("세로 길이는 : ", getHeight(rectangles));
//        System.out.println("넓이는 : ", rectangles;






    }


}
