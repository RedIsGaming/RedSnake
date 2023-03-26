package com.snake.redsnake.Interfaces;

import javafx.scene.input.KeyEvent;
import javafx.scene.Node;

//Position interface that takes an abstract method moveSnake that contains a KeyEvent argument based on the user input.
//It also contains the snake Node and there are also takes 2 enums: MoveKey and MoveKeyArrow with the desired keys.
public interface Position {
    enum MoveKey {W, A, S, D}
    enum MoveKeyArrow {UP, LEFT, DOWN, RIGHT}
    MoveKey moveSnake(KeyEvent event, Node snake);
}