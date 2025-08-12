package skill6;
import java.util.Scanner;
public class Area {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of side of square");
        int n = sc.nextInt();
        int sq = square(n);

        System.out.println("Enter the radius of circle");
        double a = sc.nextDouble();
        double c = circle(a);

        System.out.println("Enter length of rectangle");
        double b = sc.nextDouble();
        System.out.println("Enter breadth of rectangle");
        double d = sc.nextDouble();
        double rect = rectangle(b, d);
        System.out.println("The area of square is "+sq);
        System.out.println("The area of circle is "+c);
        System.out.println("The area of rectangle is "+rect);
    }

    public static int square(int s) {
        return s*s;
    }

    public static double circle(double r) {
        double a=Math.PI*r*r;
        return a;
    }

    public static double rectangle(double l, double b) {
        return l*b;
    }
}
