// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

// 메인 클래스 (시작 클래스) 정의
// - main 메서드 가정
// - 메인 클래스는 한 개! (Node에서 진입점 파일 역할)
public class Main {
    // 주석
    //  1. // 한줄
    //  2. /* 여러 줄 주석*/
    //  3. /** 문서 주석 */


    //main 메소드
    // - 자바 응용 프로그램의 실행 시작점
    // - 애플리케이션이 실행되려면 최소 1 개 존재해야 함.
    // - JVM은 세미콜론(;)으로 끝나는 문장을 하나의 명령문으로 인식. 필수
    public static void main(String[] args) { //String[] 다양한 스트링의 어레이를 받는다는 의미.
        //void 빈 것 정의
        System.out.print("Java Study Start! "+ "wow");
        System.out.println("Yeah!"); // ln은 개행처리까지 실행
        System.out.printf("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }
}
// 클라스 단위