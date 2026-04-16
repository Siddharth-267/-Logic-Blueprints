public class LoopComparison {
    public static void main(String[] args) {
        int c = 1; 

        // Equivalent of REPEAT C UNTIL C >= 10 [cite: 239-242]
        do {
            System.out.println(c); 
            c++; 
        } while (c < 10); 
    }
}