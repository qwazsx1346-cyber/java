package ch08.sec02;

/* 인터페이스를 상속받을 땐 implements키워드를 사용한다.
인터페이스를 상속받는다라고 표현하지 않고 구현한다라고 표현한다.

 */
public class TvRemoteControl implements RemoteControl{
    private int volume = MIN_VOLUME;
    private int muteVolume = 0;

    @Override
    public void turnOn() {
        System.out.println("Tv를 켠다.");
    }

    public void turnOff() {
        System.out.println("Tv를 끄다.");
    }

    @Override
    public void volumeUp() {
        if(volume < MAX_VOLUME) {
            volume++;
        }
        displayVolume();
    }

    @Override
    public void volumeDown() {
        if(volume > MIN_VOLUME) {
            volume--;
        }
        displayVolume();
    }

    private void displayVolume() {
        System.out.printf("불륨: %d\n", volume);
    }

    @Override
    public void mute() {
        //mute할 때 volume이 0보다 크면 기존값을 새로운변수에 저장하고 0을 내보냄
        //
        if(volume > MIN_VOLUME) {
            muteVolume = volume;
            volume = 0;
            System.out.print("(음소거) ");
        } else {
            volume = muteVolume;
        }

        displayVolume();
    }


}
