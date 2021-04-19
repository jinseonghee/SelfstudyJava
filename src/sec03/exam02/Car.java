package sec03.exam02;

public class Car {

    //Field
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //Constructor
    Car() {

    }

    Car(String model){
        this(model,null,0);
        //this.model = model;
    }

    Car(String model, String color){

        this(model, color,0);
        //this.model = model;
        //this.color = color;
    }
    Car(String model, String color, int maxSpeed){

        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
