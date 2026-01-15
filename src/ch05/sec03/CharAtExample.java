package ch05.sec03;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "950624-1230123"; //""안에 내용은 순서대로 0,1,2,...13번방에 각각 담긴 값들임
        int len = ssn.length();
        System.out.println("len: " + len);

        System.out.printf("%d - %c", (int)'1', '1');

        char gender = ssn.charAt(7); //7번방에있는 문자가 gender로 넘어옴
        //2, 4 여자 1, 3 남자 콘솔 출력

        /* char타입이라 1,2,3,4를직접넣게되면 마지막에 다시확인해달라는 문구만 출력됨
        문자1은 49로 저장되어있기때문에 1 대신 49로 3은 51로 적어줘야 제대로 출력가능
        */

        if(gender == 50 || gender == 52) {
            System.out.println("여자");
        } else if (gender == 49 || gender == 51) {
            System.out.println("남자");
        } else {
            System.out.println("다시 확인해 주세요.");}




       String gender2 = (gender == '1' || gender == '3' ? "남자" : "여자");
       System.out.println("gender2: " + gender2);

       /*
       switch(gender) {
           case '2': case '4':
                System.out.println("여자");
           case '1': case '3':
                System.out.println("남자");
                break;
           default:
                System.out.println("다시 확인해 주세요.");
        */
       }
    }
