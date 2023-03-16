package com.snake.redsnake.Controllers;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.fxml.FXML;

//Interface keybinds that contains the abstract methods for wasd and arrow handlers.
interface keybinds {
    String moveUp(KeyEvent eventUp); //W || ↑
    String moveLeft(KeyEvent eventLeft); //A || ←
    String moveDown(KeyEvent eventDown); //S || ↓
    String moveRight(KeyEvent eventRight); //D || →
}

//class MoveController that implement the keybinds interface.
public class MoveController implements keybinds {
    //Method moveUp for W and ↑ keybinds.
    @Override
    public String moveUp(KeyEvent eventUp) {
        return eventUp.getCode() == KeyCode.W || eventUp.getCode() == KeyCode.KP_UP ? "Going up!" : "Wrong key!";
    }

    //Method moveLeft for A and ← keybinds.
    @Override
    public String moveLeft(KeyEvent eventLeft) {
        return eventLeft.getCode() == KeyCode.A || eventLeft.getCode() == KeyCode.KP_LEFT ? "Going left!" : "Wrong key!";
    }

    //Method moveDown for S and ↓ keybinds.
    @Override
    public String moveDown(KeyEvent eventDown) {
        return eventDown.getCode() == KeyCode.S || eventDown.getCode() == KeyCode.KP_DOWN ? "Going down!" : "Wrong key!";
    }

    //Method moveRight for D and → keybinds.
    @Override
    public String moveRight(KeyEvent eventRight) {
        return eventRight.getCode() == KeyCode.D || eventRight.getCode() == KeyCode.KP_RIGHT ? "Going right!" : "Wrong key!";
    }
}