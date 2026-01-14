package ch03.sec01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = 100;
        //x = x * -1;
        x = -x; //변수앞에 - 를 붙이면 * -1을 해준것과 같음
        System.out.println("1. x: " + x);
        System.out.println("2. x: " + -x);
        // x = -x; 이렇게 선언해줘야 아래 식의 값도 달라짐
        System.out.println("3. x: " + x); //x값은 바뀐적이 없기때문에 8번라인에있는 x값과 똑같이 -100이 나옴

    }
}
