public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms [cite: 37]
        int prev = 0; // [cite: 39, 44]
        int next = 1; // [cite: 40, 44]
        int sum = 0;  // [cite: 42, 44]

        System.out.print(prev + " " + next + " "); // [cite: 48, 49]

        while (sum <= n) { // [cite: 51]
            sum = prev + next; // [cite: 54]
            if (sum <= n) {
                System.out.print(sum + " "); // [cite: 54]
                prev = next;  // [cite: 53]
                next = sum;  // [cite: 53]
            }
        }
    }
}