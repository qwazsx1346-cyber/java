package ch02.sec01;

public class UsingPrintf {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 22;
        double height = 176.5;
        char bloodType = 'A';
        boolean isMan = true;

        //printf는 JS의 `${변수명}` 이러한 기능을 쓰는 것.
        //즉, 문자열 사이에 변수의 값을 삽입하는 방법.

        //println과 위 변수들을 이용하여 문장을 완성하시오.
        //문장: 홍길동의 나이는 22세이며, 키는 176.5cm이고 혈액형은 A형이고 성별은 남자인가? true
        System.out.println(name + "의 나이는 " + age + "세이며, 키는 " + height + "cm 이고 혈액형은 " + bloodType + "형이고 성별은 남자인가? " + isMan);

        System.out.printf("%s의 나이는 %d세이며, 키는 %.1fcm 이고 혈액형은 %c형이고 성별은 남자인가? %b\n", name, age, height, bloodType, isMan); // %.1는 실수 몇자리까지 표현하겠다는 표현

        System.out.printf("가격: %d\n", 1_000_000); //printf안에는 내부적으로 23,24번줄에적힌 코드가 하는 일을 한다.
        System.out.printf("가격: %,d\n", 1000000);

        String result = String.format("(2)가격: %,d\n", 1_000_000); // string type을 return함, type이 굉장히 중요한 언어임.
        System.out.println(result);                         // "가격: %,d\n" 대신 정수를 적으면 바로 에러가 터짐

        int mon = 5;
        int day = 13;

        //월,일을 합쳐서 항상 4자리로 만들고 싶을 때 00-00, 월도 2자리, 일도 2자리
        //%와d사이에 숫자 두번째숫자는 2자리를 표현한다는뜻.첫번째숫자는 남은자리를 그걸로 채우겠다는뜻.
        System.out.printf("%02d-%02d", mon, day);
    }
}
