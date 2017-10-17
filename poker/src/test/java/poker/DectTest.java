package poker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DectTest {
    @Test
    public void make_Deck() throws NoSuchRankException {
        Deck deck = new Deck();
        int size = deck.getTotalCard();
        assertTrue(size == 52);
    }

    @Test
    public void draw_Deck() throws NoMoreCardException, NoSuchRankException {
        Deck deck = new Deck();
        deck.drawCard();
        int size = deck.getTotalCard();
        assertTrue(size == 51);
    }

    @Test
    public void Deck_size_zero() throws NoSuchRankException, NoMoreCardException {
        Deck deck = new  Deck();
        for(int i=0;i<52;i++) deck.drawCard();
        deck.drawCard();

    }

}
