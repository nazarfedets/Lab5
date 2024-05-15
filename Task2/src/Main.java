import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];

        System.out.println("Введіть п'ять довільних слів:");
        for (int i = 0; i < 5; i++) {
            words[i] = scanner.next();
        }

        for (String word : words) {
            if (!word.isEmpty()) {
                String firstLetter = word.substring(0, 1);
                System.out.println("Перша літера слова '" + word + "': " + firstLetter);
            } else {
                System.out.println("Слово порожнє.");
            }
        }
    }
}