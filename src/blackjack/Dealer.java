package blackjack;

public class Dealer extends Gamer {
    private final int DRAW_LIMIT = 16;
    public boolean needMoreCard() { //리펙토링
        //내가 가진 카드들의 총 점수의 총 합이 16점 이하면 리턴true
        //아니면 return false가 되어야 한다.
        Card[] receivedCards = openCard(); //receivedCards길이는 내가받은카드와 같음
        int score = Rule.calcScore(receivedCards);
        return score <= DRAW_LIMIT;
    }
}
