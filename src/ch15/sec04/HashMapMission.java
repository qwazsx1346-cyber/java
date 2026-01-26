package ch15.sec04;

import java.util.HashMap;
import java.util.Map;

public class HashMapMission {
    public static void main(String[] args) {
        //우리가 생성자를 사용하는 이유는? 객체 생성과 동시에 멤버필드 초기화하기 위해
        ValueBox vb1 = new ValueBox(1, "권수영"); //생성자 명시
        ValueBox vb2 = new ValueBox(2, "권준하"); //생성자 명시
        ValueBox vb3 = new ValueBox(3, "김가은"); //생성자 명시
        ValueBox vb11 = new ValueBox(11, "임준이"); //생성자 명시

        //ValueBox객체 주소값을 4개 담을 수 있는 배열을 만들어 주세요.

        ValueBox[] valueBoxes = new ValueBox[4];
        valueBoxes[0] = vb1;
        valueBoxes[1] = vb2;
        valueBoxes[2] = vb3;
        valueBoxes[3] = vb11;

        // 배열을 > HashMap으로. Key값은 id, value는 객체 주소값

        Map<Integer, ValueBox> map = new HashMap<>();
        for(int i=0; i<valueBoxes.length; i++) {
            map.put(valueBoxes[i].id, valueBoxes[i]);
        }
        ValueBox id3 = map.get(3);
        System.out.println(id3.name);

        System.out.println(map.get(11).name);
        System.out.println("size: " + map.size());
    }
}


class ValueBox {
    int id;
    String name;

    public ValueBox(int id, String name) {
        this.id = id;
        this.name=name;
    }
}