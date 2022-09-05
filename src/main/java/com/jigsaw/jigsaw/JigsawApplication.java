package com.jigsaw.jigsaw;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class JigsawApplication extends Application {
    int seconds;
    GridPane grid;
    Game game;
    Button endGameButton;
    Button exitButton;
    Label time;
    boolean isAlert;

    private void initGrid() {
        grid.setLayoutX(50);
        grid.setLayoutY(70);
        grid.setHgap(4);
        grid.setVgap(4);
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                grid.add(game.getGrid().getRectangles()[i][j], i, j);
            }
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                grid.add(game.getBuffer().getRectangles()[i][j], 10 + i, j);
            }
        }
        grid.add(endGameButton, 9, 7);
        grid.add(exitButton, 9, 8);
        grid.add(time, 9, 5);
    }

    private void initApp() {
        isAlert = false;
        game = new Game();
        endGameButton = new Button("End game");
        endGameButton.setOnMouseClicked(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Game end");
            alert.setHeaderText("You finished");
            alert.setContentText("Time: " + seconds + ", Moves: " + game.getMoves());
            isAlert = true;
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
                    seconds = 0;
                    isAlert = false;
                    game.restart();
                }
            });

        });
        exitButton = new Button("Exit");
        exitButton.setOnMouseClicked(e -> Platform.exit());
        time = new Label();
        var timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    time.setText("Time: " + seconds);
                    if (!isAlert) {
                        seconds++;
                    }
                });
            }
        }, 0, 1000);
    }

    @Override
    public void start(Stage stage) {
        grid = new GridPane();
        initApp();
        initGrid();
        Scene scene = new Scene(grid, 800, 600);
        stage.setTitle("Jigsaw!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}