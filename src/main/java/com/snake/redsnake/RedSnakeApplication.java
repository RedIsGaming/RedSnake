package com.snake.redsnake;

import javafx.application.Application;
import javafx.scene.Node;
import com.snake.redsnake.Enums.Direction;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import javafx.scene.shape.Rectangle;
import javafx.scene.canvas.Canvas;
import com.snake.redsnake.Controllers.Canvas.CanvasController;
import com.snake.redsnake.Controllers.Collisions.CollisionController;
import com.snake.redsnake.Controllers.Movements.MovementController;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

//Class RedSnakeApplication that extends the Application class which is the Entry Point for the Javafx (GUI) program.
public class RedSnakeApplication extends Application {
    private Node snake;
    private final Direction direction = Direction.RIGHT;

    //A method start with a Stage that might throw an IOException when the program fails. This method is needed to set
    //and get all relevant Controllers and classes to let the main program run properly.
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RedSnakeApplication.class.getResource("redsnake-view.fxml"));
        Pane pane = fxmlLoader.load();
        Node node = pane.lookup("#player");

        //Important condition to set the Node to a Rectangle and to get all the relevant settings, so it's not null.
        if (node instanceof Rectangle)
            snake = node;

        //The snake can still be null. This checks for the first object on the Pane or else null is returned.
        snake = pane.getChildren().stream()
            .findFirst()
            .orElse(null);

        Canvas canvas = CanvasController.createCanvas();
        pane.getChildren().add(canvas);

        CollisionController collisionController = new CollisionController();
        collisionController.createCollision(pane, snake);

        //The MovementController is placed here, because direction could be null, so it has the default Direction Right value.
        MovementController movementController = new MovementController(snake, direction);
        Scene scene = new Scene(pane, 960, 630, Color.rgb(0, 0 ,0));
        scene.setOnKeyPressed(event -> movementController.createMovement(event, snake));

        stage.setTitle("Snake game powered by RedIsGaming!");
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
    }

    //A method main that launches the start method and compiles everything that is connected to it. A message is created.
    public static void main(String[] args) {
        System.out.println("\u001B[31mWelcome to RedSnake game! Have fun, you can use the WASD or Arrow Keys to start!");
        launch();
    }
}

//Todo -> Last checked at 28-3-2023 10:04