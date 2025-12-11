package baitap_oop.bai6.ex64;

public class Main {
    public static void main(String[] args) {
        MovableCircle c = new MovableCircle(0, 0, 2, 3, 5);

        System.out.println(c);
        c.moveUp();
        System.out.println(c);
        c.moveRight();
        System.out.println(c);
    }
}
