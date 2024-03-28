import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the current year:");
        int currentYear = scanner.nextInt();
        
        System.out.println("Enter the year the employee joined the organization:");
        int joinYear = scanner.nextInt();
        
        int yearsOfService = currentYear - joinYear;
        
        if (yearsOfService > 5) {
            System.out.println("Bonus awarded: Rs. 5000/-");
        } else if (yearsOfService >= 3 && yearsOfService <= 5) {
            System.out.println("Bonus awarded: Rs. 3000/-");
        } else {
            System.out.println("No bonus awarded.");
        }
        
        scanner.close();
    }
}