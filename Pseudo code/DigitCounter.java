
 public class DigitCounter {
    public static void main(String[] args) {
        int num = 1707; // Example number [cite: 4]
        int d = 7;      // Digit to find [cite: 6]
        int count = 0;  // [cite: 7]

        while (num > 0) { // [cite: 10]
            int r = num % 10; // Get last digit [cite: 11]
            if (r == d) {     // [cite: 11]
                count++;      // [cite: 11]
            }
            num = num / 10;   // Remove last digit [cite: 11]
        }
        System.out.println("Count: " + count);
    }
}