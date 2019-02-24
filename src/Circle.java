
public class Circle extends Shape {

    private float radius;

    public Circle() {
        this.radius = RandomStuff.getRandomFloat();
    }

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void printInfo() {
        System.out.print("Shape: circle, ");
        System.out.print("sqr: " + getSqr() + ", ");
        System.out.print("radius: " + getRadius() + ", ");
        System.out.println("color: " + getColor());
    }

    @Override
    public void toDraw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public float getSqr() {
        return (float) 3.14 * radius * radius;
    }
}