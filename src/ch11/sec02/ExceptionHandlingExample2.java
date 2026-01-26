package ch11.sec02;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        printLength("ThisIsJava");
        System.out.println("---------------");
        printLength(null); //NullPointerException 오류가 뜸. 객체주소값이 없는데 객체를 사용하려고해서
        System.out.println("끝!!");
    }

    public static void printLength(String data) {
        //예외가 발생될 가능성이 있는 코드를 try{}로 감싼다.
        //예외가 발생되지 않으면 try{}코드가 모두 실행된다.
        //그러나 예외가 발생된다면 catch가 그 예외를 잡는다.
        try {
            System.out.println("시작!!!");
            int result = data.length(); //예외 발생은 예외를 던진다 라고 표현함.
            //모든예외의 부모는 Exception이다.
            System.out.println("문자 수: " + result);
        } catch (Exception e) { //예외가 발생되었을 때만 실행됨! Exception은 타입, e는 파라미터명이다. 파라미터명은 아무거나해도 상관없음.
            System.out.println("예외 발생!!!");
            e.printStackTrace(); //무슨에러가 떳는지 확인하려고 쓰는 용도. catch문에 파라미터명.printStackTrace();
        } finally { //무조건 실행!!!!무슨일이 있어도 무조건 실행!
            System.out.println("Finally");
        }
        System.out.println("얘도 항상 실행된다!!");
    }
}
