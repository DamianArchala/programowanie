package vehicle;

public class Engine {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.color = "Czarny";
        car1.mark = "Audi";
        car1.speed = 50;
        car1.prezentacja();
        car2.color = "Biały";
        car2.mark = "BMW";
        car2.speed = 100;
        car2.prezentacja();
    }
}
