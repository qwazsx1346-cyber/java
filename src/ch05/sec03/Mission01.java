package ch05.sec03;

public class Mission01 {
    public static void main(String[] args) {
        String fileNm = "abc12-jjffsfk-bbb.kkk.jpedg";

        //유연하게 코드짜셔야 한다.
        //확장자명 알고 싶다. 콘솔에 확장자명을 출력한다.
        int idx = fileNm.lastIndexOf(".");
        String newstr1 = fileNm.substring(idx + 1);
        System.out.println("newstr1: " + newstr1);
    }
}
