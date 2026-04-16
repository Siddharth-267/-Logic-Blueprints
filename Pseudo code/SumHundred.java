public class SumHundred {
    public static void main(String[] args) {
        int x = 0; // The sum [cite: 145]
        int n = 1; // The counter [cite: 146]

        while (n <= 100) { // [cite: 147]
            x = x + n;     // [cite: 150]
            n = n + 1;     // [cite: 151]
        }
        
        System.out.println("Sum: " + x); // [cite: 149]
        // Expected result: 5050 [cite: 155]
    }
}