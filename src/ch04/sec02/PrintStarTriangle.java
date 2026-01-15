package ch04.sec02;

public class PrintStarTriangle {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 4) + 3;
        System.out.println(star);

        for (int i=0; i<star; i++) {
            for (int k=0; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
