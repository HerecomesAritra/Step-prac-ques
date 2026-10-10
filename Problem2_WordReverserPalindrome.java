import java.util.Scanner;

public class Problem2_WordReverserPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String word = scanner.next();
            StringBuilder sb = new StringBuilder(word);
            String reversed = sb.reverse().toString();
            
            boolean isPalindrome = word.equalsIgnoreCase(reversed);
            
            if (isPalindrome) {
                System.out.println(reversed + " - palindrome");
            } else {
                System.out.println(reversed + " - not a palindrome");
            }
        }
        scanner.close();
    }
}
