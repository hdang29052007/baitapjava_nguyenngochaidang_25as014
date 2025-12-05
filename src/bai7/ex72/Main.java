package bai7.ex72;

public class Main {
    public static void main(String[] args) {
        Polyline poly = new Polyline();

        poly.addPoint(1, 2);
        poly.addPoint(3, 4);
        poly.addPoint(new Point(5, 6));

        System.out.println(poly);
    }
}
