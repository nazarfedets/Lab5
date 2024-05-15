import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть три дійсних числа:");

        double maxNumber = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < 3; i++) {
            if (scanner.hasNext()) {
                String input = scanner.next();
                try {
                    double number = Double.parseDouble(input);
                    if (number > maxNumber) {
                        maxNumber = number;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Помилка! Введіть дійсне число.");
                    return;
                }
            }
        }

        System.out.println("Найбільше число: " + maxNumber);
    }
}