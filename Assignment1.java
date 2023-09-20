// Import libraries here
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

        scanner.close();

        if (input.length() == 5) 
        {
          //reverse 5 character string
          String reversedString = reverseString(input);
          //print reversed string
          System.out.println(reversedString);
        } 
        else 
        {
            System.out.println("Invalid input... Please enter exactly 5 characters");
        }
    //made function to reverse string
    public static String reverseString(String input) {
      StringBuilder reversed = new StringBuilder(input).reverse();

      //convert StrignBuilder back to a string
      return reversed.toString();
    }
  }
  scanner.close();
  }
}
