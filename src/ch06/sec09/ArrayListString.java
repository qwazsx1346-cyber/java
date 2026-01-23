package ch06.sec09;

public class ArrayListString {
  String[] arr;

    //기본 생성자

    public ArrayListString () {
        arr = new String[0];
    }

    public void add(String val) {
        //전역변수 arr이 가리키고 있는 배열보다 한 칸 더 큰 배열을 만든다.
        //그리고 마지막 방에 val를 넣는다.
      String[] temp = new String[arr.length + 1];
      //int lastIdx = temp.length - 1; 또는
      int lastIdx = arr.length; //lastIdx에 arr의 길이만큼의 숫자를 선언
      temp[lastIdx] = val; //arr의 길이만큼의 방번호 에는 새로운값 val을 넣는다.

      for(int i=0; i<lastIdx; i++) {
          temp[i] = arr[i];
      }
      arr = temp;
    }

    public String get(int idx) {
      return arr[idx];
    }

    public String remove() {
      int lastIdx = arr.length - 1; //마지막방에 값을 삭제하고 새로운 배열만드려면 -1

      String[] temp = new String[lastIdx]; //기존방에 -1된 새로운배열 만들어줌
      String lastString = arr[lastIdx]; //arr=temp;를 저장하기 전에만 적어주면 어디에 적어도 상관없음

      for (int i=0; i<lastIdx; i++) {
          temp[i] = arr[i];
      }
      arr= temp;
      return lastString;
    }

    public void add(int idx, String val) {

        String[] arr2 = new String[arr.length + 1]; //기존방 갯수보다 하나 더 큰배열 만듬
        arr2[idx] = val; //idx로 들어오는 방번호에 text로 들어오는 문자를 넣음
        //방법 1
        for(int i=0; i<idx; i++) {
            arr2[i] = arr[i];
        }
        for(int i=idx; i<arr.length; i++) {
            arr2[i + 1] = arr[i];
        }
        //방법 2
        //for(int i=0; i<arr.length; i++) {
        //      temp[i < idx ? i : i + 1] = arr[i];
        arr = arr2;
    }

    public String remove(int idx) {
        String removeVal = get(idx);
        String[] temp = new String[arr.length - 1];

        for (int i=0; i<idx; i++) {
            temp[i] = arr[i];
        }
        for (int i=idx; i<temp.length; i++) {
            temp[i] = arr[ i + 1 ];
        }
        arr = temp;
        return removeVal;
    }

    public void remove(String val) {
        for(int i=0; i<arr.length; i++) {
            if(val == arr[i]) {
                remove(i);
                return;
            }
        }
    }

    @Override
    public String toString() {
        if(arr.length == 0) { return "[]"; }
        String temp = arr[0];
        for (int i=1; i< arr.length; i++) {
            temp += ", " + arr[i];
        }
        return "[" + temp + "]";
    }
}