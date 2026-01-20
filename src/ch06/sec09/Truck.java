package ch06.sec09;

public class Truck {
    /* static은 객체생성과는 무관하다. 공간이 무조건 하나이다.
      static을 사용할 때는 클래스명. 으로 사용한다.
      객체 생성을 하지 않아도 사용할 수 있다.

    */
    static String company; //static이 붙으면 무조건 클래스명 . 으로 사용
    String model; //static이 안붙으면 객체화부터 하고 사용

    void introduce() {
        System.out.printf("company: %s, model: %s\n", company, model);

        run(); //static이 없는데에서는 static사용가능
                //staitc이 있는곳에서는 static없는친구를 사용하려면 객체화부터 해야한다.
    }

    static void run() { //static에서는 앞에 static이 붙은애들만 사용가능. static이 안붙은 친구를 사용하려면 객체화부터 해야한다.
      Truck t = new Truck(); //이렇게 객 체 화 해 야 한 다!!
      t.model = "15톤";
      System.out.printf("%s 회사의 %s 차량이 달린다.\n", company, t.model);
    }
}
