public class ModuloDivision {
    public static void main(String[] args) {
        int a = 2, b = 50; // SET a=2, b=50 [cite: 154]
        
        while (b > 0) { // While (b > 0) [cite: 154]
            a = (b % 2) + a; // a = b MOD 2 + a [cite: 160]
            if (a % 3 == 0) { // if (a MOD 3 IS EQUAL TO 0) [cite: 161]
                b = b / 5;   // b = b / 5 [cite: 
                // 162]
            }
            System.out.println(b - 1); // PRINT b-1 [cite: 164]
            break; // Logic implies an exit or finite steps
        }
    }
}

