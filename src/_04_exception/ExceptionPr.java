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

        // 실습 1. 크기가 4인 배열, 인덱스가 범위를 벗어난 예외 처리
        int[] numbers = {1, 2, 3, 4};

        try {
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 범위를 벗어났습니다.");
        }


        // 실습 2. 배열 크기 입력 받아 배열 요소의 평균 계산

        try {

            System.out.print("배열의 크기를 입력해주세요 : ");
            Scanner sc = new Scanner(System.in);
            int arrLen = sc.nextInt();


            if (arrLen < 0 || arrLen > 20) {
                throw new IllegalArgumentException("Invalid array length");
            }

            int[] array = new int[arrLen];

            System.out.println("");
            System.out.println("20개 이하의 숫자 값을 공백으로 구분하여 입력해주세요 : ");
            for(int i = 0; i < 20; i++){
                array[i] = sc.nextInt();
            }
            int sum=0;

            for(int j = 0; j < arrLen; j++){
                sum +=array[j];
            }

            System.out.println("입력 받은 배열의 평균은 " + (double) sum/arrLen +" 입니다.");
        } catch (ArithmeticException e) {
            System.out.println("배열의 크기가 0인 경우, 평균을 구할 수 없습니다.");
        } catch (InputMismatchException e) {
            System.out.println("배열의 크기는 0보다 큰 자연수여야 합니다. 에러 메세지 : " + e.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 배열 길이: " + e.getMessage());
        }

        // 실습 3. 배열의 크기 입력 받아, 중복되는 경우 찾아 출력, 예외 처리


    }
}
