package com.snake.redsnake.Controllers.Animations;

import javafx.scene.Node;
import javafx.animation.AnimationTimer;
import com.snake.redsnake.Enums.Direction;

//Class AnimationController that implements the Animation interface and implements the animation for all directions.
public class AnimationController implements Animation {
    @Override
    public void createAnimationUp(Node snake) {
        AnimationTimer animationTimer = new MovementTimer(snake, Direction.UP);
        createFade(animationTimer);
        animationTimer.start();
    }

    @Override
    public void createAnimationLeft(Node snake) {
        AnimationTimer animationTimer = new MovementTimer(snake, Direction.LEFT);
        createFade(animationTimer);
        animationTimer.start();
    }

    @Override
    public void createAnimationDown(Node snake) {
        AnimationTimer animationTimer = new MovementTimer(snake, Direction.DOWN);
        createFade(animationTimer);
        animationTimer.start();
    }

    @Override
    public void createAnimationRight(Node snake) {
        AnimationTimer animationTimer = new MovementTimer(snake, Direction.RIGHT);
        createFade(animationTimer);
        animationTimer.start();
    }

    @Override
    public void createFade(AnimationTimer animationTimer) {
        /*final long[] start = {0}; // use array to store the value in a lambda expression

        animationTimer.setOnStart(event -> start[0] = System.nanoTime());

        animationTimer.setOnFinished(event -> {
            Node snake = ((MovementTimer) event.getSource()).getSnake();
            snake.setFill(ORIGINAL_COLOR);
        });

        animationTimer.setOnMouseClicked(event -> {
            Node snake = ((MovementTimer) event.getSource()).getSnake();
            snake.setFill(NEW_COLOR);
        });

        animationTimer.setOnUpdate(event -> {
            Node snake = ((MovementTimer) event.getSource()).getSnake();
            if (System.nanoTime() - start[0] >= COLOR_CHANGE_DELAY * 1_000_000_000L) {
                snake.setFill(NEW_COLOR);
            }
        });*/
    }
}

//Todo -> Last checked at 27-3-2023 13:36.