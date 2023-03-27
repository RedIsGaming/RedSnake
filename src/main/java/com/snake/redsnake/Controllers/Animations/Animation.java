package com.snake.redsnake.Controllers.Animations;

import javafx.scene.Node;
import javafx.animation.AnimationTimer;

//Interface Animation that contains 5 abstract methods which passes 1 argument.
public interface Animation {
    void createAnimationUp(Node snake);
    void createAnimationLeft(Node snake);
    void createAnimationDown(Node snake);
    void createAnimationRight(Node snake);
    void createFade(AnimationTimer animationTimer);
}

//Todo -> Last checked at 28-3-2023 0:35.