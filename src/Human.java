import java.util.List;

public class Human extends Player{
    public Human(Hand hand) {
        super(hand);
    }

    @Override
    void nameHimself() {

    }

    @Override
    Card show() {
        return this.getHand().getCards().remove(0);
    }

    @Override
    void exchangeHands(List<Player> players) {

    }
}
