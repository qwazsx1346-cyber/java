package ch16.sec02;

//보통, 인터페이스 이름은 형용사로 짓는 편. ~할 수 있는
@FunctionalInterface
public interface Workable {
    //아래 void앞에는 인터페이스에서 자동 생략. public abstract
    void work();
}
