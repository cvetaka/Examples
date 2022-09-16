import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Side1: ");
        double a = scan.nextDouble();
        System.out.print("Enter Side2: ");
        double b = scan.nextDouble();
        System.out.print("Enter Side3: ");
        double c = scan.nextDouble();
        double s = (0.5) * (a + b + c);
        System.out.println("The area of triangle is: ");
        System.out.println(s);
    }
}
