import java.util.Collections;
import java.util.List;

public class AI extends Player {
    public AI(Hand hand) {
        super(hand);
    }

    @Override
    void nameHimself() {
        String name = "AI" + getRandomNumber(10000);
        System.out.printf("My name is %s \n", name);
        this.setName("AI" + name);
    }

    @Override
    Card show() {
        if (this.getHand().getCards().size() == 0) {
            return null;
        }
        Collections.shuffle(this.getHand().getCards());
        return this.getHand().getCards().remove(0);
    }

    @Override
    void exchangeHands(List<Player> players) {
        if (this.getExchangeCard() != null) {
            throw new IllegalStateException("Already exchanged, you cannot do it again.");
        }

        if (getRandomNumber(2) == 1) {
            this.setExchangeCard(new ExchangeCard(this, players.get(getRandomNumber(players.size()))));
        }
    }

    private int getRandomNumber(int size) {
        return (int) Math.floor(Math.random() * size);
    }
}
