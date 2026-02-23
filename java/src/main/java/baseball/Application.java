package baseball;

import io.InputHandler;
import io.InputHandlerImpl;
import io.OutputHandler;
import io.OutputHandlerImpl;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        OutputHandler out = new OutputHandlerImpl();
        InputHandler in = new InputHandlerImpl(out);

        Game game = new Game(
            new Judge(), new RandomGenerator(), in, out
        );

        game.start();
    }
}