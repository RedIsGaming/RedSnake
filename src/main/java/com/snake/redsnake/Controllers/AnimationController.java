//This Controller has no relevant comments as there are to many duplicates that disturb the developers sight. Was 114 lines.
package com.snake.redsnake.Controllers;

import com.snake.redsnake.Interfaces.Animation;
import javafx.scene.Node;
import javafx.animation.AnimationTimer;

public class AnimationController implements Animation {
    @Override
    public boolean autoMoveUp(Node snake) {
        AnimationTimer animationTimer = new AnimationTimer() {
            private double x = snake.getTranslateX();
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
        return false;
    }

    @Override
    public boolean autoMoveLeft(Node snake) {
        AnimationTimer animationTimer = new AnimationTimer() {
            private double x = snake.getTranslateX();
            private double y = snake.getTranslateY();

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
        return false;
    }

    @Override
    public boolean autoMoveDown(Node snake) {
        AnimationTimer animationTimer = new AnimationTimer() {
            private double x = snake.getTranslateX();
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
        return false;
    }

    @Override
    public boolean autoMoveRight(Node snake) {
        AnimationTimer animationTimer = new AnimationTimer() {
            private double x = snake.getTranslateX();
            private double y = snake.getTranslateY();

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
        return false;
    }
}