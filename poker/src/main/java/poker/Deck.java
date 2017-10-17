package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    List<Card> cardList = new ArrayList<Card>();

    public Deck() throws NoSuchRankException {
        for(int i=1;i<=13;i++){
            for(Suit suit : Suit.values()){
                Card card = new Card(i, suit);
                cardList.add(card);
                Collections.shuffle(cardList);
            }
        }
    }

    public int getTotalCard(){
        return cardList.size();
    }

    public Card drawCard() throws NoMoreCardException {
        if(cardList.size() > 0) {
            return cardList.remove(0);
        }
        throw new NoMoreCardException();
    }
}
