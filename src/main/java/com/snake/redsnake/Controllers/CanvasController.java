package com.snake.redsnake.Controllers;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//CanvasController class that has a method createCanvas to put the canvas on the Pane.
public class CanvasController {
    //Different constants that has a WIDTH and HEIGHT for the Canvas and the ZERO and STROKE for the Stroke's on the Canvas.
    private static final int WIDTH = 960;
    private static final int HEIGHT = 630;
    private static final int ZERO = 0;
    private static final int STROKE = 30;

    //Invoked in RedSnakeApplication that puts the canvas on the pane.
    public static Canvas createCanvas() {
        //Canvas with the relevant settings like: width, height, 2D canvas and the color of the Stroke.
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setStroke(Color.GREEN);

        //Loops for the horizontal x and vertical y strokes.
        for (int x = ZERO; x < WIDTH; x += STROKE)
            graphicsContext.strokeLine(x, ZERO, x, HEIGHT);

        for (int y = ZERO; y < HEIGHT; y += STROKE)
            graphicsContext.strokeLine(ZERO, y, WIDTH, y);

        return canvas;
    }
}