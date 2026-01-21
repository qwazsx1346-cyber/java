package blackjack;

public class GameStart {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        //딜러와 게이머는 순차적으로 카드를 한씩 뽑아 각자 2개의 카드를 소지한다.
        for(int i=0; i<2; i++) {
            gamer.receiveCard(cd.draw());
            dealer.receiveCard(cd.draw());
        }

        //딜러가 가지고 있는 카드의 점수가 16점 이하면 카드 한장을 더 소지하게 한다.
        if(dealer.needMoreCard()) {
            dealer.receiveCard(cd.draw());
        }

        dealer.showYourCards();
        System.out.println("-- 딜러 --");
        for(Card c : dealer.openCard()) {
            System.out.println(c);
        }

        gamer.showYourCards();
        System.out.println("-- 게이머 --");
        for(Card c : gamer.openCard()) {
            System.out.println(c);
        }

        /* 향상된 for문 풀이. for(Card c : gamer.openCard())는 (선언부 : 배열)이 들어가게 된다.
        for(int i=0; i<gamer.openCard().length; i++){
            Card c = gamer.openCard()[i];
            System.out.println(c);
        }
        */

        //게이머에게 카드를



        //딜러와 게이머의 값을 비교하여 승부를 결정한다.
        Rule.whoIsWinner(dealer, gamer);


    }
}
