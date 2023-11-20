//Zakwan Berlin
//Decimal To Fraction
//Created: 11/17/23
//Last updated: 11/19/23
//This program will convert a decimal number to a fraction


import java.util.Scanner;

public class DecimalToFraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        String decimalStr = scanner.nextLine();

        // Convert the decimal number to a fraction
        String[] parts = decimalStr.split("\\.");
        int integerPart = Integer.parseInt(parts[0]);
        int fractionalPart = Integer.parseInt(parts[1]);

        // Calculate the number of digits in the fractional part
        int numDigits = parts[1].length();
        int denominator = (int) Math.pow(10, numDigits);

        // Calculate the numerator for the fraction
        int numerator = integerPart * denominator + fractionalPart;

        // Display the result
        System.out.println("Fraction representation: " + numerator + "/" + denominator);

        scanner.close();
    }
}
