import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();

        System.out.println("Enter amount of shapes. Type '0' to get random amount.");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt() ;
        if (num == 0) num = RandomStuff.getRandomInt(50);
        if (num < 0) num = 0;

        for (int i = 0; i <= num; i++){
            shapes.add(RandomStuff.getRandomShape());
            shapes.get(i).printInfo();
        }

    }

}
