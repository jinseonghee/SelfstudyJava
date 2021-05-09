package sec04.exam04;

public class CalculatorExample {

    public static void main(String[] args) {
        Calculator myCalc = new Calculator(); //다른 클래스에서 불러오기 떄문에 객체를 만들고,
        myCalc.execute(); //참조변수 myCalc를 통해서 execute를 실행해야 한다.(만약 메소드에 return 값이 있으면 메소드 앞에 타입과 변수를 써줘야 함)
    }

}
