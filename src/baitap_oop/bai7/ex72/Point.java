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

class Polyline {
    private List<Point> points = new ArrayList<>();

    public void addPoint(Point p) {
        points.add(p);
    }

    public void addPoint(int x, int y) {
        points.add(new Point(x, y));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Polyline: ");
        for (Point p : points) sb.append(p).append(" ");
        return sb.toString();
    }
}


