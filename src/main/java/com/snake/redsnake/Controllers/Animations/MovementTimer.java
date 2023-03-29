package com.snake.redsnake.Controllers.Animations;

import javafx.animation.AnimationTimer;
import javafx.scene.Node;
import com.snake.redsnake.Enums.Direction;

//Class MovementTimer that extends the AnimationTimer class and creates an animation for all directions.
public class MovementTimer extends AnimationTimer {
    private static final double SPEED = 2.5;

    private final Node snake;
    private final Direction direction;
    private double x;
    private double y;

    public MovementTimer(Node snake, Direction direction) {
        this.snake = snake;
        this.direction = direction;
        this.x = snake.getTranslateX();
        this.y = snake.getTranslateY();
    }

    //A method handle with a switch that handles the animation for all directions.
    @Override
    public void handle(long timestamp) {
        switch (this.direction) {
            case UP -> {
                y -= SPEED;

                if (y < 0)
                    y = 630;
            }

            case LEFT -> {
                x -= SPEED;

                if (x < 0)
                    x = 960;
            }

            case DOWN -> {
                y += SPEED;

                if (y > 630)
                    y = 0;
            }

            case RIGHT -> {
                x += SPEED;

                if (x > 960)
                    x = 0;
            }

            default -> {}
        }

        snake.setTranslateX(x);
        snake.setTranslateY(y);
    }
}

//Todo -> Last checked at 27-3-2023 13:39.