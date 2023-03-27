package com.snake.redsnake.Controllers.Collisions;

import javafx.scene.layout.Pane;
import javafx.scene.Node;

//Interface Collision that contain 1 abstract method which passes 2 arguments.
public interface Collision {
    void createCollision(Pane pane, Node snake);
}

//Todo -> Last checked at 27-3-2023 13:29.