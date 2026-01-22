package ch07.sec10;

public class PhoneMain {
    public static void main(String[] args) {
        //Phone p = new Phone(); 추상클래스는 객체화가 안됨
        Phone p = new SmartPhone();
        p.bell();
    }
}
