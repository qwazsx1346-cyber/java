package ch08.sec05;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0; //public static final이 자동으로 앞에 붙음

    void setVolume(int volume);

    //인터페이스도 추상클래스처럼 구현부가 있는 메소드 만들 수 있었으면 좋겠다.
    //-> 디폴트 메소드(void 앞에 default를 붙여줌)
    default void setMute(boolean mute){
        if(mute) {
            System.out.println("무음 처리합니다.");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다.");
        }
        //defaultStaticCommon(1); 이런식으로 static메소드 호출 가능
    }

    //스태틱 메소드(클래스 메소드)는 가질 수 있다.
    static void changeBattery() {
        System.out.println("배터리를 교환합니다.");
    }

    //private 일반 메소드, private static 메소드 둘 다 가능
    // >> default, static 메소드가 여러개 일 때 중복처리를 메소드로 처리하기 위해 존재
    //리턴타입은 아무거나 상관없음. void를 제외한 다른 리턴타입은 return을 적어줘야함.
    private String defaultCommon() {
        return "";
    }

    //static은 무조건 호출 가능하다. 누구나 static을 이용할수는 있지만
    //static이 다른 누구를 이용할 수는 없다.(static끼리는 가능)
    private static void defaultStaticCommon(int n1) {
    }
}
