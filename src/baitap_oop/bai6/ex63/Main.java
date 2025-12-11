package baitap_oop.bai6.ex63;

public class Main {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(0, 0, 2, 3);

        System.out.println(p);

        p.moveUp();
        System.out.println(p);

        p.moveRight();
        System.out.println(p);
    }
}
