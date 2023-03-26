package com.snake.redsnake.Controllers;

import com.snake.redsnake.Interfaces.Collision;
import javafx.scene.layout.Pane;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import java.util.List;
import javafx.scene.paint.Color;
import javafx.geometry.BoundingBox;
import java.util.Objects;

//FoodController class that implements the Food interface.
public class CollisionController implements Collision {
    //New Controller instances from the FoodController and ScoreController.
    private final FoodController foodController = new FoodController();
    private final ScoreController scoreController = new ScoreController();

    //A public void createCollision method that takes a Pane argument that is set to the scene and a snake Node argument.
    @Override
    public void createCollision(Pane pane, Node snake) {
        //New Rectangle List which gets the copy from the createFood method and a pane that is sent as argument. Also
        //makes a BoundingBox that puts all settings on the snake to the boundingBox.
        List<Rectangle> rectangle = foodController.createFood(pane);
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
            foodController.createFood(pane);
        }

        //If the snake exists and gets in touch with the brown rectangles, its game over and will show the current score.
        //A new IllegalStateException will be thrown that says that the application has been closed!
        if (snake instanceof Rectangle && intersects) {
            System.out.printf("\u001B[32mGame Over! Current score is: %d", scoreController.scoreCounter());
            throw new IllegalStateException("Application closed!");
        }
    }
}