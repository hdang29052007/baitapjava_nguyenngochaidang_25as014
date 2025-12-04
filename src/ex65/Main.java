package ex65;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c);
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Area: " + c.getArea());

        ResizableCircle rc = new ResizableCircle(10);
        System.out.println(rc);
        System.out.println("Perimeter: " + rc.getPerimeter());
        System.out.println("Area: " + rc.getArea());

        rc.resize(50); // thu nhỏ còn 50%

        System.out.println("After resize:");
        System.out.println(rc);
        System.out.println("Perimeter: " + rc.getPerimeter());
        System.out.println("Area: " + rc.getArea());
    }
}
