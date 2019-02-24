
public class Square extends Shape {

    private float sideLen;

    public Square() {
        this.sideLen = RandomStuff.getRandomFloat();
    }

    public Square(String color, float sideLen) {
        super(color);
        this.sideLen = sideLen;
    }

    public float getSideLen() {
        return sideLen;
    }

    public void setSideLen(float sideLen) {
        this.sideLen = sideLen;
    }

    //overrided functions
    @Override
    public void printInfo() {
        System.out.print("Shape: square, ");
        System.out.print("sqr: " + getSqr() + ", ");
        System.out.print("side length: " + getSideLen() + ", ");
        System.out.println("color: " + getColor());
    }

    @Override
    public void toDraw(){
        System.out.println("Drawing a square");
    }

    @Override
    public float getSqr() {
        return sideLen*sideLen;
    }
}
