import java.util.Scanner;
import java.util.Random;

public class Magic8Ball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] answers = {
                "It is certain.",
                "Absolutely.",
                "The stars are in your favor.",
                "Reply unclear, try again.",
                "The stars are undecided. Try later.",
                "Not likely.",
                "Absolutely not.",
                "The stars do not align."
        };

        System.out.println("Welcome to the Magic Java 8 Ball!");
        System.out.println("Ask a yes or no question (or type 'quit' to exit): ");

        while (true) {
            System.out.print("Your question: ");
            String question = scanner.nextLine();

            if (question.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye! May the stars guide you!");
                break;
            }
            int index = random.nextInt(answers.length);
            System.out.println("Magic 8 Ball says: " + answers[index]);
        }
        scanner.close();
    }
}
