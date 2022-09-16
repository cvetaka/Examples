import java.util.Locale;
import java.util.Scanner;

public class TrianglePerimeter2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.print(" Enter side1 :");
        double a = scan.nextDouble();
        System.out.print(" Enter side2 :");
        double b = scan.nextDouble();
        System.out.print(" Enter side3 :");
        double c = scan.nextDouble();
        double p = (a)+(b)+(c);
        System.out.println( " Perimeter is : "+ p);
    }
}
