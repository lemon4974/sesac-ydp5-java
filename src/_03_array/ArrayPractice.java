package _03_array;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        System.out.println("5개의 정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        System.out.println("평균은" + (double)(a+b+c+d+e)/5);


    }

}
