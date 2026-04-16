import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int n = num; // Store original value
        int b = 0;

        while (num > 0) {
            int a = num % 10;
            b = (b * 10) + a;
            num = num / 10;
        }

        if (n == b) {
            System.out.println(n + " is Palindrome");
        } else {
            System.out.println(n + " is NOT Palindrome");
        }
    }
}