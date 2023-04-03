import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards = new ArrayList<>();

    public Hand() {
    }

    public void addCard(Card card) {
        if (this.cards.size() >= Constant.MAX_HAND_CARD_SIZE) {
            throw new IllegalStateException("Cannot add more card into hand.");
        }
        cards.add(card);
    }

    public Integer getCardSize() {
        return cards.size();
    }

    public List<Card> getCards() {
        return cards;
    }
}
