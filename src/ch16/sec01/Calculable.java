package ch16.sec01;

//interface(추상클래스)는 절대혼자못씀. 100% 자식이 있다.
@FunctionalInterface //이 애노테이션의 역할은 추상 메소드가 2개 있으면 에러 터진다.
public interface Calculable {
    void calculable(int x, int y);
}
