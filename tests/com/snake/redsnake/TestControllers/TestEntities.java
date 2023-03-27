package com.snake.redsnake.TestControllers;

import com.snake.redsnake.Controllers.Collisions.Entities;
import org.junit.jupiter.api.Test;
import javafx.scene.layout.Pane;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import javafx.scene.shape.Rectangle;

//A public TestFoodController class for Unit Testing.
public class TestEntities {
    //A protected testCreateFood method that returns nothing and test if the conditions are met.
    @Test
    protected void testCreateFood() {
        //Arrange.
        Entities entities = new Entities();
        Pane pane = new Pane();

        //Act.
        List<Rectangle> result = entities.createEntities(pane);

        //Assert.
        assertDoesNotThrow(() -> {
            List<Rectangle> results = entities.createEntities(pane);
        });
        assertNotNull(result);
        assertTrue(result.size() >= 11);
    }
}