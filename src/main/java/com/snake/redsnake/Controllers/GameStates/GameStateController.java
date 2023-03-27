package com.snake.redsnake.Controllers.GameStates;

import javafx.scene.Node;
import com.snake.redsnake.Enums.Direction;

//Class GameStateController that implements the GameState interface to check if the snake is off the canvas off the Pane.
public class GameStateController implements GameState {
    private static final int PANE_X = 930;
    private static final int PANE_Y = 600;

    private final Node snake;
    private final Direction direction;
    private final double x;
    private final double y;

    public GameStateController(Node snake, Direction direction) {
        this.snake = snake;
        this.direction = direction;
        this.x = snake.getTranslateX();
        this.y = snake.getTranslateY();
    }

    //A method createGameState with a switch that handles the state for all directions.
    @Override
    public void createGameState() {
        switch (this.direction) {
            case UP -> {
                if (y + 0 < 0)
                    snake.setTranslateY(PANE_Y);
            }

            case LEFT -> {
                if (x + 0 < 0)
                    snake.setTranslateX(PANE_X);
            }

            case DOWN -> {
                if (y + 0 > PANE_Y)
                    snake.setTranslateY(0);
            }

            case RIGHT -> {
                if (x + 0 > PANE_X)
                    snake.setTranslateX(0);
            }

            default -> {}
        }
    }
}

//Todo -> Last checked at 27-3-2023 14:48.