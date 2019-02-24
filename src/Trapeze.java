
public class Trapeze extends Shape {

    private float sideA;

    private float sideB;

    private float height;

    public Trapeze() {
        this.sideA = RandomStuff.getRandomFloat();
        this.sideB = RandomStuff.getRandomFloat();
        this.height = RandomStuff.getRandomFloat();
    }

    public Trapeze(String color, float sideA, float sideB, float height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    //getters
    public float getSideA() {
        return sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public float getHeight() {
        return height;
    }

    //setters
    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //overrided functions
    @Override
    public void printInfo() {
        System.out.print("Shape: trapeze, ");
        System.out.print("sqr: " + getSqr() + ", ");
        System.out.print("sides length: " + getSideA() + ", " + getSideB() + ", ");
        System.out.print("height length: " + getHeight() + ", ");
        System.out.println("color: " + getColor());
    }

    @Override
    public void toDraw() {
        System.out.println("Drawing a trapeze");
    }

    @Override
    public float getSqr() {
        return (float) 0.5 * (sideA + sideB) * height;
    }
}
