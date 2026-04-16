import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        String vid = sc.next(); 
        System.out.print("Enter Password: ");
        String pass = sc.next(); 

        // Nested IF approach [cite: 255-277]
        if (vid.equals("TIT")) { 
            if (pass.equals("TAON")) { 
                System.out.println("Welcome"); 
            } else {
                System.out.println("Invalid password"); 
            }
        } else {
            System.out.println("Invalid User ID"); 
        }
    }
}