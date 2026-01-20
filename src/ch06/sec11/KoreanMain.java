package ch06.sec11;
/*기본 패키지는 적어도 .. 점 2개가 있어야된다.
모바일 앱!!
abc.def.jkl
웹도메인 google.com
        naver.com
com.naver.프로젝스명
com.google.프로젝트 명. 서브프로젝트 명
*/
import java.util.Scanner;
//java.util.을 임포트 하는이유는 매번 풀네임을 적지않기 위해..?

/*
public 무조건 접근 가능
protected default + 상속관계에서는
(default) private + 같은 패키지 안이면 접근 가능
privare 같은 클래스 안에서만 접근 가능
(클래스 외부에서는 접근할 수 없다.

*/
public class KoreanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Korean k1 = new Korean("990124-4112233", "김미정");
        k1.name = "김미향";
        // k1.ssn = "121212"; //상수는 변경할 수 없다.
        System.out.printf("nation: %s, ssn: %s, name: %s\n",k1.nation, k1.ssn, k1.name);

    }
}
