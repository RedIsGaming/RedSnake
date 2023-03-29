package com.snake.redsnake.Controllers.Collisions;

import com.snake.redsnake.Controllers.Scores.ScoreController;
import javafx.scene.layout.Pane;
import javafx.scene.Node;
import java.util.List;
import javafx.scene.shape.Rectangle;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;

//Class CollisionController that implements the Collision interface which makes the collision possible.
public class CollisionController implements Collision {
    private final Entities entities = new Entities();
    private final ScoreController scoreController = new ScoreController();

    //A method createCollision that handles the collision between Rectangle objects.
    @Override
    public void createCollision(Pane pane, Node snake) {
        //Creates the entities on the Pane on the Scene.
        List<Rectangle> rectangle = entities.createEntities(pane);

        //Updates the position of the snake every 0.2 seconds and checks for collision.
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(200), event -> {
            if (snake.getBoundsInParent().intersects(rectangle.get(0).getBoundsInParent())) {
                scoreController.createScore();
                scoreController.getScore();
                pane.getChildren().removeAll(rectangle);
                entities.createEntities(pane);
            }

            for (int i = 1; i < rectangle.size(); i++) {
                if (snake.getBoundsInParent().intersects(rectangle.get(i).getBoundsInParent())) {
                    System.out.printf("\u001B[32mGame Over! Current score is: %d%n", scoreController.getScore());
                    System.exit(0);
                }
            }
        }));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}

//Todo -> Last checked at 29-3-2023 14:13.