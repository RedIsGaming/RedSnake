package com.snake.redsnake.TestControllers;

import org.junit.jupiter.api.Test;
import com.snake.redsnake.Controllers.Scores.ScoreController;
import static org.junit.jupiter.api.Assertions.*;

//Test class TestScoreController with 1 method testScoreCounter.
public class TestScoreController {
    @Test
    protected void testScoreCounter() {
        //Arrange.
        ScoreController scoreController = new ScoreController();

        //Act.
        Integer result = scoreController.getScore();

        //Assert.
        assertThrows(IllegalArgumentException.class, () -> scoreController.createScore(-1));
        assertTrue(result < 1);
        assertDoesNotThrow(() -> scoreController.createScore(-1));
    }
}

//Todo -> Last checked at 27-3-2023 17:55