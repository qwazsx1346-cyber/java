package ch05.sec05;

public class MultiArray {
    /* 다차원 배열 (2차원 배열)
    배열 안에 배열이 있는 것

    */
    public static void main(String[] args) {
        int[][] arr = {
            { 10, 20, 30 },
            { 40, 50, 60 },
            { 70, 80, 90, 387 },
            { 100, 110, 120}
        };

        System.out.println("arr.length: " + arr.length);
        System.out.println("arr[0].length: " + arr[0].length);
        System.out.println("arr[0][0]: " + arr[0][0]);
        int[] temp = arr[2];
        System.out.println("temp[1]: " + temp[1]);

        //int[] arr2 = arr[0];
        System.out.println("-------------------");
        /*
        10
        20
        30
        ...
        120
         */
        for(int i=0; i<arr.length; i++){
            for(int z=0; z<arr[i].length; z++) { //z<arr[i].length; 에서 length는 0번방의담긴 배열의 길이만큼 이라는 뜻
                System.out.println(arr[i][z]);
            }
        }
    }
}
