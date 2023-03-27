package com.snake.redsnake.TestControllers;

import org.junit.jupiter.api.Test;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.input.KeyEvent;

import javafx.scene.input.KeyCode;
import javafx.scene.Node;
import com.snake.redsnake.RedSnakeApplication;
import javafx.scene.shape.Rectangle;
import static org.junit.jupiter.api.Assertions.*;

//A public TestSnakeController class for Unit Testing.
public class TestMovementController {
    //A protected testMoveSnake method that returns nothing and test if the conditions are met.
    @Test
    protected void testMoveSnake() throws Exception {
        //Arrange.
//        SnakeController snakeController = new SnakeController();
//        RedSnakeApplication redSnakeApplication = new RedSnakeApplication();
//        redSnakeApplication.init();
//
//        FXMLLoader fxmlLoader = new FXMLLoader(RedSnakeApplication.class.getResource("redsnake-view.fxml"));
//        Pane pane = fxmlLoader.load();
//
//        KeyEvent keyEventW = new KeyEvent(
//            KeyEvent.KEY_PRESSED, "W", "W", KeyCode.W, false, false, false, false
//        );
//
//        KeyEvent keyEventA = new KeyEvent(
//            KeyEvent.KEY_PRESSED, "A", "A", KeyCode.A, false, false, false, false
//        );
//
//        KeyEvent keyEventS = new KeyEvent(
//            KeyEvent.KEY_PRESSED, "S", "S", KeyCode.S, false, false, false, false
//        );
//
//        KeyEvent keyEventD = new KeyEvent(
//            KeyEvent.KEY_PRESSED, "D", "D", KeyCode.D, false, false, false, false
//        );
//
//        //Act.
//        Node snake = RedSnakeApplication.getSnake();
//        Node node = pane.lookup("#player");
//
//        if (node instanceof Rectangle)
//            snake = node;
//
//        Position.MoveKey resultW = snakeController.moveSnake(keyEventW, snake);
//        Position.MoveKey resultA = snakeController.moveSnake(keyEventA, snake);
//        Position.MoveKey resultS = snakeController.moveSnake(keyEventS, snake);
//        Position.MoveKey resultD = snakeController.moveSnake(keyEventD, snake);
//
//        Node keyNode = snake;
//
//        //Assert.
//        assertDoesNotThrow(() -> {
//            Position.MoveKey resultsW = snakeController.moveSnake(keyEventW, keyNode);
//            Position.MoveKey resultsA = snakeController.moveSnake(keyEventW, keyNode);
//            Position.MoveKey resultsS = snakeController.moveSnake(keyEventW, keyNode);
//            Position.MoveKey resultsD = snakeController.moveSnake(keyEventW, keyNode);
//        });
//
//        assertEquals(KeyCode.W, resultW);
//        assertEquals(KeyCode.A, resultA);
//        assertEquals(KeyCode.S, resultS);
//        assertEquals(KeyCode.D, resultD);
    }
}