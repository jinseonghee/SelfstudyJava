package sec05.exam01;

public class Car {
    //Field
    String model;
    int speed;

    //Constructor
    Car(String model) {
        this.model = model; // 위에 필드에 선언한 model이 this를 가리키고 오른쪽은 생성자에서 선언한 매개변수 model을 가리킨다.
        model = model; //이건 둘다 매개변수를 뜻한다.
    }

    //Method
    void setSpeed(int speed) {
        this.speed = speed; //즉, 외부로 부터 매개변수를 선언한 speed에 값을 받아 필드인 speed에 값을 저장한다는 뜻이다.
    }

    void run() {
        for (int i = 10; i <= 50; i += 10) {
            this.setSpeed(i); //this를 생략, 붙여도 상관없음 - 객체가 가지고 있는 메소드 라는 뜻
            System.out.println(this.model + "가 달립니다.(시속: " + speed + "km/h)");
        }
    }
}
