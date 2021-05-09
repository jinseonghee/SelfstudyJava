package sec05.exam02;

public class CalculatorExample {

    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator.pi; //정적필드인 pi는 클래스.필드로 가져와서 사용
        int result2 = Calculator.plus(10, 5); //정적 메소드인 Plus, minus도 클래스.메소드로 가져와서 사용
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result1);
        System.out.println("result3 : " + result1);
    }
}
