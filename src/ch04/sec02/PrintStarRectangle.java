package ch04.sec02;

public class PrintStarRectangle {
  public static void main(String[] args) {
    int star = (int) (Math.random() * 4) + 3;
    System.out.println(star);

    //System.out.print("*")만 이용
    for (int i = 0; i < star; i++) {
      for (int k = 0; k < star; k++) {
          System.out.print("*");
        }
        System.out.println();
    }
  }
}