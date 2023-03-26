package com.snake.redsnake.Interfaces;

import javafx.scene.Node;

//Animation interface that takes 4 abstract methods: autoMoveUp, autoMoveLeft, autoMoveDown, autoMoveRight. They all
//contain the snake Node argument. There are also 4 public static final constants that are set with the desired value.
public interface Animation {
    public static final int ANIMATION_UP_DOWN = 630;
    public static final int ANIMATION_LEFT_RIGHT = 960;
    public static final int ZERO = 0;
    public static final double SPEED = 2.5;

    boolean autoMoveUp(Node snake);
    boolean autoMoveLeft(Node snake);
    boolean autoMoveDown(Node snake);
    boolean autoMoveRight(Node snake);
}