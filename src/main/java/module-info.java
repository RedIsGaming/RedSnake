module com.snake.redsnake {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.snake.redsnake to javafx.fxml;
    exports com.snake.redsnake;
}