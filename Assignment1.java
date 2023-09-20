// Import libraries here
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
    
    System.out.print("Please enter a temperature in Farenheit: ");
    double Farenheit = scanner.nextDouble();
    //consumes any new line characters
    scanner.nextLine();
    //convert farenheit to celsius
    double celsius = (Farenheit - 32) * 5.0/9.0;

    //prompt user for 5 character string
    System.out.print("Please enter a 5-character string: ");
      String input = scanner.nextLine();

      StringBuilder reversed = new StringBuilder(input).reverse();

        if (input.length() >= 3) 
        {
          String reversedString;
          input = reversedString.substring(1, input.length() - 1);
        } 
        else 
        {
            System.out.println("Invalid input... Please enter exactly 5 characters");
        }

      Random random = new Random();
        int randomNumber = random.nextInt(16353) + 32;

        // Combined the results and print them to complete the program
        System.out.println("Result: " + celsius + input + randomNumber);
  scanner.close();
  }
}
