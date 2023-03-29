package com.snake.redsnake.TestControllers.TestUtils;

import org.junit.jupiter.api.Test;
import javafx.scene.canvas.Canvas;
import com.snake.redsnake.Controllers.Canvas.CanvasController;
import static org.junit.jupiter.api.Assertions.*;

//Test class TestCanvasController with 1 method testCreateCanvas.
public class TestCanvasController {
    @Test
    protected void testCreateCanvas() {
        //Arrange and act.
        Canvas result = CanvasController.createCanvas();

        //Assert.
        assertNotNull(result);
        assertInstanceOf(Canvas.class, result);
        assertNotSame(result, new Canvas());
    }
}

//Todo -> Last checked at 27-3-2023 17:35 (works)