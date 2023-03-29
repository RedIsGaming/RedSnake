package com.snake.redsnake.TestControllers.TestUtils;

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
        assertTrue(result < 1);
        assertDoesNotThrow(scoreController::createScore);
    }
}

//Todo -> Last checked at 27-3-2023 17:55 (works)