package com.jigsaw.jigsaw;

public class FigureGenerator {

    public static int[][] generateDots(int id) {
        int[][] res = null;
        // J figure
        if (id == 0) {
            res = new int[][]{
                    {0, 1, 1},
                    {0, 1, 0},
                    {0, 1, 0}
            };
        }
        if (id == 1) {
            res = new int[][]{
                    {0, 0, 0},
                    {1, 0, 0},
                    {1, 1, 1}
            };
        }
        if (id == 2) {
            res = new int[][]{
                    {0, 1, 0},
                    {0, 1, 0},
                    {1, 1, 0}
            };
        }
        if (id == 3) {
            res = new int[][]{
                    {0, 0, 0},
                    {1, 1, 1},
                    {0, 0, 1}
            };
        }
        // L figure
        if (id == 4) {
            res = new int[][]{
                    {1, 1, 0},
                    {0, 1, 0},
                    {0, 1, 0}
            };
        }
        if (id == 5) {
            res = new int[][]{
                    {0, 0, 1},
                    {1, 1, 1},
                    {0, 0, 0}
            };
        }
        if (id == 6) {
            res = new int[][]{
                    {0, 1, 0},
                    {0, 1, 0},
                    {0, 1, 1}
            };
        }
        if (id == 7) {
            res = new int[][]{
                    {0, 0, 0},
                    {1, 1, 1},
                    {1, 0, 0}
            };
        }
        // S figure
        if (id == 8) {
            res = new int[][]{
                    {1, 0, 0},
                    {1, 1, 0},
                    {0, 1, 0}
            };
        }
        if (id == 9) {
            res = new int[][]{
                    {0, 0, 0},
                    {0, 1, 1},
                    {1, 1, 0}
            };
        }
        if (id == 10) {
            res = new int[][]{
                    {0, 0, 1},
                    {0, 1, 1},
                    {0, 1, 0}
            };
        }
        if (id == 11) {
            res = new int[][]{
                    {0, 0, 0},
                    {1, 1, 0},
                    {0, 1, 1}
            };
        }
        // Long LJ figure
        if (id == 12) {
            res = new int[][]{
                    {0, 0, 1},
                    {0, 0, 1},
                    {1, 1, 1}
            };
        }
        if (id == 13) {
            res = new int[][]{
                    {1, 0, 0},
                    {1, 0, 0},
                    {1, 1, 1}
            };
        }
        if (id == 14) {
            res = new int[][]{
                    {1, 1, 1},
                    {1, 0, 0},
                    {1, 0, 0}
            };
        }
        if (id == 15) {
            res = new int[][]{
                    {1, 1, 1},
                    {0, 0, 1},
                    {0, 0, 1}
            };
        }
        // T figure
        if (id == 16) {
            res = new int[][]{
                    {0, 1, 0},
                    {0, 1, 0},
                    {1, 1, 1}
            };
        }
        if (id == 17) {
            res = new int[][]{
                    {1, 1, 1},
                    {0, 1, 0},
                    {0, 1, 0}
            };
        }
        if (id == 18) {
            res = new int[][]{
                    {1, 0, 0},
                    {1, 1, 1},
                    {1, 0, 0}
            };
        }
        if (id == 19) {
            res = new int[][]{
                    {0, 0, 1},
                    {1, 1, 1},
                    {0, 0, 1}
            };
        }
        // I figure
        if (id == 20) {
            res = new int[][]{
                    {0, 0, 0},
                    {1, 1, 1},
                    {0, 0, 0}
            };
        }
        if (id == 21) {
            res = new int[][]{
                    {0, 1, 0},
                    {0, 1, 0},
                    {0, 1, 0}
            };
        }
        // Dot figure
        if (id == 22) {
            res = new int[][]{
                    {0, 0, 0},
                    {0, 1, 0},
                    {0, 0, 0}
            };
        }
        // Short LJ figure
        if (id == 23) {
            res = new int[][]{
                    {1, 1, 0},
                    {1, 0, 0},
                    {0, 0, 0}
            };
        }
        if (id == 24) {
            res = new int[][]{
                    {0, 1, 1},
                    {0, 0, 1},
                    {0, 0, 0}
            };
        }
        if (id == 25) {
            res = new int[][]{
                    {0, 0, 0},
                    {0, 0, 1},
                    {0, 1, 1}
            };
        }
        if (id == 26) {
            res = new int[][]{
                    {0, 0, 0},
                    {1, 0, 0},
                    {1, 1, 0}
            };
        }
        // Short T figure
        if (id == 27) {
            res = new int[][]{
                    {0, 1, 0},
                    {0, 1, 1},
                    {0, 1, 0}
            };
        }
        if (id == 28) {
            res = new int[][]{
                    {1, 1, 1},
                    {0, 1, 0},
                    {0, 0, 0}
            };
        }
        if (id == 29) {
            res = new int[][]{
                    {0, 1, 0},
                    {1, 1, 0},
                    {0, 1, 0}
            };
        }
        if (id == 30) {
            res = new int[][]{
                    {0, 0, 0},
                    {0, 1, 0},
                    {1, 1, 1}
            };
        }
        return res;
    }
}
