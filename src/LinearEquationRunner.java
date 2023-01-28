import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String cord1 = scan.nextLine();
        System.out.println("Enter coordinate 2: ");
        String cord2 = scan.nextLine();

        int x1 = Integer.parseInt(cord1.substring(1, cord1.indexOf(",")));
        int y1 = Integer.parseInt(cord1.substring(cord1.indexOf(",") + 2, cord1.indexOf(")")));
        int x2 = Integer.parseInt(cord2.substring(1, cord2.indexOf(",")));
        int y2 = Integer.parseInt(cord2.substring(cord2.indexOf(",") + 2, cord2.indexOf(")")));


        if (x1 == x2) {
            System.out.println("These points are on a vertical line: x = " + x1);
        } else {
            LinearEquation eq1 = new LinearEquation(x1, y1, x2, y2);
            eq1.lineinfo();
            System.out.println("\nEnter a value for x: ");
            double x = scan.nextDouble();
            System.out.println("The point on the line is " + eq1.coordinateForX(x));
        }

    }
}
