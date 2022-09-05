package com.jigsaw.jigsaw;

import java.util.ArrayList;

public class Game {
    ArrayList<Figure> figures;
    Grid grid;
    Buffer buffer;
    Figure currentFigure;

    Game() {
        figures = new ArrayList<>();
        grid = new Grid(this);
        buffer = new Buffer();
        currentFigure = Figure.generateFigure();
        buffer.setFigure(currentFigure);
    }

    public void restart() {
        figures = new ArrayList<>();
        grid.restore();
        currentFigure = Figure.generateFigure();
        buffer.setFigure(currentFigure);
    }

    public int getMoves() {
        return figures.size();
    }

    public void addFigure(int x, int y, Figure figure) {
        if (grid.addFigure(x, y, figure)) {
            figure.setX(x);
            figure.setY(y);
            figures.add(figure);
            currentFigure = Figure.generateFigure();
            buffer.setFigure(currentFigure);
        }
    }

    public Grid getGrid() {
        return grid;
    }

    public Buffer getBuffer() {
        return buffer;
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }
}
