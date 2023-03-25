package com.snake.redsnake.Controllers;

import javafx.scene.layout.Pane;
import javafx.scene.Node;
import java.util.Random;
import javafx.scene.shape.Rectangle;
import java.util.List;

import java.util.ArrayList;
import java.util.stream.IntStream;
import javafx.scene.paint.Color;
import javafx.geometry.BoundingBox;
import java.util.Objects;

//Food interface that takes 2 abstract methods createFood and eatFood that contains a Pane argument that is set to the scene.
//eatFood also takes the snake Node argument.
interface Food {
    void eatFood(Pane pane, Node snake);
}

//FoodController class that implements the Food interface.
public class FoodController implements Food {
    //New Controller instances from the ScoreController.
    private final ScoreController scoreController = new ScoreController();

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

    //A public void eatFood method that takes a Pane argument that is set to the scene.
    @Override
    public void eatFood(Pane pane, Node snake) {
        //New Rectangle List which gets the copy from the createFood method and a pane that is sent as argument. Also
        //makes a BoundingBox that puts all settings on the snake to the boundingBox.
        List<Rectangle> rectangle = createFood(pane);
        BoundingBox boundingBox = (BoundingBox) snake.getBoundsInParent();

        //boolean intersect variable that skips the red rectangle and check if they intersect with the snake.
        boolean intersect = rectangle.stream()
            .map(r -> {
                if (r.getFill().equals(Color.RED))
                    return r;

                return null;
            })
            .filter(Objects::nonNull)
            .map(r -> new BoundingBox(r.getTranslateX(), r.getTranslateY(), r.getWidth(), r.getHeight()))
            .anyMatch(boundingBox::intersects);

        //boolean intersects variable that skips the red rectangle and check if they intersect with the snake.
        boolean intersects = rectangle.stream()
            .skip(1)
            .map(r -> new BoundingBox(r.getTranslateX(), r.getTranslateY(), r.getWidth(), r.getHeight()))
            .anyMatch(boundingBox::intersects);

        //If the snake exists and gets in touch with the red rectangle, the score counter is incremented by 1 and the
        //rectangles gets removed from the pane. Afterwards a new set of rectangles will spawn and the loops continues.
        if (snake instanceof Rectangle && intersect) {
            scoreController.scoreCounter();
            pane.getChildren().removeAll(rectangle);
            createFood(pane);
        }

        //If the snake exists and gets in touch with the brown rectangles, its game over and will show the current score.
        //A new IllegalStateException will be thrown that says that the application has been closed!
        if (snake instanceof Rectangle && intersects) {
            System.out.printf("Game Over! Current score is: %d", scoreController.scoreCounter());
            throw new IllegalStateException("Application closed!");
        }
    }
}