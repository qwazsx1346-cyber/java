package ch06.sec08;

public class PracticeMethod {
    public void abs(int num) {
      System.out.println("넣은값: " + num + "절대값: " + (num > 0 ? num : -num));
    }

    public int random(int num) {
      return (int)(Math.random() * num );
    }

    public int random(int min, int max) {
      return (int)(Math.random() * (max - min)) + min;
    }
}
