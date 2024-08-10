package ShapeT;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5, "Red"),
                new Triangle(3, 4, 5, "Blue")
        };
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}