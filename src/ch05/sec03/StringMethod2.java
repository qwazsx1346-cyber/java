package ch05.sec03;

public class StringMethod2 {
    public static void main(String[] args) {
        //문자열 잘라내기 substring 메소드 이용, 방법 2가지
        //첫번째, 아규먼트 1개(정수) 이용, 정수(index)문자부터 마지막 문자까지의 문자열을 잘라낸다.
        String oldStr1 = "abcdefghijklmnopqrstu";
        String newStr1 = oldStr1.substring(10); //방번호10번 부터 마지막문자까지 잘라내서 씀
        System.out.println("oldStr1: " + oldStr1);
        System.out.println("newStr1: " + newStr1); //klmnopqrstu 가 출력됨

        //두번째, 아규먼트 2개(둘 다 정수) 이용.
        //둘 다 index값인데 (시작index, 종료index)이고 종료indx방번호 그 전 문자까지 자른다.
        String newStr2 = oldStr1.substring(10, 13); //(a, b) b-a하면 몇자리가 나오는지 알 수 있음
        System.out.println("newStr2: " + newStr2);

        //간단미션
        String ssn = "880815-1234567";
        String firstNum = ssn.substring(0, 6);
        String secondNum = ssn.substring(7);
        System.out.println("firstNum: " + firstNum);
        System.out.println("secondNum: " + secondNum);

        //문자열 안에서 문자열 찾기, -1출력은 그런문자열이 없다는 뜻
        //찾으면 첫번째 문자의 index값을 리턴한다. h를 넣어도 7, hi를 넣어도 7이 출력됨.
        int idx = oldStr1.indexOf("h");
        System.out.println("idx: " + idx); //7

        int idx2 = ssn.indexOf("5"); //5, indexOf는 좌측에서 우측으로 값을 찾음
        System.out.println("idx2: " + idx2);

        int idx3 = ssn.lastIndexOf("5"); // lastIndexOf는 우측에서 좌측으로 값을 찾음
        System.out.println("idx3: " + idx3);

        //문자열이 포함되어 있는지 찾을 때, contains도 사용가능
        if(ssn.contains("88")) {
            System.out.println("ssn에 88이 있음");
        } else {
            System.out.println("ssn에 88이 없음");
        }

        String board = "번호,제목,내용,성명";
        String[] arr = board.split(","); // ,값 기준으로 값들을 나누라는 뜻
        System.out.println("arr: " + arr);
        for(int i=0; i<arr.length; i++) {
            System.out.printf("arr[%d]: %s\n", i, arr[i]);
        }
    }
}
