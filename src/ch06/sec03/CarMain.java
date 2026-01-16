package ch06.sec03;

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car("그랜저", "검정", 300);
        c1.introduceMySelf();

        Car c2 = new Car("K8");
        c2.introduceMySelf();
        c2.model = "제네시스";
        c2.color = "그레이";
        c2.maxSpeed = 800;
        c2.introduceMySelf();
    }
}
