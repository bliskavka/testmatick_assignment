
public class Triangle extends Shape {

    private float sideA;

    private float sideB;

    private float sideC; //hypotenuse

    public Triangle() {
        this.sideA = RandomStuff.getRandomFloat(99);
        this.sideB = RandomStuff.getRandomFloat(99);
        this.sideC = RandomStuff.getRandomFloat(99);
    }

    public Triangle(String color, float sideA, float sideB, float sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    //getters
    public float getSideA() {
        return sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public float getSideC() {
        return sideC;
    }

    //setters
    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public void setSideC(float sideC) {
        this.sideC = sideC;
    }

    //overrided functions
    @Override
    public void printInfo() {
        System.out.print("Shape: triangle, ");
        System.out.print("sqr: " + getSqr() + ", ");
        System.out.print("sides length: " + getSideA() + ", " + getSideB() + ", " + getSideC() + ", ");
        System.out.println("color: " + getColor());
    }

    @Override
    public void toDraw() {
        System.out.println("Drawing a triangle");
    }

    @Override
    public float getSqr() {
        float p = (sideA + sideB + sideC)/2;
        return (float) Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}
