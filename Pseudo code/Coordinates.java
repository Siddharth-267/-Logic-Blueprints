import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X and Y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("FIRST");
        } else if (x < 0 && y > 0) {
            System.out.println("SECOND");
        } else if (x < 0 && y < 0) {
            System.out.println("THIRD");
        } else if (x > 0 && y < 0) {
            System.out.println("FOURTH");
        } else {
            System.out.println("ORIGIN");
        }
    }
}