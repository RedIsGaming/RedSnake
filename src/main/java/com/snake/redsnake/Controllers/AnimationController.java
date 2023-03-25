//This Controller has no relevant comments as there are to many duplicates that disturb the developers sight. Was 114 lines.
//I have to refactor this.
package com.snake.redsnake.Controllers;

import javafx.animation.AnimationTimer;
import javafx.scene.Node;

interface Animation {
    void autoMoveUp(Node snake);
    void autoMoveLeft(Node snake);
    void autoMoveDown(Node snake);
    void autoMoveRight(Node snake);
}

public class AnimationController implements Animation {
    private static final int ANIMATION_UP_DOWN = 630;
    private static final int ANIMATION_LEFT_RIGHT = 960;
    private static final int ZERO = 0;
    private static final double SPEED = 2.5;

    @Override
    public void autoMoveUp(Node snake) {
        AnimationTimer animationTimer = new AnimationTimer() {
            private final double x = snake.getTranslateX();
            private double y = snake.getTranslateY();

            @Override
            public void handle(long timestamp) {
                y -= SPEED;

                if (y < ZERO)
                    y = ANIMATION_UP_DOWN;

                snake.setTranslateX(x);
                snake.setTranslateY(y);
            }
        };
        animationTimer.start();
    }

    @Override
    public void autoMoveLeft(Node snake) {
        AnimationTimer animationTimer = new AnimationTimer() {
            private double x = snake.getTranslateX();
            private final double y = snake.getTranslateY();

            @Override
            public void handle(long timestamp) {
                x -= SPEED;

                if (x < ZERO)
                    x = ANIMATION_LEFT_RIGHT;

                snake.setTranslateX(x);
                snake.setTranslateY(y);
            }
        };
        animationTimer.start();
    }

    @Override
    public void autoMoveDown(Node snake) {
        AnimationTimer animationTimer = new AnimationTimer() {
            private final double x = snake.getTranslateX();
            private double y = snake.getTranslateY();

            @Override
            public void handle(long timestamp) {
                y += SPEED;

                if (y > ANIMATION_UP_DOWN)
                    y = ZERO;

                snake.setTranslateX(x);
                snake.setTranslateY(y);
            }
        };
        animationTimer.start();
    }

    @Override
    public void autoMoveRight(Node snake) {
        AnimationTimer animationTimer = new AnimationTimer() {
            private double x = snake.getTranslateX();
            private final double y = snake.getTranslateY();

            @Override
            public void handle(long timestamp) {
                x += SPEED;

                if (x > ANIMATION_LEFT_RIGHT)
                    x = ZERO;

                snake.setTranslateX(x);
                snake.setTranslateY(y);
            }
        };
        animationTimer.start();
    }
}