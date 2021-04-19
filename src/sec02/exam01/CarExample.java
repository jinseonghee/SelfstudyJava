package sec02.exam01;

public class CarExample {

    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println("회사 명 : " + myCar.company);
        System.out.println("모델 명 : " + myCar.model);
        System.out.println("현재속도 : " + myCar.speed);

        myCar.speed = 50;
        System.out.println("변경된 현재속도 : " + myCar.speed);


    }
}
