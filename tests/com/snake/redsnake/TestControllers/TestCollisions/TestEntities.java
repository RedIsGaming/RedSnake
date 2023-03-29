package com.snake.redsnake.TestControllers.TestCollisions;

import org.junit.jupiter.api.Test;
import com.snake.redsnake.Controllers.Collisions.Entities;
import javafx.scene.layout.Pane;
import java.util.List;
import javafx.scene.shape.Rectangle;
import static org.junit.jupiter.api.Assertions.*;

//Test class TestEntities with 1 method testCreateEntities.
public class TestEntities {
    @Test
    protected void testCreateEntities() {
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

//Todo -> Last checked at 29-3-2023 14:31 (works)