import java.util.Random;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        
        System.out.println("  MM          MM      MM          MM");
        System.out.println("  MM MM    MM MM      MM MM    MM MM");
        System.out.println("  MM  MM  MM  MM      MM  MM  MM  MM");
        System.out.println("  MM    MM    MM      MM    MM    MM");
        System.out.println("  MM          MM      MM          MM");
        System.out.println("  MM          MM      MM          MM");
        System.out.println("  MM          MM      MM          MM");
        System.out.println("  MM          MM      MM          MM");

        //create scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a temperature in Fahrenheit: ");
        double Fahrenheit = scanner.nextDouble();
        //consume any new line characters
        scanner.nextLine();
        // Convert Fahrenheit to Celsius
        double celsius = (Fahrenheit - 32) * 5.0/9.0;

        // prompt user for a 5-character string
        System.out.print("Enter a 5-character string: ");
        String input = scanner.nextLine();

        // reverse string and print drop front and back letters if input is greater than or equal to 5
        StringBuilder reversedString = new StringBuilder(input).reverse();
        if (input.length() >= 3) {
            input = reversedString.substring(1, input.length() - 1);

        // Generate a random number between 32 and 16,384
        Random random = new Random();
        int randomNumber = random.nextInt(16353) + 32;

        // Combine the results and print them
        System.out.println("Result: " + celsius + input + randomNumber);
        
        scanner.close();
    }
}
