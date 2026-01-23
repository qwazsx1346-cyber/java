package ch16.sec05;

import java.util.function.*;

public class LambdaMain {
    /* 내장형 함수 인터페이스
    Consumer - 소비자, 파라미터는 있는데 리턴이 없다(void), 메소드명 accept
    Supplier - 공급자, 파라미터는 없고 리턴만 있다. 메소드명 get
    Function - 파라미터도 있고, 리턴도 있다. 메소드명 apply
    Predicate - 파라미터 있고, 리턴은 boolean, 메소드명 test
    */
    public static void main(String[] args) {
        //1. Consumer 학습. <제네릭>은 파라미터의 타입이다.
        Consumer<Integer> c = (val) -> System.out.println(val + val);
        c.accept(10);
        Consumer<String> c2 = val -> System.out.println(val + val);
        c2.accept("하하");


//        String s1 = "반가워";
//        String s2 = "반가워"; 문자열 비교하면 true
//        String s1 = new String("반가워");
//        String s2 = new String("반가워"); 문자열 비교하면 false
//        System.out.println(s1 == s2);

        //2. Supplier 학습. <제네릭>은 리턴타입의 타입이다.
        Supplier<String> s = () -> new String("반가워");
        String r1 = s.get();
        System.out.println(r1);

        //3. Function 학습. <1, 2> 1이 파라미터 타입, 2가 리턴타입의 타입
        //val 의 타입은 Integer
        //return하는 값의 타입은 Double
        Function<Integer, Integer> f = val -> (int)(Math.random() * val);
        int r2 = f.apply(10);
        System.out.println(r2);

        //3-1 BiFunction<1, 2, 3> 1이 첫번째 파라미터 타입, 2가 두번째 파라미터 타입, 3이 리턴타입
        BiFunction<Integer, Integer, Integer> f2 = (sNum, eNum) -> (int)(Math.random() * (eNum - sNum)) + sNum;
        int r3 = f2.apply(2, 5);
        System.out.println("r3: " + r3);

        //4. Predicate 학습
        Predicate<String> p = str -> "hello".equalsIgnoreCase(str); //equalsIgnoreCase는 대소문자 구분없이 출력해주는 것
        System.out.println(p.test("HeLlo"));
    }
}
