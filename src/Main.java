
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        if (!in.hasNextDouble()) {
            System.out.println("Invalid input! Enter a number.");
            in.close();
            return;
        }
        double length = in.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        if (!in.hasNextDouble()) {
            System.out.println("Invalid input! Enter a number.");
            in.close();
            return;
        }
        double width = in.nextDouble();

        if (length <= 0 || width <= 0) {
            System.out.println("Invalid input! Length and width must be positive.");
        } else {
            double area = length * width;
            double perimeter = 2 * (length + width);
            double diagonal = Math.sqrt(length * length + width * width);

            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.printf("Diagonal: %.2f%n", diagonal);
        }

        in.close();
    }
}
