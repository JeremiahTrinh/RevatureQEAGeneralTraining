import java.util.Scanner;

public class controlDemo {
    public static void main(String ...args){
        int day = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        final int MULT_TABLE_MAX = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        System.out.println("day = " + switchDemo(day));
        System.out.println("greatest: " + ifElseDemo(num1, num2, num3));
        whileDemo(n, MULT_TABLE_MAX);
        forDemo(n);
    }

    public static String switchDemo(int number){
        // Ex of an enhanced switch statement; good for cases where you only need to run a single line.
        return switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "No matching day found.";
        };
    }

    public static double ifElseDemo(double num1, double num2, double num3){
        if (num2 > num1 && num2 > num3){
            return num2;
        }
        else if (num3 > num1){
            return num3;
        }
        else{
            return num1;
        }
    }

    public static void whileDemo(int input, final int NUM_MULTS){
        int loopControl = 1;

        System.out.println("The first " + NUM_MULTS + " multiples of " + input + " are...");

        while (loopControl <= NUM_MULTS){
            System.out.print(input * loopControl);
            if (loopControl < NUM_MULTS){
                System.out.print(", ");
            }
            loopControl++;
        }
        System.out.println();
    }

    public static void forDemo(int n){
        int i = 1;
        for (; i < n; i++){
            for (int j = 0; j < i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for (; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}