
public class BitwiseLogic {
    public static void main(String[] args) {
        int a = 2, b = 5, c = 10; 
        
    
        if ((a + b + c) < (c + b + a)) {
            b = b + a; 
        }
        
        a = 8 ^ b;
        System.out.println("Result: " + (a + b + c)); 
    }
}