package com.kerosilas.dekki;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.util.Duration;

public class DeckListController {

    @FXML
    private VBox again;

    @FXML
    private HBox answerHBox;

    @FXML
    private VBox backVBox;

    @FXML
    private HBox cardDivider;

    @FXML
    private VBox createDeck;

    @FXML
    private VBox deckListVBox;

    @FXML
    private VBox deckViewVBox;

    @FXML
    private VBox frontVBox;

    @FXML
    private VBox good;

    @FXML
    private HBox ratingHBox;

    @FXML
    private VBox showAnswer;


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

        Animation animation1 = new ColorAnimation(Color.hsb(161, 0.98, 0.64), 0.13, createDeck, Duration.millis(140L));
        Animation animation2 = new ColorAnimation(Color.hsb(0, 0, 0.26), 0.08, again, Duration.millis(140L));
        Animation animation3 = new ColorAnimation(Color.hsb(0, 0, 0.26), 0.08, good, Duration.millis(140L));
        Animation animation4 = new ColorAnimation(Color.hsb(0, 0, 0.26), 0.08, showAnswer, Duration.millis(140L));

        createDeck.setOnMousePressed(e -> {
            animation1.playFromStart();
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
