package TestControllers;

import com.snake.redsnake.Controllers.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//A public TestScoreController class for Unit Testing.
public class TestScoreController {
    //A protected testScoreCounter method that returns nothing and test if the conditions are met.
    @Test
    protected void testScoreCounter() {
        //Arrange and act.
        ScoreController scoreController = new ScoreController();
        Integer result = scoreController.scoreCounter();

        //Assert.
        assertEquals(1, result);
        assertFalse(result < 1);
    }
}