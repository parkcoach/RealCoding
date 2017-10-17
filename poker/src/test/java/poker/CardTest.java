package poker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardTest {
    //card 랭크, 무늬
    //사용자
    //덱
    //족보
    //카드 주기
    @Test
    public void card_dia_5_create() throws NoSuchRankException {
        Card card = new Card(5, Suit.DIAMOND);
        int rank = card.getRank();
        assertTrue(rank == 5);
    }

    @Test
    public void card_rank_OutOfBoundary_error() throws NoSuchRankException {
        Card card = new Card(-1,Suit.DIAMOND);
        int rank = card.getRank();
        assertFalse(rank==-1);
    }

}
