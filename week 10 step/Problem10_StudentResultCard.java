import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public char calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 90) {
            return 'A';
        } else if (avg >= 75) {
            return 'B';
        } else if (avg >= 60) {
            return 'C';
        } else if (avg >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void printResultCard() {
        double avg = calculateAverage();
        char grade = calculateGrade();
        System.out.printf("%s: Average %.1f, Grade %c%n", name.toUpperCase(), avg, grade);
    }
}

public class Problem10_StudentResultCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                continue;
            }
            // Format example: Asha [80, 90, 70]
            int bracketStart = line.indexOf('[');
            int bracketEnd = line.indexOf(']');
            
            if (bracketStart != -1 && bracketEnd != -1) {
                String name = line.substring(0, bracketStart).trim();
                String marksPart = line.substring(bracketStart + 1, bracketEnd).trim();
                String[] tokens = marksPart.split("[,\\s]+");
                int[] marks = new int[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    marks[i] = Integer.parseInt(tokens[i]);
                }
                Student student = new Student(name, marks);
                student.printResultCard();
            }
        }
        scanner.close();
    }
}
