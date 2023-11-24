package _05_class._access_modifier._pack05;

public class CafeMenuEx {
    public static void main(String[] args) {
        CafeMenu m1 = new CafeMenu("자몽허니블랙티");
        CafeMenu m2 = new CafeMenu(5000);

//        m1.name = "바꿀 이름" 불가
        m1.setName("진짜자몽허니블랙티");
        m1.price = 5500;
        System.out.printf("%s의 가격 : %d %n", m1.getName(), m1.getPrice());


        m2.setName("바닐라크림콜드브루");
        m2.setPrice(9000);
        System.out.printf("%s의 가격 : %d %n", m2.getName(), m2.getPrice());




    }
}
