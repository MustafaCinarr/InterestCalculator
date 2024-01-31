import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Amount to Deposit:");

        double depositedAmount = scanner.nextDouble();

        System.out.println("Enter the Duration in Days:");

        double durationInDays = scanner.nextDouble();

        System.out.println("Enter the Interest Rate:");

        double interestRate = scanner.nextDouble();

        int dayCount = 1;
        double temporaryAmount = depositedAmount;

        while (durationInDays >= dayCount) {

            double interestEarned = (depositedAmount) * interestRate / 100 / 365;

            temporaryAmount += interestEarned;

            dayCount++;
        }

        System.out.println("Interest Earned: " + (temporaryAmount - depositedAmount));
        System.out.println("Final Amount at the End of the Term: " + temporaryAmount);
    }
}
