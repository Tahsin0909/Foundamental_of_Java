import java.util.Scanner;

public class Calculator {
    static double addNumber(double a, double b) {
        return a + b;
    }

    static double subtractNumber(double a, double b) {
        return a - b;
    }

    static double multiplyNumber(double a, double b) {
        return a * b;
    }

    static double divideNumber(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you first number ");
        double x = scanner.nextInt();

        System.out.print("Enter your second number ");
        double y = scanner.nextInt();

        double addition = addNumber(x, y);
        System.out.println("Addition " + addition);
        System.out.println("Subtract " + subtractNumber(x, y));
        System.out.println("Multiply " + multiplyNumber(x, y));
        System.out.println("Divided " + divideNumber(x, y));

        scanner.close();
    }
}
