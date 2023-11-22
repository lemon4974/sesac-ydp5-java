package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPr {

    // 에러 발생 여지가 있는 메서드들
    public static String divide(int x, int y) {
        return x + " / " + y + " = " + (x / y);
    }

    public static int getLength(String str) {
        return str.length();
    }

    public static int getValueByIdx(int[] arr, int idx) {
        return arr[idx];
    }

    public static void main(String[] args) {

        // 실습 1.
        int[] numbers = {1, 2, 3, 4};

        try {
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 범위를 벗어났습니다.");
        }


        // 실습 2.

//        Scanner sc = new Scanner(System.in);
//
//        try {
//            System.out.println("배열의 크기를 입력하세요: ");
//            int number = sc.nextInt();
//            System.out.println("입력한 정수 : " + number);
//        } catch (InputMismatchException e) {
//            System.out.println("에러 발생 >> " + e.toString());
//        }

        // 실습 3.
    }
}
