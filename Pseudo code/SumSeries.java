import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int num = scanner.nextInt(); 
        int sum = 0; 

        for (int i = 0; i <= num; i++) {
            sum = sum + i; 
        }

        System.out.println("Sum is: " + sum); 
    }
}