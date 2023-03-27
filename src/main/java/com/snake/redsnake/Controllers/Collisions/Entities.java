package com.snake.redsnake.Controllers.Collisions;

import java.util.List;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;
import java.util.Random;
import java.util.ArrayList;
import java.util.stream.IntStream;
import javafx.scene.paint.Color;

//Class Entities that creates the Rectangles that will be set on the Pane in the Scene.
public class Entities {
    private static final int RECTANGLE_SIZE = 30;
    private static final int PANE_BLOCK_WIDTH = 32;
    private static final int PANE_BLOCK_HEIGHT = 21;

    //A method createEntities that creates new Rectangle objects which contains the respected settings.
    public List<Rectangle> createEntities(Pane pane) {
        Random random = new Random();

        //An ArrayList that loops the number of Rectangles which maps them. After that new rectangles are created, that
        //has the respected width and height, color and a random x/y position on the Scene.
        List<Rectangle> rectangle = new ArrayList<>(IntStream.range(0, 11)
            .mapToObj(i -> {
                Rectangle rectangles = new Rectangle(RECTANGLE_SIZE, RECTANGLE_SIZE, Color.rgb(101, 51, 1));
                rectangles.setTranslateX(random.nextInt(Math.round(PANE_BLOCK_WIDTH)) * RECTANGLE_SIZE);
                rectangles.setTranslateY(random.nextInt(Math.round(PANE_BLOCK_HEIGHT)) * RECTANGLE_SIZE);

                //Only fills the first Rectangle to red.
                if (i == 0)
                    rectangles.setFill(Color.rgb(255, 0, 0));

                //Returns the rectangles and put them in a list.
                return rectangles;
            })
        .toList());

        //The rectangle list is added to the Pane.
        pane.getChildren().addAll(rectangle);
        pane.layout();

        return rectangle;
    }
}

//Todo -> Last checked at 27-3-2023 14:20.