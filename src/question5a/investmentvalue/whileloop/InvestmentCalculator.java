import java.text.DecimalFormat;
import java.util.Scanner;

public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("BUKUTO VILLAGE BANK LIMITTED \nInvestment Calculator\n");
        char choice = 'Y'; // Initialize choice to 'Y' to enter the loop
        
        while (choice == 'Y' || choice == 'y') {
            System.out.print("Enter principal amount: ");
            double principalAmount = scanner.nextDouble();
            
            System.out.print("Enter the time frame (in years): ");
            int timeFrame = scanner.nextInt();

            System.out.print("Enter interest rate (in percentage): ");
            double interestRate = scanner.nextDouble();

            double investmentValue = principalAmount * Math.pow(1 + interestRate / 100, timeFrame);

            DecimalFormat df = new DecimalFormat("#.##");
            String formattedInvestmentValue = df.format(investmentValue);

            System.out.println("Investment value after " + timeFrame + " years: " + formattedInvestmentValue);

            System.out.print("Do you want to calculate for another member? (Y/N): ");
            choice = scanner.next().charAt(0);
        }
        scanner.close();
    }
}

