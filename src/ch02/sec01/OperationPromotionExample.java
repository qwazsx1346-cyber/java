package ch02.sec01;
//p.64
public class OperationPromotionExample {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;
        int result = n1 / n2;
        System.out.println("result: " + result);

        double n3 = 10;
        double n4 = 3;
        double result2 = n3 / n4;
        System.out.println("result2: " + result2);

        // result2 = (double) n1 / n2; double나누기 int는 타입이 다르기때문에 안되서 n2도 자동으로 d타입으로 바꿔서 계산해줌
        // System.out.println("result2: " + result2);

        char c1 = 'A';
        System.out.printf("%c - %d\n", c1, (int)c1);

        int i1 = c1 + 2;
        System.out.printf("%c - %d\n", (char)i1, i1); //char로 변환해서 67이라는 숫자를 문자로찍어라해서 C가 출력됨

        // 100%로 대문자로 시작하는게 타입이됨. 그 옆에 str은 레퍼런스 타입, 소문자로 시작하는건 8개밖에 없음.
        // "AC"는 객체, str은 객체의 주소값, String은 타입.
        String str = "AC"; //0:65, 1:67
        System.out.println("str:" + str);
    }
}
