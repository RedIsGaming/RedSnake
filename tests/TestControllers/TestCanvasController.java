package TestControllers;

import com.snake.redsnake.Controllers.*;
import org.junit.jupiter.api.Test;
import javafx.scene.canvas.Canvas;
import static org.junit.jupiter.api.Assertions.*;

//A public TestCanvasController class for Unit Testing.
public class TestCanvasController {
    //A protected testCreateCanvas method that returns nothing and test if the conditions are met.
    @Test
    protected void testCreateCanvas() {
        //Arrange and act.
        Canvas result = CanvasController.createCanvas();

        //Assert.
        assertNotNull(result);
        assertInstanceOf(Canvas.class, result);
    }
}