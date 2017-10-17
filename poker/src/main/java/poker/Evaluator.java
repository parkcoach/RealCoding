package poker;

import java.util.ArrayList;
import java.util.List;

public class Evaluator {
    public String evaluate(Hand hand) {
        if(hand.getCardCount() > 5){
            throw new NotFullHandException();
        }

        //check royal straight flush
        List<Card> handList = hand.getHandList();
        boolean isRoyalStraightFlush = true;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10); list.add(11); list.add(12); list.add(13); list.add(1);

        for(Card card : handList){
            if(card.getSuit()!=Suit.SPADE){
                isRoyalStraightFlush = false;
            }

            if(list.contains(card.getRank())) {
                int index = list.indexOf(card.getRank());
                list.remove(index);
            }
        }

        if(isRoyalStraightFlush && list.isEmpty()) {
            return "ROYAL_STRAIGHT_FLUSH";
        }

        return null;
    }
}
