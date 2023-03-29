package com.snake.redsnake.Controllers.Animations;

import javafx.scene.Node;

//Interface Animation that contains 4 abstract methods which passes 1 argument.
public interface Animation {
    void createAnimationUp(Node snake);
    void createAnimationLeft(Node snake);
    void createAnimationDown(Node snake);
    void createAnimationRight(Node snake);
}

//Todo -> Last checked at 29-3-2023 11:43.