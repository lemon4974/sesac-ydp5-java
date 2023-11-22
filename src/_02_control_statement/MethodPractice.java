package _02_control_statement;

import java.util.Scanner;

public class MethodPractice {

    public static void main(String[] args) {
        System.out.println("숫자 두 개를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(add(a,b));
        System.out.println(sub(a,b));
        System.out.println(div(a,b));
        System.out.println(mul(a,b));

    }

    public static double add(double a, double b){
        return a + b;
    }

    public static double sub(double a, double b){
        return a - b;
    }

    public static double div(double a, double b){
        return a / b;
    }

    public  static double mul (double a, double b){
        return a * b;
    }
}
