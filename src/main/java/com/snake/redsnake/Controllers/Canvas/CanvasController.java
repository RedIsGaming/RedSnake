package com.snake.redsnake.Controllers.Canvas;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//Class CanvasController that contains the relevant settings which is used for the Pane on the Scene.
public class CanvasController {
    private static final int WIDTH = 960;
    private static final int HEIGHT = 630;

    //A method createCanvas that makes a new Canvas and sets stroke per 30 pixels on the x and y line.
    public static Canvas createCanvas() {
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.GREEN);

        for (int x = 0; x < WIDTH; x += 30)
            graphicsContext.strokeLine(x, 0, x, HEIGHT);

        for (int y = 0; y < HEIGHT; y += 30)
            graphicsContext.strokeLine(0, y, WIDTH, y);

        return canvas;
    }
}

//Todo -> Last checked at 27-3-2023 13:58