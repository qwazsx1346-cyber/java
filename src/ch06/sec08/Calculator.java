package ch06.sec08;

public class Calculator {
    public void powerOn() {
        System.out.println("전원 ON");
    }

    public void powerOff() {
        System.out.println("전원 OFF");
    }

    //메소드에서 받고싶은 타입은 앞에 적어줌, 하나하나당 타입 다 적어주기
    public int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    public double divide(int n1, int n2) {
            return (double) n1 / n2;
    }
}
