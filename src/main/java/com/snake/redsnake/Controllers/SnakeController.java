package com.snake.redsnake.Controllers;

import javafx.scene.input.KeyEvent;
import javafx.scene.Node;
import java.util.Map;
import javafx.scene.input.KeyCode;

//Position interface that takes an abstract method moveSnake that contains a KeyEvent argument based on the user input.
//It also contains the snake Node and there are also takes 2 enums: MoveKey and MoveKeyArrow with the desired keys.
interface Position {
    enum MoveKey {W, A, S, D}
    enum MoveKeyArrow {UP, LEFT, DOWN, RIGHT}
    void moveSnake(KeyEvent event, Node snake);
}

//SnakeController class that implements the Position interface.
public class SnakeController implements Position {
    //New Controller instances from the GameStateController and AnimationController.
    private final GameStateController gameStateController = new GameStateController();
    private final AnimationController animationController = new AnimationController();

    //A private static final DISTANCE constant that has the fixed value of 30.
    private static final int DISTANCE = 30;

    //A Map that contains a Key with an enum Value for the moveKey.
    private final Map<KeyCode, MoveKey> moveKeyMap = Map.of(
        KeyCode.W, MoveKey.W,
        KeyCode.A, MoveKey.A,
        KeyCode.S, MoveKey.S,
        KeyCode.D, MoveKey.D
    );

    //A Map that contains a Key with an enum Value for the moveKeyArrow.
    private final Map<KeyCode, MoveKeyArrow> moveKeyArrowMap = Map.of(
        KeyCode.UP, MoveKeyArrow.UP,
        KeyCode.LEFT, MoveKeyArrow.LEFT,
        KeyCode.DOWN, MoveKeyArrow.DOWN,
        KeyCode.RIGHT, MoveKeyArrow.RIGHT
    );

    //A public void moveSnake method that takes a KeyEvent argument based on the user input.
    @Override
    public void moveSnake(KeyEvent event, Node snake) {
        //Gets an enum moveKey and moveKeyArrow instance from the Position interface.
        MoveKey moveKey = moveKeyMap.get(event.getCode());
        MoveKeyArrow moveKeyArrow = moveKeyArrowMap.get(event.getCode());

        //This condition will invoke whenever the user presses the W- or Arrow UP key.
        if (MoveKey.W == moveKey || MoveKeyArrow.UP == moveKeyArrow) {
            snake.setTranslateY(snake.getTranslateY() - DISTANCE);

            gameStateController.gameBoundsUp(snake);
            animationController.autoMoveUp(snake);
        }

        //This condition will invoke whenever the user presses the A- or Arrow LEFT key.
        if (MoveKey.A == moveKey || MoveKeyArrow.LEFT == moveKeyArrow) {
            snake.setTranslateX(snake.getTranslateX() - DISTANCE);

            gameStateController.gameBoundsLeft(snake);
            animationController.autoMoveLeft(snake);
        }

        //This condition will invoke whenever the user presses the S- or Arrow DOWN key.
        if (MoveKey.S == moveKey || MoveKeyArrow.DOWN == moveKeyArrow) {
            snake.setTranslateY(snake.getTranslateY() + DISTANCE);

            gameStateController.gameBoundsDown(snake);
            animationController.autoMoveDown(snake);
        }

        //This condition will invoke whenever the user presses the D- or Arrow RIGHT key.
        if (MoveKey.D == moveKey || MoveKeyArrow.RIGHT == moveKeyArrow) {
            snake.setTranslateX(snake.getTranslateX() + DISTANCE);

            gameStateController.gameBoundsRight(snake);
            animationController.autoMoveRight(snake);
        }
    }
}