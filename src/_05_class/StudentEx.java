package _05_class;

public class StudentEx {
    public static void main(String[] args) {
        // std1 변수가 Student 객체 참조
        Student std1 = new Student("김새싹", 1, 2023133001);
        Student std2 = new Student("박지은", 2, 2023133002);
        Student std3 = new Student("이은지", 3, 2023133003);

//        System.out.println(std1);

        // 메소드 사용
//        std1.goToSchool();
//        std1.study("Java 프로그래밍");
//        System.out.println(std1.getGrade() + "학년");
//        System.out.println(std1.getTestResult(100));

        displayInfo(std1);
        displayInfo(std2);
        displayInfo(std3);
        System.out.println("총 학생 수는 " + Student.totalStudents+"명 입니다. ");
    }


    private static void displayInfo(Student std) {
        System.out.println("===  학생 정보  ===");
        System.out.println("이름: "+std.name);
        System.out.println("학번: "+std.studentID);
        System.out.println("학년: "+std.grade);
        System.out.println();

    }

}
