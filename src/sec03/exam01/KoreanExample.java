package sec03.exam01;

public class KoreanExample {
    public static void main(String[] args) {

        Korean K1 = new Korean("박자바","012345-67890");
        System.out.println(K1.name);
        System.out.println(K1.ssn);
        System.out.println(K1.nation);

        System.out.println("------------------------");

        Korean K2 = new Korean("김자바", "12345-78899");
        System.out.println(K2.name);
        System.out.println(K2.ssn);
        System.out.println(K2.nation);

    }
}
