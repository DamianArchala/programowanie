package vehicle;

public class Car {
    String mark;
    String color;
    int speed;

    void prezentacja(){
        System.out.println("Ten samochód jest " + color + ", marki "+mark+", o prędkości "+speed+" km/h.");
    }
}
