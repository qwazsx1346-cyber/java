package ch07.sec08;

public class AnimalMain4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();
        Cat cat = new Cat();

        AnimalMain4.haha();

        AnimalMain4.doCrying(dog);
        AnimalMain4.doCrying(cat);
        AnimalMain4.doCrying(bullDog);
    }

    public static void doCrying(Animal animal) {
      animal.crying();
    } // 부모타입으로 불러주면 동물이 2000마리여도 모두 불러올 수 있다.

    public static void haha() {
      System.out.println("하하");
    }
}
