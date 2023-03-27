package com.snake.redsnake.Controllers.Collisions;

import com.snake.redsnake.Controllers.Scores.ScoreController;
import javafx.scene.layout.Pane;
import javafx.scene.Node;
import java.util.List;
import javafx.scene.shape.Rectangle;
import javafx.geometry.BoundingBox;
import javafx.scene.paint.Color;

//Class CollisionController that implements the Collision interface which makes the collision possible.
public class CollisionController implements Collision {
    private final Entities entities = new Entities();
    private final ScoreController scoreController = new ScoreController();

    //A method createCollision that handles the collision between Rectangle objects.
    @Override
    public void createCollision(Pane pane, Node snake) {
        List<Rectangle> rectangle = entities.createEntities(pane);
        BoundingBox boundingBox = (BoundingBox) snake.getBoundsInParent();

        //A boolean variable that takes the red Rectangle and checks if this rectangle is intersecting with the snake.
        //First it filters the correct Rectangle object, then the BoundingBox is created. Lastly the object only returns
        //true if the snake intersects with the Red Rectangle!
        boolean intersect = rectangle.stream()
            .filter(r -> r.getFill().equals(Color.RED))
            .map(r -> new BoundingBox(r.getTranslateX(), r.getTranslateY(), r.getWidth(), r.getHeight()))
            .anyMatch(boundingBox::intersects);

        //A boolean variable that skips the red Rectangle and checks if the brown rectangles are intersecting with the snake.
        //First it filters the correct Rectangle objects, then the BoundingBox is created. Lastly the objects only returns
        //true if the snake intersects with the Brown Rectangles!
        boolean intersects = rectangle.stream()
            .skip(1)
            .map(r -> new BoundingBox(r.getTranslateX(), r.getTranslateY(), r.getWidth(), r.getHeight()))
            .anyMatch(boundingBox::intersects);

        //If the red Rectangle intersects with the snake then the score will be incremented and a new set of Rectangles
        //will spawn.
        if (intersect) {
            scoreController.createScore(+1);
            scoreController.getScore();
            pane.getChildren().removeAll(rectangle);
            entities.createEntities(pane);
        }

        //If the brown Rectangles intersects with the snake then its Game Over and the game will close and prints the
        //current score.
        if (intersects) {
            System.out.printf("\u001B[32mGame Over! Current score is: %d", scoreController.getScore());
            throw new IllegalStateException("Application closed!");
        }
    }
}

//Todo -> Last checked at 27-3-2023 18:00.