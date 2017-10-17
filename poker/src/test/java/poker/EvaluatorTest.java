package poker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvaluatorTest {

    @Test
    public void royal_straight_flush_OK(){ //모든 suit가 스페이드이고, rank는 10,11,12,13,1
        Hand hand = new Hand();
        hand.addCard(new Card(10, Suit.SPADE));
        hand.addCard(new Card(11, Suit.SPADE));
        hand.addCard(new Card(12, Suit.SPADE));
        hand.addCard(new Card(13, Suit.SPADE));
        hand.addCard(new Card(1, Suit.SPADE));

        Evaluator eval = new Evaluator();
        String result = eval.evaluate_ROYAL_STRAIGHT_FLUSH(hand);
        assertTrue(result.equals("ROYAL_STRAIGHT_FLUSH"));
    }

    @Test
    public void royal_straight_flush_ERROR(){ //모든 suit가 스페이드이고, rank는 10,11,12,13,1
        Hand hand = new Hand();
        hand.addCard(new Card(10, Suit.SPADE));
        hand.addCard(new Card(11, Suit.SPADE));
        hand.addCard(new Card(12, Suit.SPADE));
        hand.addCard(new Card(13, Suit.HEART));
        hand.addCard(new Card(1, Suit.SPADE));

        Evaluator eval = new Evaluator();
        String result = eval.evaluate_ROYAL_STRAIGHT_FLUSH(hand);
        assertFalse(result.equals("ROYAL_STRAIGHT_FLUSH"));
    }

    @Test
    public void four_card_OK(){ //모든 rank는 2이고, suit는 4개 모두
        Hand hand = new Hand();
        hand.addCard(new Card(2, Suit.SPADE));
        hand.addCard(new Card(2, Suit.HEART));
        hand.addCard(new Card(2, Suit.DIAMOND));
        hand.addCard(new Card(2, Suit.CLOBA));
        hand.addCard(new Card(1, Suit.SPADE));

        Evaluator eval = new Evaluator();
        String result = eval.evaluate_FOUR_CARD(hand);
        assertTrue(result.equals("FOUR_CARD"));
    }

    @Test
    public void four_card_ERROR(){ //모든 rank는 2이고, suit는 4개 모두
        Hand hand = new Hand();
        hand.addCard(new Card(2, Suit.SPADE));
        hand.addCard(new Card(2, Suit.HEART));
        hand.addCard(new Card(3, Suit.DIAMOND));
        hand.addCard(new Card(2, Suit.CLOBA));
        hand.addCard(new Card(1, Suit.SPADE));

        Evaluator eval = new Evaluator();
        String result = eval.evaluate_FOUR_CARD(hand);
        assertFalse(result.equals("FOUR_CARD"));
    }

    @Test
    public void flush_OK(){ //모든 카드의 suit가 같은 것
        Hand hand = new Hand();
        hand.addCard(new Card(1, Suit.DIAMOND));
        hand.addCard(new Card(3, Suit.DIAMOND));
        hand.addCard(new Card(4, Suit.DIAMOND));
        hand.addCard(new Card(7, Suit.DIAMOND));
        hand.addCard(new Card(1, Suit.DIAMOND));

        Evaluator eval = new Evaluator();
        String result = eval.evaluate_FLUSH(hand);
        assertTrue(result.equals("FLUSH"));
    }

    @Test
    public void flush_ERROR(){ //모든 카드의 suit가 같은 것
        Hand hand = new Hand();
        hand.addCard(new Card(1, Suit.DIAMOND));
        hand.addCard(new Card(3, Suit.DIAMOND));
        hand.addCard(new Card(4, Suit.CLOBA));
        hand.addCard(new Card(7, Suit.DIAMOND));
        hand.addCard(new Card(1, Suit.DIAMOND));

        Evaluator eval = new Evaluator();
        String result = eval.evaluate_FLUSH(hand);
        assertFalse(result.equals("FLUSH"));
    }

    @Test
    public void straight_OK(){ //모든 rank가 순서대로 가지고 있는 것
        Hand hand = new Hand();
        hand.addCard(new Card(2, Suit.SPADE));
        hand.addCard(new Card(3, Suit.SPADE));
        hand.addCard(new Card(4, Suit.SPADE));
        hand.addCard(new Card(5, Suit.SPADE));
        hand.addCard(new Card(6, Suit.SPADE));

        Evaluator eval = new Evaluator();
        String result = eval.evaluate_STRAIGHT(hand);
        assertTrue(result.equals("STRAIGHT"));
    }

    @Test
    public void straight_ERROR(){ //모든 rank가 순서대로 가지고 있는 것
        Hand hand = new Hand();
        hand.addCard(new Card(2, Suit.SPADE));
        hand.addCard(new Card(3, Suit.SPADE));
        hand.addCard(new Card(4, Suit.SPADE));
        hand.addCard(new Card(9, Suit.SPADE));
        hand.addCard(new Card(6, Suit.SPADE));

        Evaluator eval = new Evaluator();
        String result = eval.evaluate_STRAIGHT(hand);
        assertFalse(result.equals("STRAIGHT"));
    }
}
