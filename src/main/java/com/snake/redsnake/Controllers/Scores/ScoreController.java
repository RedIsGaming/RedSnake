package com.snake.redsnake.Controllers.Scores;

//Class ScoreController that keeps track of the current score. It is used for collisions.
public class ScoreController {
    private int score = 0;

    //A method createScore that adds a score with 1 whenever the red Rectangle is intersected.
    public void createScore() {
        score++;
        System.out.printf("\u001B[36mYour current score is: %d%n", score);
    }

    //A method getScore that adds a score with 1 whenever the red Rectangle is intersected or whenever its Game Over.
    public Integer getScore() {
        return score;
    }
}

//Todo -> Last checked at 27-3-2023 18:04