package ch05.sec03;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] arr = null; //null은 주소값 없다는 의미

        // int len = arr.length;
        // NPE 발생, 가리키는 객체가 없는데 속성값 읽기 혹은 메소드 호출하면 예외발생한다.

        String input = null;
        //String input = ""; 빈 문자열도 주소값이 저장된다.

        //주소값이 이미 있는 상태인 "3"을 넣어줌으로서 출력이 안전하게 잘 됨.
        //input과 "3"위치를 바꿔도 되지만 에러가 터질 가능성이 있음.
        //문자열 값 비교는 .equals로 해야함
        if("3".equals(input)) {
            System.out.println("정지");
        }
        System.out.println("끝!");
    }
}
