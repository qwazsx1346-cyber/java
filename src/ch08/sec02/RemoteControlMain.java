package ch08.sec02;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl rc = new TvRemoteControl();
        rc.turnOn();
        //rc.turnOff();

        //rc.turnOff 호출!!
        TvRemoteControl trc = (TvRemoteControl) rc; //()로 강제형변환을 해줘야 turnOff를 불러올 수 있음.
        trc.turnOff();

        ((TvRemoteControl) rc).turnOff();

        for(int i=0; i<20; i++) {
            rc.volumeUp(); //volumeUp 최대 10 확인
        }

        for(int i=0; i<20; i++) {
            rc.volumeDown(); //volumeDown 최소 0 확인
        }
    }
}
