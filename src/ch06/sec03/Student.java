package ch06.sec03;
/* 객체는 무엇으로 이루어져 있는가?
속성: 멤버필드, 전역 (변수/상수), 역할: 값 저장, 객체가 살아있는 동안 값이 유지된다. 앞에 this.멤버필드 하면 이름이 같다해도 헷갈일 일이 절대없음
메소드: 멤버메소드, 역할: 변화 action

클래스는 객체가 아니다. 틀(Frame), 설계도 같은 것

클래스로 실체를 만들면 그게 객체(object, instance)가 된다.

작성 순서는 아래 순서대로 작성하자.
멤버필드
생성자 (도 메소드의 한 종류)
메소드

생성자 vs 메소드 다른점 2가지 **중요
1. 이름은 클래스명과 동일
2. 리턴타입을 작성하면 안된다.

생성자의 역할: 객체생성 + 맴버필드 초기화 하기 위함
*/
public class Student { //class명은 무조건 대문자로 시작
    int no; //8, 9번 라인을 멤버필드
    String name;

    public  Student () { //기본 생성자 정의
      this(0, "홍길동");//this() 다른 생성자 호출, 항상 최상위에서 호출해야한다.
      System.out.println("--Student 기본 생성자--");
//      this.no = 0;
//      this.name = "홍길동";
    }

    public Student(int no, String name) { // 오버로딩 생성자
      System.out.println("--Student 오버로딩 생성자--");
      this.no = no;
      this.name = name;
    }

    public Student(String bbbb, int aaa) { // 오버로딩 생성자
      this.no = aaa;
      this.name = bbbb;
    }


    void introduceMySelf() { //11, 12번 라인을 멤버메소드 라고 부름
      System.out.printf("저는 %d번이고 이름은 %s입니다.\n", no, name );
    }
}
