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

    public String getGrade(int score) {
        if (score > 90) {
          return "A";
        } else if (score > 88) {
            return  "B";
        } return "C";
    }

    public void printStar(int str) {
      for (int i=0; i<str; i++) {
          System.out.print("*");
      }
      System.out.println();
    }

    public void printStarTriangle(int str) {
        for (int i=0; i<str; i++ ) {
          printStar(i);
        }
    }

    public void printStarRectangle(int str) {
        for (int i=0; i<str; i++) {
          printStar(str);
        }
    }

    public void gugudan(int num) {
        for (int i=1; i<10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public void gugudan(int n1, int n2) {
        for (int i=n1; i<=n2; i++) {
          gugudan(i);
        }
    }

    public int sum(int n1, int n2) {
        int sum = 0;
        for (int i=n1; i<=n2; i++) {
          sum += i;
        }
        return sum;
    }
}
