package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        //Person 객체화
        Person p = new Person();

        //Calculable을 implements한 객체 주소값을 action메소드에
        //아규먼트로 보내준다. 10.0, 12.2 계산은 더하기로 한다.

        //Person클래스에 action함수가 이미 출력하는것을 적어놨으니 따로 system.out해줄필요 없음
        //action객체에는 Calculable타입,double타입,double타입 총 세개 적었으니 아래 호출도 타입에 맞게
        //적어줘야함.
        //아래 람다식은 새롭게 함수를 정의하여
        Calculable c1 = (x, y) -> x + y;
        p.action(c1, 10.0, 12.2);
    }
}
