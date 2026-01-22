package ch07.sec10;

//Phone클래스를 상속받아 주세요. Phone클래스에 추상메소드가있으면 오버라이딩으로 재정의해줘야 빨간줄이 안뜸
//                            추상메소드를 오버라이딩 하지않고 public class 사이에 abstract처리(추상)를 해주어도 빨간줄이 안뜨지만 그러면 또 다른 추상클래스를 생성하는것이기 때문에 아무짝에 쓸모가 없음(쓸모있으려면 새로운 추상메소드를 생성해주어야함)
//extends로 Phone을 상속받는다고는 하지만 Phone클래스 밑으로(자식) 들어가는건 아님. 상속만 받을 뿐.
// 예시) public abstract class SmartPhone extends Phone
public class SmartPhone extends Phone {
    @Override
    public void bell() {
        System.out.println("스마트폰이 울린다.");
    }
}
