import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine().toLowerCase(); 
        
        int vowelCount = 0;
        boolean vowelPresent = false;
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelPresent = true;
                vowelCount++;
            }
        }
        
        if (vowelPresent) {
            System.out.println("Vowels present. Total vowels: " + vowelCount);
        } else {
            System.out.println("No vowels present.");
        }
        
        scanner.close();
    }
}