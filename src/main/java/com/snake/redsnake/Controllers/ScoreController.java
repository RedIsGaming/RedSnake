package com.snake.redsnake.Controllers;

//ScoreController class that takes a score that contains a counter and is invoked whenever the snake is eating food or
//when its game over.
public class ScoreController {
    private int counter = 0;

    //Invoked whenever the snake is eating food or when its game over.
    public Integer scoreCounter() {
        counter++;

        System.out.printf("\u001B[36mYour current score is: %d%n", counter);
        return counter;
    }
}