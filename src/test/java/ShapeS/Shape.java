package ShapeS;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return name + " with area: " + getArea();
    }
}
