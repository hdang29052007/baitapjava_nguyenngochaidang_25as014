package ex62;

public class TestGeometric {
    public static void main(String[] args) {
        GeometricObject c = new Circle(5);
        GeometricObject r = new Rectangle(4, 6);

        System.out.println(c);
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Circle perimeter: " + c.getPerimeter());

        System.out.println();

        System.out.println(r);
        System.out.println("Rectangle area: " + r.getArea());
        System.out.println("Rectangle perimeter: " + r.getPerimeter());
    }
}
