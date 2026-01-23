package ch04.sec03;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        //스위치 표현식 => 결과값을 리턴해야할 때 좋다.
        //스위치 표현식에는 default 필수
        int num = (int)(Math.random() * 13.0) + 1;
        System.out.println("num: " + num);
        //중괄호뒤에는 ; 를 안붙이지만 스위치 표현식에서는 붙여야함
        String denomination = switch(num) {
            case 1 -> "A";
            case 11 -> { yield "J"; }
            case 12 -> {
              int a = 10;
              int b = 20; //이런식으로 내부에서 연산하여 값을 리턴하려면 중괄호를 열어서 연산 후
                          //yield를 사용
              yield "Q"; //결과를 한줄로 연산 가능하면 {yield ""} 를 생략가능하다.
                          //스위치 표현식의 리턴타입은 yield 이다.
            }
            case 13 -> "K";
            default -> String.valueOf(num); //정수 -> 문자열로 바꿔주는것
        };
        System.out.println("denomination: " + denomination);
    }
}
