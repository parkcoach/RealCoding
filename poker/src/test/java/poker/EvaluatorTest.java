package poker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvaluatorTest {

    @Test
    public void royal_straight_flush(){
        Hand hand = new Hand();
        hand.addCard(new Card(10, Suit.SPADE));
        hand.addCard(new Card(11, Suit.SPADE));
        hand.addCard(new Card(12, Suit.SPADE));
        hand.addCard(new Card(13, Suit.SPADE));
        hand.addCard(new Card(1, Suit.SPADE));

        Evaluator eval = new Evaluator();
        String result = eval.evaluate(hand);
        System.out.println(result);
        assertTrue(result.equals("ROYAL_STRAIGHT_FLUSH"));
    }
}
