package ch05.sec03;

public class RefVariableCompareExample {
    public static void main(String[] args) {
        //자바에서 배열 만드는 방법 중 하나
        //자바에서도 배열은 객체이다.
        //진리!!! primitive 제외한 모든 것들은 참조변수
        //primitive는 리터럴을 저장함 **
        //변수는 값을 저장할 공간, 그 공간은 바꿀 수 있고. 바꿀 수 없으면 상수
        int a; //(primitive 타입) 일반 변수

        //아래는 모두 Reference 타입이라고 부른다.
        // Refernce는 주소값을 저장함. ** 주소값을 저장하면 그 객체에게 접근할 수 있다.
        // 접근한다는 뜻은
        int b[];
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        int[] arr3 = arr1; //주소값 복사!! >> 얕은복사 Shallow Copy
        //int[]안에는 int타입만 저장가능. string[]은 string타입만 저장가능.
        //타입을 섞어서쓰는 오브젝트 문법도있지만 잘 쓰지않음. -불편-

        System.out.println("arr1.length: " + arr1.length);
        //arr1.length = 10; //자바의 배열의 length속성은 상수이다.
        // 레퍼런스 타입끼리의 == 비교는 주소값 비교이다.
        // 레퍼런스 타입끼리의 == 비교는 동일성 비교이다.
        // 즉, 같은 주소인가?를 물어보는 것이다.
        // 프라머티브 타입끼리의 == 비교는 리터럴 값 비교이다.
        System.out.println( "arr1 == arr2 : " + (arr1 == arr2) );
        System.out.println( "arr1 == arr3 : " + (arr1 == arr3) );
    }
}
