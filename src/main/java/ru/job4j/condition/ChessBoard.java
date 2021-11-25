package ru.job4j.condition;

import static java.lang.Math.abs;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 < 8 && x1 >= 0 && x2 < 8 && x2 >= 0
                && y1 < 8 && y1 >= 0 && y2 < 8 && y2 >= 0) {
            if (abs(x2 - x1) == abs(y2 - y1)) {
                rsl = abs(x2 - x1);
            }
        }
        return rsl;
    }
}
