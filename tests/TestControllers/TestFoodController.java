package TestControllers;

import com.snake.redsnake.Controllers.*;
import org.junit.jupiter.api.Test;
import javafx.scene.layout.Pane;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import javafx.scene.shape.Rectangle;

//A public TestFoodController class for Unit Testing.
public class TestFoodController {
    //A protected testCreateFood method that returns nothing and test if the conditions are met.
    @Test
    protected void testCreateFood() {
        //Arrange.
        FoodController foodController = new FoodController();
        Pane pane = new Pane();

        //Act.
        List<Rectangle> result = foodController.createFood(pane);

        //Assert.
        assertDoesNotThrow(() -> {
            List<Rectangle> results = foodController.createFood(pane);
        });
        assertNotNull(result);
        assertTrue(result.size() >= 11);
    }
}