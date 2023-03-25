package TestControllers;

//import com.snake.redsnake.Controllers.MoveController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

abstract class TestKeybinds {
    //protected final MoveController moveController = new MoveController();

    @Test
    protected void testMoveUp() {}

    @Test
    protected void testMoveLeft() {}

    @Test
    protected void testMoveDown() {}

    @Test
    protected void testMoveRight() {}
}

public class TestMoveController extends TestKeybinds {
    @Test
    protected void testMoveUp() {
        KeyEvent eventUp = new KeyEvent(KeyEvent.KEY_PRESSED, "", "", KeyCode.W,
            false, false, false, false
        );

        KeyEvent eventKeyUp = new KeyEvent(KeyEvent.KEY_PRESSED, "", "", KeyCode.UP,
            false, false, false, false
        );

        //boolean result = moveController.moveUp(eventUp);
        //assertTrue(result);
    }

    @Test
    protected void testMoveLeft() {
        KeyEvent eventLeft = new KeyEvent(KeyEvent.KEY_PRESSED, "", "", KeyCode.A,
            false, false, false, false
        );

        KeyEvent eventKeyLeft = new KeyEvent(KeyEvent.KEY_PRESSED, "", "", KeyCode.LEFT,
            false, false, false, false
        );

        //boolean result = moveController.moveLeft(eventLeft);
        //assertTrue(result);
    }

    @Test
    protected void testMoveDown() {
        KeyEvent eventDown = new KeyEvent(KeyEvent.KEY_PRESSED, "", "", KeyCode.S,
            false, false, false, false
        );

        KeyEvent eventKeyDown = new KeyEvent(KeyEvent.KEY_PRESSED, "", "", KeyCode.DOWN,
            false, false, false, false
        );

        //boolean result = moveController.moveDown(eventDown);
        //assertTrue(result);
    }

    @Test
    protected void testMoveRight() {
        KeyEvent eventRight = new KeyEvent(KeyEvent.KEY_PRESSED, "", "", KeyCode.D,
            false, false, false, false
        );

        KeyEvent eventKeyRight = new KeyEvent(KeyEvent.KEY_PRESSED, "", "", KeyCode.RIGHT,
            false, false, false, false
        );

        //boolean result = moveController.moveRight(eventRight);
        //assertTrue(result);
    }
}