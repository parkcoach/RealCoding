package poker;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    List<Card> handList = new ArrayList<Card>();

    public void addCard(Card card) {
        if(handList.size() > 5){
            throw new NoMoreHandException();
        }
        handList.add(card);
    }

    public List<Card> getHandList() {
        return handList;
    }

    public int getCardCount() {
        return handList.size();
    }
}
