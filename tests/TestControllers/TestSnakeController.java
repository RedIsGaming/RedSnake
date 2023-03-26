package TestControllers;

import com.snake.redsnake.Controllers.*;
import com.snake.redsnake.Interfaces.*;
import org.junit.jupiter.api.Test;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.Node;
import com.snake.redsnake.RedSnakeApplication;
import static org.junit.jupiter.api.Assertions.*;

//A public TestSnakeController class for Unit Testing.
public class TestSnakeController {
    //A protected testMoveSnake method that returns nothing and test if the conditions are met.
    @Test
    protected void testMoveSnake() {
        //Arrange.
        SnakeController snakeController = new SnakeController();

        KeyEvent keyEventW = new KeyEvent(
            KeyEvent.KEY_PRESSED, "W", "W", KeyCode.W, false, false, false, false
        );

        KeyEvent keyEventA = new KeyEvent(
            KeyEvent.KEY_PRESSED, "A", "A", KeyCode.A, false, false, false, false
        );

        KeyEvent keyEventS = new KeyEvent(
            KeyEvent.KEY_PRESSED, "S", "S", KeyCode.S, false, false, false, false
        );

        KeyEvent keyEventD = new KeyEvent(
            KeyEvent.KEY_PRESSED, "D", "D", KeyCode.D, false, false, false, false
        );

        Node snake = RedSnakeApplication.getSnake();

        //Act.
        Position.MoveKey resultW = snakeController.moveSnake(keyEventW, snake);
        Position.MoveKey resultA = snakeController.moveSnake(keyEventA, snake);
        Position.MoveKey resultS = snakeController.moveSnake(keyEventS, snake);
        Position.MoveKey resultD = snakeController.moveSnake(keyEventD, snake);

        //Assert.
        assertDoesNotThrow(() -> {
            Position.MoveKey resultsW = snakeController.moveSnake(keyEventW, snake);
            Position.MoveKey resultsA = snakeController.moveSnake(keyEventW, snake);
            Position.MoveKey resultsS = snakeController.moveSnake(keyEventW, snake);
            Position.MoveKey resultsD = snakeController.moveSnake(keyEventW, snake);
        });

        assertEquals(KeyCode.W, resultW);
        assertEquals(KeyCode.A, resultA);
        assertEquals(KeyCode.S, resultS);
        assertEquals(KeyCode.D, resultD);
    }
}