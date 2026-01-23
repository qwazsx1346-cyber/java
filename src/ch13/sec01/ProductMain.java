package ch13.sec01;

public class ProductMain {
    public static void main(String[] args) {
        //Product에서 K,M으로 정의한 곳이 TV, String타입이 순서대로 들어가게 됨
        Product<Tv, String> p1 = new Product<>();
        p1.setKind(new Tv());
        p1.setModel("스마트TV");

        Product<Car, Integer> p2 = new Product<>();
        p2.setKind(new Car());
        p2.setModel(5);
    }
}
