package com.snake.redsnake.Controllers.Movements;

import javafx.scene.input.KeyEvent;
import javafx.scene.Node;

//Interface Movement that contain 1 abstract method which passes 2 arguments.
public interface Movement {
    void createMovement(KeyEvent event, Node snake);
}

//Todo -> Last checked at 27-3-2023 13:33