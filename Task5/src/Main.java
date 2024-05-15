import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть перший рядок: ");
        String firstString = scanner.nextLine();

        System.out.print("Введіть другий рядок: ");
        String secondString = scanner.nextLine();


        if (firstString.length() > secondString.length()) {
            System.out.println("Перший рядок довший: " + firstString);
        } else if (firstString.length() < secondString.length()) {
            System.out.println("Другий рядок довший: " + secondString);
        } else {
            System.out.println("Рядки мають однакову довжину.");
        }


        scanner.close();
    }
}