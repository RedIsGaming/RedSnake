package com.snake.redsnake;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXMLLoader;

import javafx.scene.layout.Pane;
import com.snake.redsnake.Controllers.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

//RedSnakeApplication class that extends the Application.
public class RedSnakeApplication extends Application {
    //A private static snake Node as Rectangle with a public static method getSnake Node that returns the snake node.
    private static Node snake;

    public static Node getSnake() {
        return snake;
    }

    //A public void start method that contains a Stage in order to capture the Javafx GUI.
    @Override
    public void start(Stage stage) throws IOException {
        //Retrieves a new FXMLLoader with the desired fxml file that will be put in a Pane.
        FXMLLoader fxmlLoader = new FXMLLoader(RedSnakeApplication.class.getResource("redsnake-view.fxml"));
        Pane pane = fxmlLoader.load();

        //Gets the node and looks up for the Rectangle with the rectangle1 ID in order to get a Rectangle and not null.
        Node node = pane.lookup("#player");

        //Condition to check if the node is an instance of the Rectangle
        if (node instanceof Rectangle)
            snake = node;

        //New Controller instances from the FoodController, SnakeController and CanvasController.
        FoodController foodController = new FoodController();
        SnakeController snakeController = new SnakeController();
        Canvas canvas = CanvasController.createCanvas();

        //Calls the foodController instance that puts the pane and snake in the eatFood method and afterwards on the canvas.
        pane.getChildren().add(canvas);
        foodController.eatFood(pane, snake);

        //Get the snake on the pane.
        snake = pane.getChildren()
            .stream()
            .findFirst()
            .orElse(null);

        //Creates a new Scene, with the pane where the canvas is in with the desired width, height and color.
        //Calls the setOnKeyPressed from the snakeController with the method moveSnake in order to let the movement work.
        Scene scene = new Scene(pane, 960, 630, Color.rgb(0, 0 ,0));
        scene.setOnKeyPressed(event -> snakeController.moveSnake(event, snake));

        //Stage settings like the title, the actual scene, the position and the call to show the stage.
        stage.setTitle("Snake game powered by RedIsGaming!");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    //The main program to launch the GUI and a welcome message.
    public static void main(String[] args) {
        System.out.println("Welcome to RedSnake game! Have fun, you can use the WASD or Arrow Keys to start!");
        launch();
    }
}