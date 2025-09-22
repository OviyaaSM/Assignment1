import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum (int) = " + calc.add(x, y));

        System.out.print("Enter two double numbers: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Sum (double) = " + calc.add(d1, d2));

        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Sum (3 int) = " + calc.add(a, b, c));

        sc.close();
    }
}
