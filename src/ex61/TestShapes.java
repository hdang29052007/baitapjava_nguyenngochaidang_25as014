package ex61;

public class TestShapes {
    public static void main(String[] args) {

        // Test Shape bằng cách dùng lớp con (vì Shape là abstract)
        Shape s1 = new Circle(2.5, "blue", false);
        Shape s2 = new Rectangle(3.0, 4.0, "yellow", true);
        Shape s3 = new Square(5.0, "black", true);

        System.out.println("=== TEST CIRCLE ===");
        System.out.println(s1);
        System.out.println("Area = " + s1.getArea());
        System.out.println("Perimeter = " + s1.getPerimeter());

        System.out.println("\n=== TEST RECTANGLE ===");
        System.out.println(s2);
        System.out.println("Area = " + s2.getArea());
        System.out.println("Perimeter = " + s2.getPerimeter());

        System.out.println("\n=== TEST SQUARE ===");
        System.out.println(s3);
        System.out.println("Area = " + s3.getArea());
        System.out.println("Perimeter = " + s3.getPerimeter());

        // Test thêm phương thức setSide(), setWidth(), setLength()
        Square sq = new Square(4.0);
        System.out.println("\nSquare trước khi thay đổi: " + sq);

        sq.setSide(10);
        System.out.println("Square sau setSide(10): " + sq);

        sq.setWidth(7);
        System.out.println("Square sau setWidth(7): " + sq);

        sq.setLength(3);
        System.out.println("Square sau setLength(3): " + sq);
    }
}
