package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPr {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("문자를 입력해주세요. **exit: 종료**");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                for (String str : arrayList) {
                    System.out.print(str + " ");
                }
                break;

            } else {
                arrayList.add(input);

            }

        }
    }
}