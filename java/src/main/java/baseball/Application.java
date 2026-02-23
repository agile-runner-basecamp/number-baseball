package baseball;

import io.InputHandlerImpl;
import io.OutputHandlerImpl;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Game game = new Game(
            new Judge(), new RandomGenerator(), new InputHandlerImpl(), new OutputHandlerImpl()
        );

        game.start();
    }
}
