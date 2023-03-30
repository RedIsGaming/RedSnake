package com.snake.redsnake.Controllers.Movements;

import javafx.scene.Node;
import com.snake.redsnake.Enums.Direction;
import com.snake.redsnake.Controllers.GameStates.GameStateController;
import com.snake.redsnake.Controllers.Animations.AnimationController;
import java.util.Map;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

//Class MovementController that implements the Movement interface which handles the KeyEvents for all directions.
public class MovementController implements Movement {
    private static final int DISTANCE = 30;

    private final GameStateController gameStateController;
    private final AnimationController animationController = new AnimationController();

    public MovementController(Node snake, Direction direction) {
        this.gameStateController = new GameStateController(snake, direction);
    }

    //A Map that contains keys with KeyCodes and an enum that has different direction values.
    private final Map<KeyCode, Direction> moveKey = Map.of(
        KeyCode.W, Direction.UP,
        KeyCode.A, Direction.LEFT,
        KeyCode.S, Direction.DOWN,
        KeyCode.D, Direction.RIGHT,

        KeyCode.UP, Direction.UP,
        KeyCode.LEFT, Direction.LEFT,
        KeyCode.DOWN, Direction.DOWN,
        KeyCode.RIGHT, Direction.RIGHT
    );

    //A method createMovement which gets a direction with a KeyCode. After that the switch will handle all the directions.
    @Override
    public void createMovement(KeyEvent event, Node snake) {
        Direction direction = moveKey.get(event.getCode());

        switch (direction) {
            case UP -> {
                snake.setTranslateY(snake.getTranslateY() - DISTANCE);
                animationController.createAnimationUp(snake);
            }

            case LEFT -> {
                snake.setTranslateX(snake.getTranslateX() - DISTANCE);
                animationController.createAnimationLeft(snake);
            }

            case DOWN -> {
                snake.setTranslateY(snake.getTranslateY() + DISTANCE);
                animationController.createAnimationDown(snake);
            }

            case RIGHT -> {
                snake.setTranslateX(snake.getTranslateX() + DISTANCE);
                animationController.createAnimationRight(snake);
            }
        }

        gameStateController.createGameState();
    }
}

//Todo -> Last checked at 27-3-2023 14:52