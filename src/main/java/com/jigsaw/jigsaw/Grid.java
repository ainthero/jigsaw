package com.jigsaw.jigsaw;

import javafx.beans.value.ObservableValue;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Grid {
    private final Rectangle[][] rectangles;
    private final Game game;

    public Grid(Game game) {
        rectangles = new Rectangle[9][9];
        this.game = game;
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                rectangles[i][j] = new Rectangle();
                rectangles[i][j].setFill(Color.BLACK);
                rectangles[i][j].setWidth(50);
                rectangles[i][j].setHeight(50);
                int finalI = i;
                int finalJ = j;
                rectangles[i][j].setOnMouseClicked(event -> game.addFigure(finalI - 1, finalJ - 1, game.currentFigure));
                rectangles[i][j].hoverProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean show) -> {
                    restore();
                    previewFigure(finalI - 1, finalJ - 1, game.currentFigure);
                });
            }
        }
    }

    public void restore() {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                rectangles[i][j].setFill(Color.BLACK);
            }
        }
        for (var figure : game.getFigures()) {
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {
                    if (figure.getDots()[i][j] == 1) {
                        int posI = figure.getX() + i;
                        int posJ = figure.getY() + j;
                        rectangles[posI][posJ].setFill(Color.RED);
                    }
                }
            }
        }
    }

    public void previewFigure(int x, int y, Figure figure) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (figure.getDots()[i][j] == 1) {
                    int posI = x + i;
                    int posJ = y + j;
                    if (!checkPos(posI)) continue;
                    if (!checkPos(posJ)) continue;
                    if (rectangles[posI][posJ].getFill().equals(Color.RED)) continue;
                    rectangles[posI][posJ].setFill(Color.VIOLET);
                }
            }
        }
    }

    public boolean addFigure(int x, int y, Figure figure) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (figure.getDots()[i][j] == 1) {
                    int posI = x + i;
                    int posJ = y + j;
                    if (!checkPos(posI)) return false;
                    if (!checkPos(posJ)) return false;
                    if (rectangles[posI][posJ].getFill().equals(Color.RED)) return false;
                }
            }
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (figure.getDots()[i][j] == 1) {
                    int posI = x + i;
                    int posJ = y + j;
                    rectangles[posI][posJ].setFill(Color.RED);
                }
            }
        }
        return true;
    }

    public Rectangle[][] getRectangles() {
        return rectangles;
    }

    static public boolean checkPos(int i) {
        return i >= 0 && i < 9;
    }
}
