package _05_class._abstract;

public abstract class Student {
    String name;
    String school;
    int age;
    int studentNum;

    public Student(String name, String school, int age, int studentNum) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.studentNum = studentNum;

    }




    abstract void todo();

    public void getInfo(){
        System.out.println("===="+ name + " 학생의 정보====");
        System.out.println("학교: " + school);
        System.out.println("나이: " + age);
        System.out.println("학번: " + studentNum);
    }


}
