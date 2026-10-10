import java.util.Scanner;

public class Problem5_DigitSumAndReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int num = scanner.nextInt();
        
        int temp = num;
        int sumOfDigits = 0;
        int reversedNum = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            sumOfDigits += digit;
            reversedNum = reversedNum * 10 + digit;
            temp /= 10;
        }
        
        System.out.println("Sum of digits: " + sumOfDigits);
        System.out.println("Reverse: " + reversedNum);
        scanner.close();
    }
}
