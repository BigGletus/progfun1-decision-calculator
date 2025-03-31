import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inputOperation;
        double num1 = 0;
        double num2 = 0;
        double answer= 0;

        while (true) {
            System.out.println("Enter an operation (*, /, +, -, or exit):");
            inputOperation = scanner.nextLine().trim().toLowerCase();

            if (inputOperation.equals("exit") == true)
            {
                System.out.println("Closing program.");
                break;
            }

            if (!(inputOperation.equals("*") || inputOperation.equals("/") || inputOperation.equals("+") || inputOperation.equals("-")) == true)
            {
                System.out.println("Invalid input. Closing Program");
                break;
            }

            while(true) {
                System.out.println("Enter the first number:");
                try {
                    num1 = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException ignore) {
                    System.out.println("Invalid input. Closing program.");
                    System.exit(0);;
                }
            } 

            while(true) {
                System.out.println("Enter the second number:");
                try {
                    num2 = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException ignore) {
                    System.out.println("Invalid input. Closing program.");
                    System.exit(0);
                }
            } 

            switch (inputOperation) {
                case "*":
                    answer = num1 * num2;
                    System.out.println("Result: " + answer);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("You cannot divide by zero. Closing program.");
                    } else {
                        answer = num1 / num2;
                        System.out.println("Result: " + answer);
                    }
                    break;
                case "+":
                    answer = num1 + num2;
                    System.out.println("Result: " + answer);
                    break;
                case "-":
                    answer = num1 - num2;
                    System.out.println("Result: " + answer);
                    break;
            }

            System.out.println("Do you want to perform another calculation? (yes/no):");
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("no")) {
                System.out.println("Closing program");
                break;
            }
        }
        scanner.close();
    }
}