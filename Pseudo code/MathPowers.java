import java.util.Scanner;

public class MathPowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        System.out.print("Enter Y: ");
        int y = sc.nextInt();

        int sqr = x * x; 
        int cube = x * x * x; 

        System.out.println("Square of X: " + sqr); 
        System.out.println("Cube of X: " + cube); 
    }
}