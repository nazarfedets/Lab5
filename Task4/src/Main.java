import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше ім'я:");
        String firstName = scanner.nextLine();

        System.out.println("Введіть друге ім'я:");
        String secondName = scanner.nextLine();

        if (firstName.equals(secondName)) {
            System.out.println("Імена ідентичні.");
        } else {
            System.out.println("Імена не ідентичні.");
        }
    }
}