
public abstract class Shape{

    protected String color;

    public Shape() {
        color = RandomStuff.getRandomColor();
    }

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void printInfo();

    public abstract void toDraw();

    public abstract float getSqr();

}
