import java.util.ArrayList;
import java.util.Random;

public class RandomStuff {

    public static String getRandomColor(){
         String[] colors = {
                "red",
                "green",
                "blue",
                "yellow",
                "magenta",
                "cyan"
        };
        int r = (int) (Math.random() * (colors.length));
        return colors[r];
    }

    public static float getRandomFloat(){
        Random random = new Random();
        return random.nextInt(999) + random.nextFloat();
    }

    public static float getRandomFloat(int bound){
        Random random = new Random();
        return random.nextInt(bound) + random.nextFloat();
    }

    public static int getRandomInt(int bound){
        Random random = new Random();
        return random.nextInt(bound);
    }

    public static Shape getRandomShape(){
       switch (getRandomInt(3)){
           case 0:
               return new Square();
           case 1:
               return new Triangle();
           case 2:
               return new Circle();
           case 3:
               return new Trapeze();
       }
        return null;
    }
}
