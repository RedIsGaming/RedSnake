package com.snake.redsnake.Interfaces;

import javafx.scene.layout.Pane;
import javafx.scene.Node;

//Collision interface that takes 1 abstract method createCollision that has a pane and snake argument.
//eatFood also takes the snake Node argument.
public interface Collision {
    void createCollision(Pane pane, Node snake);
}