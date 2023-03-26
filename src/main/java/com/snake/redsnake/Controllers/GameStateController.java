package com.snake.redsnake.Controllers;

import com.snake.redsnake.Interfaces.GameBounds;
import javafx.scene.Node;

//GameStateController class that implements the GameBounds interface.
public class GameStateController implements GameBounds {
    //Private static final constants that has the stated values.
    private static final int SNAKE_X = 0;
    private static final int SNAKE_Y = 0;
    private static final int PANE_X = 930;
    private static final int PANE_Y = 600;

    //A public Node gameBoundsUp method that checks if the snake goes out of bounds from the canvas on the pane in the scene.
    @Override
    public void gameBoundsUp(Node snake) {
        double y = snake.getTranslateY();

        //If the snake is beyond the bounds, it goes to the other side DOWN.
        if (y + SNAKE_Y < 0)
            snake.setTranslateY(PANE_Y);
    }

    //A public Node gameBoundsLeft method that checks if the snake goes out of bounds from the canvas on the pane in the scene.
    @Override
    public void gameBoundsLeft(Node snake) {
        double x = snake.getTranslateX();

        //If the snake is beyond the bounds, it goes to the other side RIGHT.
        if (x + SNAKE_X < 0)
            snake.setTranslateX(PANE_X);
    }

    //A public Node gameBoundsDown method that checks if the snake goes out of bounds from the canvas on the pane in the scene.
    @Override
    public void gameBoundsDown(Node snake) {
        double y = snake.getTranslateY();

        //If the snake is beyond the bounds, it goes to the other side UP.
        if (y + SNAKE_Y > PANE_Y)
            snake.setTranslateY(SNAKE_Y);
    }

    //A public Node gameBoundsRight method that checks if the snake goes out of bounds from the canvas on the pane in the scene.
    @Override
    public void gameBoundsRight(Node snake) {
        double x = snake.getTranslateX();

        //If the snake is beyond the bounds, it goes to the other side LEFT.
        if (x + SNAKE_X > PANE_X)
            snake.setTranslateX(SNAKE_X);
    }
}