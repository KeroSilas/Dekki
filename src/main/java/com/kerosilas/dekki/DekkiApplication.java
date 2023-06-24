package com.kerosilas.dekki;

import custom_window.StageOps;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class DekkiApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DekkiApplication.class.getResource("decklist-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.getIcons().add(new Image("file:src/main/resources/com/kerosilas/dekki/icons/dekki2.png"));
        stage.setTitle("Dekki");
        stage.setMinWidth(1040);
        stage.setMinHeight(800);
        stage.setScene(scene);

        Platform.runLater(() -> {
            final var handle = StageOps.findWindowHandle(stage);
            StageOps.setCaptionColor(handle, Color.web("#202020"));
            StageOps.setTextColor(handle, Color.rgb(255, 255, 255));
            StageOps.setBorderColor(handle, Color.web("#303030"));
        });

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}