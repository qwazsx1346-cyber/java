package blackjack;

public class Rule {
    private final static int BLACKJACK_SCORE = 21;
      //static은 객체가 생성이 안되어도 냅다 박아넣는 용도
      //2~10은 숫자 그대로 점수를, K/Q/J는 10점으로, A는 1로 계산
      //카드들의 모든 점수를 더하고 더한 점수를 리턴하시오.
      public static int calcScore(Card[] cards) {
        int totalScore = 0;
        for(Card card : cards) {
            String denomination = card.getDenomination();
            int score = switch(denomination) {
                case "A" -> 1;
                case "J", "Q", "K" -> 10;
                default -> Integer.parseInt(denomination);
            };
            totalScore += score;
        }

        return totalScore;
    }

    public static void whoIsWinner(Dealer dealer, Gamer gamer) {
        Card[] dealerCards = dealer.openCard();
        Card[] gamerCards = gamer.openCard();
        int dealerScore = calcScore(dealerCards);
        int gamerScore = calcScore(gamerCards);

//        int dealerScore = 10; 숫자넣어서 누가이긴지 제대로 나오는지 확인용
//        int gamerScore = 10;
        System.out.printf("딜러 점수합계: %d || 게이머 점수합계: %d\n", dealerScore, gamerScore);
        if ( dealerScore == gamerScore || dealerScore > BLACKJACK_SCORE && gamerScore > BLACKJACK_SCORE ) {
            System.out.println("무승부");
        } else if ( dealerScore > BLACKJACK_SCORE && gamerScore <= BLACKJACK_SCORE ||
            dealerScore < BLACKJACK_SCORE && gamerScore < BLACKJACK_SCORE && dealerScore < gamerScore ) {
            System.out.println("게이머 승");
        } else if ( gamerScore > BLACKJACK_SCORE && dealerScore <= BLACKJACK_SCORE ||
            dealerScore < BLACKJACK_SCORE && gamerScore < BLACKJACK_SCORE && dealerScore > gamerScore ) {
            System.out.println("딜러 승");
        }
        /* 둘의 점수가 같다 > 무승부
        둘 다 21점 초과 > 무승부
        딜러가 21점 초과, 게이머 21점 이하 > 게이머 승
        게이머가 21점 초과, 딜러가 21점 이하 > 딜러 승
        둘 다 21점 초과 x, 게이머가 딜러보다 점수 높아요 > 게이머 승
        ...
        ...
         */
    }

    public static void showYourCards() {

      }
}
