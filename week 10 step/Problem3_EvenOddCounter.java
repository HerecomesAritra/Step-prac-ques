import java.util.Scanner;

public class Problem3_EvenOddCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLine()) {
            scanner.close();
            return;
        }
        String line = scanner.nextLine().trim();
        
        // Remove brackets if present: e.g. [3, 8, 12, 5, 7, 10] -> 3, 8, 12, 5, 7, 10
        line = line.replace("[", "").replace("]", "").trim();
        
        int evenCount = 0;
        int oddCount = 0;
        
        if (!line.isEmpty()) {
            String[] tokens = line.split("[,\\s]+");
            for (String token : tokens) {
                if (!token.isEmpty()) {
                    int num = Integer.parseInt(token);
                    if (num % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }
            }
        }
        
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
        scanner.close();
    }
}
