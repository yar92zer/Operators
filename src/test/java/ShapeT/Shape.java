package ShapeT;

public abstract class Shape {
    protected String name;
    protected String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String getColor();

    @Override
    public String toString() {
        return name + " with area: " + getArea() + ",perimeter: " + getPerimeter() + ", color: " + getColor();
    }
}
