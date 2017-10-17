package poker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HandTest {

    @Test
    public void draw_card_five_hand_five(){
        Deck deck = new Deck();
        Hand hand = new Hand();

        for(int i=0;i<5;i++) {
            Card card = deck.drawCard();
            hand.addCard(card);
        }

        int size = hand.getCardCount();
        assertTrue(size == 5);
    }

}
