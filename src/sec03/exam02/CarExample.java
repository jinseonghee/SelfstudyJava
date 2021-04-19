package sec03.exam02;

public class CarExample {

    public static void main(String[] args) {

        Car Car1 = new Car();
        System.out.println(Car1.company);
        System.out.println(Car1.model);
        System.out.println(Car1.color);

        System.out.println("---------------------");

        Car Car2 = new Car("그랜져");
        System.out.println(Car2.company);
        System.out.println(Car2.model);
        System.out.println(Car2.color);

        System.out.println("---------------------");

        Car Car3 = new Car("그랜져","실버");
        System.out.println(Car3.company);
        System.out.println(Car3.model);
        System.out.println(Car3.color);

        System.out.println("---------------------");

        Car Car4 = new Car("그랜져","실버", 350);
        System.out.println(Car4.company);
        System.out.println(Car4.model);
        System.out.println(Car4.color);
        System.out.println(Car4.maxSpeed);

    }
}
