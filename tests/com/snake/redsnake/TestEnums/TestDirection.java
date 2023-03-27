package com.snake.redsnake.TestEnums;

import org.junit.jupiter.api.Test;
import com.snake.redsnake.Enums.Direction;
import static org.junit.jupiter.api.Assertions.*;

//Test class TestDirection with 1 method testDirection.
public class TestDirection {
    @Test
    protected void testDirection() {
        //Assert.
        assertEquals(Direction.UP, Direction.valueOf("UP"));
        assertTrue(Direction.values().length == 4);
        assertSame(Direction.LEFT, Direction.valueOf("LEFT"));
    }
}

//Todo -> Last checked at 27-3-2023 17:33