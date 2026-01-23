package ch16.sec02;

public class Person {
    //Workable을 인플리먼츠 한(구현한) 객체만 (Workable workable)에 들어올 수 있음
    public void action(Workable workable) {
        workable.work();
    }
}
