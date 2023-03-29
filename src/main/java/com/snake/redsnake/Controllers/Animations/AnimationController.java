package com.snake.redsnake.Controllers.Animations;

import javafx.scene.Node;
import javafx.animation.AnimationTimer;
import com.snake.redsnake.Enums.Direction;

//Class AnimationController that implements the Animation interface and implements the animation for all directions.
public class AnimationController implements Animation {
    @Override
    public void createAnimationUp(Node snake) {
        AnimationTimer animationTimer = new MovementTimer(snake, Direction.UP);
        animationTimer.start();
    }

    @Override
    public void createAnimationLeft(Node snake) {
        AnimationTimer animationTimer = new MovementTimer(snake, Direction.LEFT);
        animationTimer.start();
    }

    @Override
    public void createAnimationDown(Node snake) {
        AnimationTimer animationTimer = new MovementTimer(snake, Direction.DOWN);
        animationTimer.start();
    }

    @Override
    public void createAnimationRight(Node snake) {
        AnimationTimer animationTimer = new MovementTimer(snake, Direction.RIGHT);
        animationTimer.start();
    }
}

//Todo -> Last checked at 29-3-2023 11:39.