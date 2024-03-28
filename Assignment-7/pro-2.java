import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of days the book is late:");
        int daysLate = scanner.nextInt();
        
        if (daysLate <= 7) {
            System.out.println("Fine: 50 paise");
        } else if (daysLate <= 14) {
            System.out.println("Fine: Rs. 1");
        } else if (daysLate <= 21) {
            System.out.println("Fine: Rs. 5");
        } else {
            System.out.println("Membership canceled. Book returned after 21 days.");
        }
        
        scanner.close();
    }
}