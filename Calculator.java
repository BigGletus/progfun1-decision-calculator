import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an operation (*, /, +, -, or exit)");
        String inputOperation = scanner.nextLine().trim().toLowerCase();

        if(inputOperation == "exit");
        {
            System.out.println("Exiting program");
            System.exit(0);
        }

        if(inputOperation != ("*"||"/"||"+"||"-"));
        {
            System.out.println("Invalid")
        }
    }
}