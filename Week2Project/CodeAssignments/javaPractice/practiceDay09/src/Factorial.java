import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        int input = 0;

        if (args.length >= 1) {
            input = Integer.parseInt(args[0]);
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            input = scanner.nextInt();
        }
        if (input < 0){
            System.out.println("(" + input + ")! is undefined. Converting " + input + " to a positive integer...");
            input *= -1;
        }

        System.out.println("Iterative method: " + input + "! = " + factorialIterative(input));
        System.out.println("Recursive method: " + input + "! = " + factorialRecursive(input));
    }

    private static int factorialIterative(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    private static int factorialRecursive(int num) {
        if (num <= 1) {
            return 1;
        }
        else {
            return num * factorialRecursive(num - 1);
        }
    }
}
