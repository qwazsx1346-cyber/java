package ch02.sec13;

import java.util.Scanner;

//p.73
public class ScannerExample {
    public static void main(String[] args) {
      //콘솔에서 사용자 입력을 받을 수 있게 도와주는 객체
      Scanner scanner = new Scanner(System.in);

      //출력창에 10 입력시 문자열 10을 strX로 넘겨주고 그 문자열10을 int로하여 숫자로 변환 후 출력
      System.out.print("x 값 입력: ");
      int x = scanner.nextInt(); // "12"

      System.out.print("y 값 입력: ");
      int y = scanner.nextInt();

      int result = x + y;
      System.out.printf( "%d + %d = %d\n", x, y, result );

      while (true) {
          System.out.print("문자열 입력: ");
          String data = scanner.next();
          if( data.equals("q") ) { //if문에 올 수 있는 타입은 bloone타입 밖에 없음
              break;
          }
          System.out.println("출력 문자열: " + data);
          System.out.println(); //개행처리
      }

      System.out.println("-- 끝 --");
    }
}
