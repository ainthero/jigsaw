package com.jigsaw.jigsaw;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Figure {

    public static Figure generateFigure() {
        Figure res = new Figure();
        res.id = ThreadLocalRandom.current().nextInt(0, 31);
        res.dots = FigureGenerator.generateDots(res.id);
        res.x = -1;
        res.y = -1;
        return res;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[][] getDots() {
        return dots;
    }

    public int getId() {
        return id;
    }

    private int id;
    private int x;
    private int y;
    private int[][] dots;
}
