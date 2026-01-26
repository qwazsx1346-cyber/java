package control.ioc;

import control.*;

public class TvFactory {
    public static Tv generateTv(String wooferName, String speakerName) {
        //wooferName매개변수에 담겨져있는 문자열이 "marten"이면 MartenWoofer객체화
        //"genelec"이면 GenelecWoofer 객체화

        //woofer를 if문밖에서 정의를 해두어야 if문이 끝나도 woofer가 사라지지않음
        //아래 Woofer는 지역변수이기 때문에 null을 적어주어야 아래 코드진행에서 에러를 터뜨리지않음

        //방법 1
//        Woofer woofer = null;
//        if(wooferName.equals("marten")) {
//            woofer = new MartenWoofer();
//        } else if(wooferName.equals("genelec")) {
//            woofer = new GenelecWoofer();
//        }

        //방법 2
        Woofer woofer = switch (wooferName.toLowerCase()) {
            case "marten" -> new MartenWoofer();
            case "genelec" -> new GenelecWoofer();
            default -> null;
        };

        //speakerName매개변수에 담겨져있는 문자열이 "jbl"이면 JBLSpeaker객체화
        //"harman"이면 HarmanSpeaker객체화
        Speaker speaker = switch (speakerName.toLowerCase()) {
            case "jbl" -> new JBLSpeaker(woofer);
            case "harman" -> new HarmanSpeaker(woofer);
            default -> null;
        };

        return new SamsungTv(speaker);
    }
}
