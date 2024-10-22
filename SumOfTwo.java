import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Please enter a value for x: ");
        x = input.nextInt();

        System.out.println("Please enter a value for y: ");
        y = input.nextInt();

        System.out.println("The sum of " + x + " + " + y + " = " + sum(x, y));

        input.close();
    }

    public static int sum(int x, int y) {
        return x + y;
    }

}
