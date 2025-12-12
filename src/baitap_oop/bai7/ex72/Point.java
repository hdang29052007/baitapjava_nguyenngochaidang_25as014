package baitap_oop.bai7.ex72;


import java.util.ArrayList;
import java.util.List;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}