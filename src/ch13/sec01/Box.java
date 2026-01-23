package ch13.sec01;

//<T> 는 제네릭, T문자열은 아무거나 해도되지만 보통 Type이라는 의미로 T를 많이 쓴다.
//T 자리에 타입이 들어간다. 즉, 아직 타입이 결정되지 않았다.
//어느자리에 타입이 들어갈지 표시하기위해 <>안을 비울 수 없고 아무 문자나 넣어서 표시해준다.
public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
