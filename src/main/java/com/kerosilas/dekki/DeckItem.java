package com.kerosilas.dekki;

import javafx.animation.Animation;
import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.util.Duration;

// This is the controller class for creating and handling the UI components
public class DeckItem extends VBox {

    private HBox hbox1;

    private Label label1;

    private HBox hbox2;

    private GridPane gridPane;

    private Label label2;

    private Label label3;

    private Label label4;

    private Label label5;

    // Create a constructor that initializes the UI components
    public DeckItem(String name, int n, int d, int l, int t) {

        // Set the alignment and spacing of the deck VBox
        setAlignment(Pos.CENTER_LEFT);
        setSpacing(6.0);
        setId("deck");

        // Create a new HBox for the first row
        hbox1 = new HBox();

        // Set the alignment and preferred height of the first HBox
        hbox1.setAlignment(Pos.CENTER_LEFT);
        hbox1.setPrefHeight(24.0);

        // Create a new label for the first row
        label1 = new Label();

        // Set the text and text fill of the first label
        label1.setText(name);
        label1.setTextFill(Color.web("#dddddd"));

        // Set the font of the first label
        Font font1 = new Font("System Bold", 14.0);
        label1.setFont(font1);

        // Add the label to the first HBox
        hbox1.getChildren().add(label1);

        // Set the margin of the first HBox in the deck VBox
        VBox.setMargin(hbox1, new Insets(0, 0, 0, 0));

        // Create a new HBox for the second row
        hbox2 = new HBox();

        // Set the alignment and max/min/preferred height of the second HBox
        hbox2.setAlignment(Pos.CENTER_LEFT);
        hbox2.setMaxHeight(1.0);
        hbox2.setMinHeight(1.0);
        hbox2.setPrefHeight(1.0);

        // Set the style of the second HBox
        hbox2.setStyle("-fx-background-color: #404040;");

        // Create a new grid pane for the third row
        gridPane = new GridPane();

        // Set the alignment of the grid pane
        gridPane.setAlignment(Pos.CENTER);

        // Create four column constraints for the grid pane
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setHgrow(Priority.SOMETIMES);
        col1.setMinWidth(10.0);
        col1.setPrefWidth(100.0);

        ColumnConstraints col2 = new ColumnConstraints();
        col2.setHgrow(Priority.SOMETIMES);
        col2.setMinWidth(10.0);
        col2.setPrefWidth(100.0);

        ColumnConstraints col3 = new ColumnConstraints();
        col3.setHgrow(Priority.SOMETIMES);
        col3.setMinWidth(10.0);
        col3.setPrefWidth(100.0);

        ColumnConstraints col4 = new ColumnConstraints();
        col4.setHgrow(Priority.SOMETIMES);
        col4.setMinWidth(10.0);
        col4.setPrefWidth(100.0);

        // Add the column constraints to the grid pane
        gridPane.getColumnConstraints().addAll(col1, col2, col3, col4);

        // Create a row constraint for the grid pane
        RowConstraints row1 = new RowConstraints();
        row1.setPrefHeight(24.0);
        row1.setValignment(VPos.CENTER);
        row1.setVgrow(Priority.ALWAYS);

        // Add the row constraint to the grid pane
        gridPane.getRowConstraints().add(row1);

        // Create four labels for the grid pane
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        label5 = new Label();

        // Set the text and text fill of the second label
        label2.setText(String.valueOf(n));
        label2.setTextFill(Color.web("#05e5f5"));

        Tooltip tooltip1 = new Tooltip("New cards");
        tooltip1.setShowDelay(Duration.millis(300));
        label2.setTooltip(tooltip1);

        // Set the font of the second label
        Font font2 = new Font(14.0);
        label2.setFont(font2);

        // Set the grid pane properties of the second label
        GridPane.setHalignment(label2, HPos.CENTER);
        GridPane.setHgrow(label2, Priority.ALWAYS);
        GridPane.setValignment(label2, VPos.CENTER);
        GridPane.setVgrow(label2, Priority.ALWAYS);

        // Set the text and text fill of the third label
        label3.setText(String.valueOf(d));
        label3.setTextFill(Color.web("#0ceb5e"));

        Tooltip tooltip2 = new Tooltip("Due cards");
        tooltip2.setShowDelay(Duration.millis(300));
        label3.setTooltip(tooltip2);

        // Set the font of the third label
        label3.setFont(font2);

        // Set the grid pane properties of the third label
        GridPane.setColumnIndex(label3, 1);
        GridPane.setHalignment(label3, HPos.CENTER);
        GridPane.setHgrow(label3, Priority.ALWAYS);
        GridPane.setValignment(label3, VPos.CENTER);
        GridPane.setVgrow(label3, Priority.ALWAYS);

        // Set the text and text fill of the fourth label
        label4.setText(String.valueOf(l));
        label4.setTextFill(Color.web("#ff9700"));

        Tooltip tooltip3 = new Tooltip("Learning cards");
        tooltip3.setShowDelay(Duration.millis(300));
        label4.setTooltip(tooltip3);

        // Set the font of the fourth label
        label4.setFont(font2);

        // Set the grid pane properties of the fourth label
        GridPane.setColumnIndex(label4, 2);
        GridPane.setHalignment(label4, HPos.CENTER);
        GridPane.setHgrow(label4, Priority.ALWAYS);
        GridPane.setValignment(label4, VPos.CENTER);
        GridPane.setVgrow(label4, Priority.ALWAYS);

        // Set the text and text fill of the fifth label
        label5.setText(String.valueOf(t));
        label5.setTextFill(Color.web("#dddddd"));

        Tooltip tooltip4 = new Tooltip("Total # of cards");
        tooltip4.setShowDelay(Duration.millis(300));
        label5.setTooltip(tooltip4);

        // Set the font of the fifth label
        label5.setFont(font2);

        // Set the grid pane properties of the fifth label
        GridPane.setColumnIndex(label5, 3);
        GridPane.setHalignment(label5, HPos.CENTER);
        GridPane.setHgrow(label5, Priority.ALWAYS);
        GridPane.setValignment(label5, VPos.CENTER);
        GridPane.setVgrow(label5, Priority.ALWAYS);

        // Add the labels to the grid pane
        gridPane.getChildren().addAll(label2, label3, label4, label5);

        // Set the padding of the deck VBox
        setPadding(new Insets(6.0, 12.0, 6.0, 12.0));

        // Set the cursor of the deck VBox
        setCursor(Cursor.HAND);

        Animation animation1 = new ColorAnimation(Color.hsb(0, 0, 0.26), 0.07, this, Duration.millis(140L));
        Animation animation2 = new ColorAnimation(Color.hsb(0, 0, 0.26), 0.03, this, Duration.millis(140L));

        setOnMousePressed(e -> {
            Platform.runLater(() -> {
                requestFocus();
                if(isFocused()) {
                    animation2.playFromStart();
                } else {
                    animation1.playFromStart();
                }
            });
        });

        // Add the HBoxes and grid pane to the deck VBox
        getChildren().addAll(hbox1, hbox2, gridPane);

    }
}