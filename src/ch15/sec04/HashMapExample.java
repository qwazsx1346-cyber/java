package ch15.sec04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//import java.util.*; 로도 가능. java안에 util안에 모든 클래스들을 import한다는 뜻

public class HashMapExample {
    public static void main(String[] args) {
        //제네릭 첫번째 타입: Key 타입
        //제네릭 두번째 타입: Value 타입
        Map<String, Integer> map = new HashMap<>(); //객체생성시 이름이 다르면 100%상속관계.다형성

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        System.out.println("value0: " + map.get("홍길동")); //90
        map.put("홍길동", 95); //같은 키를 두고 값만 바꾸면 덮어쓰기가 됨.
        map.put("임준이", 100);
        System.out.println("value0-1: " + map.get("홍길동")); //95

        int value1 = map.get("신용권");
        System.out.println("value1: " + value1);
        System.out.println("value2: " + map.get("동장군"));
        System.out.println("value3: " + map.get("크크크"));

        System.out.println("size: " + map.size());

        //Set은 Value만 저장하고 중복값 저장 X
        Set<String> keySet = map.keySet(); //Key값들만 빼내서 Set으로 만든 것(동장군, 신용권, 홍길동)
        //Set객체를 이용하여 Itorator 반복자를 생성한다. (반복하기 위해서)
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) { //다음(방)을 가리켰을 때 데이터가 있으면 true 없으면 false
            String k = keyIterator.next();
            int v = map.get(k);
            System.out.printf("%s - %d\n", k, v);
        }
    }
}
