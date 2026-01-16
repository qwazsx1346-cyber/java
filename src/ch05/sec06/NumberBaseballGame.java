package ch05.sec06;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
      //System.out.println("args[0]: " + args[0]);
      //어떤 숫자가 역할을 하면 매직넘버라고 부르며 보통 상수/변수로 관리한다.
      final int COUNT = args.length == 1 ? Integer.parseInt(args[0]) : 3; //자바에서 상수 만드는 방법(final 붙이면 된다.)
      System.out.printf("-------- 숫자 야구 게임 (%d) --------\n" , COUNT);
      Scanner scanner = new Scanner(System.in);

      //맞춰야되는 숫자들
      int[] questions = new int[COUNT];

      for(int i=0; i<questions.length; i++) { //questions 배열의 길이만큼 값을 대입하는 담당
          questions[i] = (int)( Math.random() * 9.0 ) + 1; //그 배열의 각 방마다 랜덤한 숫자를 넣어줌
          for(int k=0; k<i; k++) { //i=0일 때는 k=0과 k<i가 있기때문에 for문이 아에 동작을 안함
             if(questions[k] == questions[i]) { //그렇기때문에 0번방에는 이미 랜덤값이 들어간상태로 전체for이 이제서야 동작
               i--;                             //i가 1일 때 k는 0부터 시작해서 0번방과 1번방의 값을 비교하여
               break;                           //1번방의 값과 0번방의 값이 같으면 i를 -- 하여 다시 랜덤값 투입
             }                                   //그러고 값을 비교하여 다르면 break를 만나서 빠져나오고 다음방에 랜덤값 투입
          }
      }
      //System.out.println(Arrays.toString(questions)); //questions에 랜덤숫자 어떤게 들어가는지 출력해줌
      int tryCount = 0;
      while(true) {
        //숫자 3개를 입력받는다.
        System.out.println("answer >> ");
        String answer = scanner.nextLine();
        //System.out.println(answer);

        //answer 문자열을 이용하여 " " 기준으로 값들을 쪼개서 배열로 만들고 싶다.
        String[] strAnswers = answer.split(" ");
        int[] answers = new int[strAnswers.length];
        for(int i=0; i< strAnswers.length; i++) {
          answers[i] = Integer.parseInt(strAnswers[i]);
        }
        //System.out.println(Arrays.toString(answers));

        int s = 0, b = 0;

        for(int i=0; i<questions.length; i++) {
          for(int k=0; k<answers.length; k++) {
            if(questions[i] == answers[k]) {
              if(i == k) { //같은자리에 같은숫자면
                s++;      //s를 ++
              } else {    //그렇지 않으면
                b++;      //b를 ++
              }
            }
          }
        }
        System.out.printf("S: %d, B: %d, O:%d\n", s, b, (COUNT - (s + b)));

        tryCount++;
        //while문을 빠져나가야 하는 조건
        if(s == COUNT) {
            break;
        }
      }
      System.out.printf("-- 끝 -- || trycount: %d\n", tryCount);
    }
}
