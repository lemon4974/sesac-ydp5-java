package _02_control_statement;

public class MethodOverloadingPr {

    public static void main(String[] args) {
        // static 이 없을 경우 객체를 생성해야 써야 함.
        //  1. 객체를 생성
        MethodOverloadingPr ol = new MethodOverloadingPr();

        // 2. 객체의 메소드 사용
        System.out.println(ol.area(5.0));
        System.out.println(ol.area(10.0, 20.8));
        System.out.println(ol.area(1,4));


    }

    public double area(double a){
        return Math.PI*(a*a);
    }

    public int area(int a, int b){
        return a * b;
    }

    public double area(double a, double b){
        return a * b / 2;
    }


}
