package com.kerosilas.dekki;

import javafx.animation.*;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.util.Duration;

public class DeckListController {

    @FXML private VBox home, createDeck, again, good, showAnswer, frontVBox, backVBox, deckViewVBox, deckListVBox;
    @FXML private HBox answerHBox, cardDivider, ratingHBox;

    public void initialize() {
        deckListVBox.getChildren().add(new DeckItem("Test",9,9,9,9));
        deckListVBox.getChildren().add(new DeckItem("Test Test",99,99,99,99));
        deckListVBox.getChildren().add(new DeckItem("Test Test Test Test",999,999,999,999));
        deckListVBox.getChildren().add(new DeckItem("Test Test Test Test Test Test Test Test",9999,9999,9999,9999));
        deckListVBox.getChildren().add(new DeckItem("Test",9,9,9,9));
        deckListVBox.getChildren().add(new DeckItem("Test Test",99,99,99,99));
        deckListVBox.getChildren().add(new DeckItem("Test Test Test Test",999,999,999,999));
        deckListVBox.getChildren().add(new DeckItem("Test Test Test Test Test Test Test Test",9999,9999,9999,9999));
        deckListVBox.getChildren().add(new DeckItem("Test",9,9,9,9));
        deckListVBox.getChildren().add(new DeckItem("Test Test",99,99,99,99));
        deckListVBox.getChildren().add(new DeckItem("Test Test Test Test",999,999,999,999));
        deckListVBox.getChildren().add(new DeckItem("Test Test Test Test Test Test Test Test",9999,9999,9999,9999));
        deckListVBox.getChildren().add(new DeckItem("Test",9,9,9,9));
        deckListVBox.getChildren().add(new DeckItem("Test Test",99,99,99,99));
        deckListVBox.getChildren().add(new DeckItem("Test Test Test Test",999,999,999,999));
        deckListVBox.getChildren().add(new DeckItem("Test Test Test Test Test Test Test Test",9999,9999,9999,9999));

        Animation animation1 = new ColorAnimation(Color.hsb(161, 0.98, 0.60), 0.22, createDeck, Duration.millis(140L));
        Animation animation5 = new ColorAnimation(Color.hsb(161, 0.98, 0.60), 0.1, createDeck, Duration.millis(140L));
        Animation animation2 = new ColorAnimation(Color.hsb(0, 0, 0.30), 0.11, again, Duration.millis(140L));
        Animation animation3 = new ColorAnimation(Color.hsb(0, 0, 0.30), 0.11, good, Duration.millis(140L));
        Animation animation4 = new ColorAnimation(Color.hsb(0, 0, 0.30), 0.11, showAnswer, Duration.millis(140L));
        Animation animation7 = new ColorAnimation(Color.hsb(0, 0, 0.30), 0.11, home, Duration.millis(140L));
        Animation animation8 = new ColorAnimation(Color.hsb(0, 0, 0.30), 0.05, home, Duration.millis(140L));


        home.setOnMousePressed(e -> {
            Platform.runLater(() -> {
                home.requestFocus();
                if(home.isFocused()) {
                    animation8.playFromStart();
                } else {
                    animation7.playFromStart();
                }
            });
        });

        createDeck.setOnMousePressed(e -> {
            Platform.runLater(() -> {
                createDeck.requestFocus();
                if(createDeck.isFocused()) {
                    animation5.playFromStart();
                } else {
                    animation1.playFromStart();
                }
            });
        });

        again.setOnMousePressed(e -> {
            animation2.playFromStart();
        });

        good.setOnMousePressed(e -> {
            animation3.playFromStart();
        });

        showAnswer.setOnMousePressed(e -> {
            animation4.playFromStart();
        });
    }

}
