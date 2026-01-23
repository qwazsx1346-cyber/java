package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
      int num = (int) (Math.random() * 6.0) + 1;

      //case 1은 1인 경우 라는 뜻. break가 없으면 만날때까지 쭉 실행됨
      //순서는 상관없지만 break안써서 내가 원하는대로 값 출력하려면 순서 지켜주기.
      //default는 위에적은 case 뭐뭐 일 경우를 제외한 나머지 모든 수를 출력
//        switch (num) {
//          case 3:
//              System.out.println("3번이 나왔습니다.");
//              break;
//          case 1:
//              System.out.println("1번이 나왔습니다.");
//              break;
//          case 2:
//              System.out.println("2번이 나왔습니다.");
//              break;}
//            }
        System.out.println("num: " + num);
        switch (num) {
          case 1, 3, 5:
            System.out.println("홀수");
            break;
          case 2, 4, 6:
            System.out.println("짝수");
        }

    }
}
