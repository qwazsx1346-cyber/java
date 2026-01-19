package ch06.sec08;

import java.util.UUID;

public class PracticeMethod2 {
    public String getRandomFileName() {
        return UUID.randomUUID().toString(); //UUID는 거의 중복되지않는 값.전세계적 유일
    }

    public String getExt(String filename) {
        //int idx = filename.lastIndexOf("."); //뒤에서 .까지부터 불러옴
        //String file = filename.substring(idx); //불러온걸 substring으로 잘라내기함
        return filename.substring(filename.lastIndexOf("."));
    }

    public String getRandomFileName(String rfname) {
        return getRandomFileName() + getExt(rfname); //위에서 정의한 랜덤한 값을 그대로 불러오고 + 바로위에 확장자명 불러온걸 붙여주기만 하면 됨
    }

    public int sumArr(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int[] deepCopy(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i=0; i< arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i=1; i<arr.length; i++) { //0번방은 넣어놨으니 1번방부터 비교
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
