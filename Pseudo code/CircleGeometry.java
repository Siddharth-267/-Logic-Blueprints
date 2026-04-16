
import java.util.Scanner;

public class CircleGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14; 
        
        System.out.print("Enter radius: ");
        int r = scanner.nextInt();
        
        double area = PI * r * r;
        double circum = 2 * PI * r;
        
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circum);
    }
}