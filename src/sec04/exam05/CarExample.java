package sec04.exam05;

public class CarExample {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.keyTurnOn(); //return 값이 없음
        myCar.run();
        int speed = myCar.getSpeed(); //리턴값이 있는 값을, 변수에 저장해서 이 메인에서 다시 사용하고 싶을 경우, 타입과 변수를 선언해서 사용
        System.out.println("현재속도 :" + speed + "km/h");
    }
}
