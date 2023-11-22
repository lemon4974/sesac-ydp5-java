package _02_control_statement;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // 입력
        System.out.println("나이를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);

        // 조건문 실습 1
        int age = sc.nextInt();

        if (age < 8){
            System.out.println("유아");
        } else if (age < 14){
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
            
        }

        // 조건문 실습 2
        System.out.println("이름를 입력하세요 : ");
        String name = sc.next();

        if (name.equals("홍길동")){
            System.out.println("남자");
        } else if (name.equals("성춘향")){
            System.out.println("여자");
        } else {
            System.out.println("모르겠어요");
        }


        // 반복문 실습
        System.out.println("숫자를 입력하세요 : ");
        int num = sc.nextInt();
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= num);
        System.out.println();
    }
}
