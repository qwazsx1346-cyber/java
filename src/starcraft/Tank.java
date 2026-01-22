package starcraft;

//시즈탱크(공성 전차)
public class Tank extends Unit {
    private boolean isSiegeMode;
    //String siegeOn = "시즈모드 ON";
    //String siegeOff = "시즈모드 OFF";

    public void changeMode() {
      //isSiegeMode = !isSiegeMode; //호출될때마다 값이 변경된다
      System.out.printf("시즈 모드 %s\n",(isSiegeMode = !isSiegeMode) ? "ON" : "OFF");
      /*
      if(isSiegeMode) {
        System.out.println(siegeOn);
      } else
        System.out.println(siegeOff);
       */
    }

    @Override
    public String toString() {
        //return "시즈탱크 " + super.toString();
        return "시즈탱크@" + super.hashCode();
        //super는 부모껄 가져오는거 => 사실상 Tank 클래스의 toString()
    }
}
