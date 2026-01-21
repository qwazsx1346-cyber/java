package blackjack;

//CardDeck을 기본생성자로 호출만 하여도
//Card객체 52개를 생성하여 cards가 가리키는
//배열에 순차적으로 저장(대입)한다.
//가능하면 무늬별로 다른 denomination값이 저장되었으면 한다.
public class CardDeck {
    //Card 객체 주소값 52개를 담을 수 있어야 합니다.
    private Card[] cards = new Card[52]; //멤버필드 앞에는 private 붙여주기. 각 방의 타입은 Card타입
    private String[] patterns = { "스페이드", "하트", "클로버", "다이아" };
    private int drawIdx = 0; //외부로 카드를 준 idx 관리

    public CardDeck() {
        init();
        shuffle(); //카드 섞기
    }

    public void print () { //검증용!
        for(int i=0; i<cards.length; i++) {
            Card c = cards[i];
            if(c == null) {
                System.out.println("null");
            } else {
                System.out.printf("%s - %s\n", c.getPattern(), c.getDenomination());
            }
        }
    }

    private void init() {
        int idx = 0;
        for(int i=0; i<patterns.length; i++) { //4번 돈다
            String pattern = patterns[i];
            for(int d=1; d<=13; d++) { //13번 돈다
                String denomination = null; //정수에서 => 문자열로 바꿈

                switch(d) {
                    case 1: denomination = "A"; break;
                    case 11: denomination = "J"; break;
                    case 12: denomination = "Q"; break;
                    case 13: denomination = "K"; break;
                    default: denomination = String.valueOf(d);
                }
                Card c = new Card(pattern, denomination);
                cards[idx++] = c;
            }
        }
    }
    private void shuffle() {
        //cards 길이만큼 도는 for문 세팅
        for(int i=0; i<cards.length; i++) {
            int randomIdx = (int)(Math.random() * cards.length); //0~51랜덤값 나올 수 있도록 해주세요.

                //i방과 randomIdx방의 값을 서로 스와핑한다.
                Card temp = cards[i]; //cards[i]방 값을 변수에 저장해놓음으로서 값이 날아가지 않게끔 해줌
                cards[i] = cards[randomIdx]; //i번방값을 randomIdx번방 값으로 바꾼 후
                cards[randomIdx] = temp;  //randomIdx방 값을 변수저장해놓은 temp(i번방값)로 바꿔줌
        }
    }

    public Card draw() {
        if( drawIdx > 51 ) { return null; } //예외처리, 안전장치. 51번방까지 있기때문
        //cards의 방에 들어있는 card주소값을 순차적으로 리턴해주며 리턴한 방은 null로 바꾼다.
        Card temp = cards[drawIdx];
        cards[drawIdx++] = null;
        return temp;

//        for(int i=0; i< cards.length; i++) {
//            Card c = cards[i];
//        } 이렇게 하게되면 항상 전체 배열을 다시 도는것이라 "이미 뽑은 카드" 개념이 없다.
    }
}
