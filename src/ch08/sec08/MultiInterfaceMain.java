package ch08.sec08;

public class MultiInterfaceMain {
    public static void main(String[] args) {
       RemoteControl rc = new SmartTelevision();
       rc.turnOn();
       rc.turnOff();
       //rc.search(""); sec08에 RemoteControl에다가 Searchable이 가지고있는
      // void search(String url); 을 추가해주면 RemoteControl이 search를 알기 때문에
      // 이친구도 사용가능

      SmartTelevision st = (SmartTelevision) rc; //SmartTelevision은 아래 세개함수를 모두 알기때문에 강제형변환을 해주면 아래처럼 사용가능
      st.turnOn();
      st.turnOff();
      st.search("www.navercom");

      //인터페이스는 객체화가 안됨
      //아래는 클래스 이름이 없는 구현 클래스를 만들고 바로 객체화 한다.
      //1회용
      RemoteControl rc2 = new RemoteControl() {
        @Override
        public void turnOn() {

        }

        @Override
        public void turnOff() {

        }
      };
    }
}
