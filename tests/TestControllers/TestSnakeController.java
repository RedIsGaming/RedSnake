package TestControllers;

import com.snake.redsnake.Controllers.SnakeController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javafx.scene.shape.Rectangle;

abstract class TestPosition {
    //protected final SnakeController snakeController = new SnakeController();

    @Test
    protected void testMoveSnake() {}
}
public class TestSnakeController extends TestPosition{
    @Test
    protected void testMoveSnake() {
        //String result = snakeController.moveSnake(30,30);
        //assertEquals("420.0, 450.0", result);
    }
}