package ch06.sec03;
/*
접근지시어: public protected default private (default는 큰 의미없음)
public: 어디에서든 이 클래스 파일을 사용할 수 있다. 완전공개(누구나 사용할 수 있다.)
class앞에 public을 붙일 수 있는건 파일명과 동일한 클래스명만 붙일 수 있습니다.
public > protected > default > private 점점 접근범위가 줄어든다

공개클래스 p.211 참고
*/

public class SportsCar {

}


//자바 파일안에 여러 클래스를 만드는 경우는 별로 추천하지 않는다.
// 1 자바파일 1 클래스가 가장 무난하다.
class Tire {

}

class Handle {

}