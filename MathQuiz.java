import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        char[] ops = { '+', '-', '*', '/' };
        int numQuestions = 5;
        int score = 0;
        int a = (int) (Math.random() * (10 + 1) + 10);
        int b = (int) (Math.random() * (10 + 1) + 10);
        char op = ops[rand.nextInt(ops.length)];
        while (true) {
            System.out.println("What is " + a + " " + op + " " + b + "?");
            float answer = scanner.nextFloat();
            if (op == '+') {
                if (answer == a + b) {
                    score++;
                }
            } else if (op == '-') {
                if (answer == a - b) {
                    score++;
                }
            } else if (op == '*') {
                if (answer == a * b) {
                    score++;
                }
            } else if (op == '/') {
                if (answer == a / b) {
                    score++;
                }
            }
            numQuestions--; // decrease the number of questions
            if (numQuestions <= 0)
                break;
            a = (int) (Math.random() * (10 + 1) + 10);
            b = (int) (Math.random() * (10 + 1) + 10);
            op = ops[rand.nextInt(ops.length)];
        }
        System.out.println("Your score is: " + score + " out of 5");
        scanner.close();
    }

}
