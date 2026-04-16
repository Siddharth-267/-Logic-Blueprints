public class PrimeChecker {
    public static void main(String[] args) {
        int n = 29; // Example input [cite: 17]
        boolean isPrime = true;

        if (n <= 1) isPrime = false;
        
        for (int i = 2; i < n; i++) { // [cite: 18]
            if (n % i == 0) {         // [cite: 19]
                System.out.println("NOT PRIME"); // [cite: 20]
                isPrime = false;
                break;                // [cite: 21]
            }
        }

        if (isPrime) {                // [cite: 23]
            System.out.println("Prime"); // [cite: 23]
        }
    }
}