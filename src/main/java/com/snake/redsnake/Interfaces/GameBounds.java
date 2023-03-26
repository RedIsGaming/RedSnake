package com.snake.redsnake.Interfaces;

import javafx.scene.Node;

//GameBounds interface that takes 4 abstract methods: gameBoundsUp, gameBoundsLeft, gameBoundsDown and gameBoundsRight.
//They all contain the snake Node.
public interface GameBounds {
    void gameBoundsUp(Node snake);
    void gameBoundsLeft(Node snake);
    void gameBoundsDown(Node snake);
    void gameBoundsRight(Node snake);
}