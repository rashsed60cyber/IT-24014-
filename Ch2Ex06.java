import java.util.Scanner;
public class Ch2Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int firstDigit = number % 10;
        int remaining = number / 10;
        int secondDigit = remaining % 10;
        int thirdDigit = remaining / 10;
        int sum = firstDigit + secondDigit + thirdDigit;
        System.out.println("The sum of the digits is " + sum);
    }
}
