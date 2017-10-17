package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Evaluator {

    public String evaluate_ROYAL_STRAIGHT_FLUSH(Hand hand) {
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

        return "NOT_MATCH";
    }

    public String evaluate_FOUR_CARD(Hand hand){
        //check four card
        if(hand.getCardCount() > 5){
            throw new NotFullHandException();
        }

        List<Card> handList = hand.getHandList();
        int rank_two_count = 0;

        for(Card card : handList){
            if(card.getRank()==2)
                rank_two_count++;
        }

        if(rank_two_count==4){
            return "FOUR_CARD";
        }

        return "NOT MATCH";
    }

    public String evaluate_FLUSH(Hand hand){
        //check flush
        if(hand.getCardCount() > 5){
            throw new NotFullHandException();
        }

        List<Card> handList = hand.getHandList();
        Suit suit = handList.get(0).getSuit();
        boolean isFLUSH = true;

        for(Card card : handList){
            if(card.getSuit().equals(suit)){
            }
            else
                isFLUSH = false;
        }

        if(isFLUSH){
            return "FLUSH";
        }

        return "NOT MATCH";
    }

    public String evaluate_STRAIGHT(Hand hand){
        //check straight
        if(hand.getCardCount() > 5){
            throw new NotFullHandException();
        }

        List<Card> handList = hand.getHandList();
        ArrayList<Integer> straightList = new ArrayList<Integer>();

        for(Card card : handList){
            straightList.add(card.getRank());
        }

        Collections.sort(straightList);
        int target = straightList.remove(0);
        boolean isStraight = true;

        for(int x : straightList){
            if((x - target) == 1){
                target = x;
            }
            else
                isStraight = false;
        }

        if(isStraight){
            return "STRAIGHT";
        }

        return "NOT MATCH";
    }

}
