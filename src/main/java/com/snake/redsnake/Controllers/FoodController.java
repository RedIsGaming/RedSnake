package com.snake.redsnake.Controllers;

import javafx.scene.layout.Pane;
import java.util.Random;
import javafx.scene.shape.Rectangle;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;
import javafx.scene.paint.Color;

//FoodController class.
public class FoodController {
    //A private static final RECTANGLE_SIZE, PANE_BLOCK_WIDTH and PANE_BLOCK_HEIGHT constant that has fixed values.
    private static final int RECTANGLE_SIZE = 30;
    private static final int PANE_BLOCK_WIDTH = 32;
    private static final int PANE_BLOCK_HEIGHT = 21;

    //A public void createFood method that takes a Pane argument that is set to the scene.
    public List<Rectangle> createFood(Pane pane) {
        //New random Random.
        Random random = new Random();

        //List that contains rectangles and puts 11 rectangles on the pane. Creates new Rectangles with the width and
        //height of 30x30 and color. Also set a random x and y, position for them.
        List<Rectangle> rectangle = new ArrayList<>(IntStream.range(0, 11)
            .mapToObj(i -> {
                Rectangle rectangles = new Rectangle(RECTANGLE_SIZE, RECTANGLE_SIZE, Color.rgb(101, 51, 1));
                rectangles.setTranslateX(random.nextInt(Math.round(PANE_BLOCK_WIDTH)) * RECTANGLE_SIZE);
                rectangles.setTranslateY(random.nextInt(Math.round(PANE_BLOCK_HEIGHT)) * RECTANGLE_SIZE);

                //Only set the first rectangle to red.
                if (i == 0)
                    rectangles.setFill(Color.rgb(255, 0, 0));

                return rectangles;
            })
        .toList());

        //Add the rectangle List to the pane to show it.
        pane.getChildren().addAll(rectangle);
        pane.layout();

        return rectangle;
    }
}