package ch11.sec03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] arr = { "100", "1AA" };

        for(int i=0; i<= arr.length; i++) {
            try {

                int value = Integer.parseInt(arr[i]);
                System.out.printf("arr[%d]: %d\n", i, value);

            } catch (ArrayIndexOutOfBoundsException e) { //예외마다 다른처리를 하고싶을 때
                System.out.println("배열 인덱스가 초과: " + e.getMessage());
            } catch (NumberFormatException e) { //예외마다 다른처리를 하고싶을 때
                System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
            } catch (Exception e) { //위에 두개의 catch가 못잡을 때 여기에서 무조건 잡음
                                    //catch가 젤위에있으면 얘가 다잡기때문에 항상 마지막에 적어주어야함.
                System.out.println("예외 발생: " + e.getMessage());
            }
        }
    }
}
