package _01_basic_syntax;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // 입력
        System.out.println("이름을 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.println("나이을 입력해주세요 : ");

        int age = sc.nextInt();

        System.out.println("안녕하세요! "+name+"("+age+"세)");
    }
}
