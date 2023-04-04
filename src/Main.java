import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Showdown showdown = new Showdown(Arrays.asList(
                new AI(new Hand()),
                new AI(new Hand()),
                new AI(new Hand()),
                new Human(new Hand())
        ), new Deck());
        showdown.startGame();
    }
}