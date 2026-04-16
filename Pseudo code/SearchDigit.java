import java.util.Scanner;

public class SearchDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter digit to find: ");
        int d = sc.nextInt();
        boolean found = false;

        while (num > 0) {
            int a = num % 10;
            if (a == d) {
                found = true;
                break;
            }
            num = num / 10;
        }

        if (found) {
            System.out.println("PRESENT");
        } else {
            System.out.println("NOT PRESENT");
        }
    }
}