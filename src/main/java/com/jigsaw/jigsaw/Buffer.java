package com.jigsaw.jigsaw;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Buffer {
    private final Rectangle[][] rectangles;

    public Buffer() {
        rectangles = new Rectangle[3][3];
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                rectangles[i][j] = new Rectangle();
                rectangles[i][j].setFill(Color.BLACK);
                rectangles[i][j].setWidth(50);
                rectangles[i][j].setHeight(50);
            }
        }
    }

    public void setFigure(Figure figure) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                rectangles[i][j].setFill(Color.BLACK);
                if (figure.getDots()[i][j] == 1) {
                    rectangles[i][j].setFill(Color.VIOLET);
                }
            }
        }
    }

    public Rectangle[][] getRectangles() {
        return rectangles;
    }
}
