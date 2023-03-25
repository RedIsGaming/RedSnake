package TestControllers;

import com.snake.redsnake.Controllers.ScoreController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestScoreController {
    @Test
    protected void testScoreCounter() {
        ScoreController scoreController = new ScoreController();

        Integer result = scoreController.scoreCounter();
        assertEquals(1, result);
    }
}