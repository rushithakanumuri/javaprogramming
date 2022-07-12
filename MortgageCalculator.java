import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal : ");
        int principal = scanner.nextInt();

        System.out.print("Annual_Interest_Rate : ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/PERCENTAGE/MONTHS_IN_YEAR;

        System.out.print("Years(period) : ");
        int years = scanner.nextInt();
        int numberOfPayments = years * MONTHS_IN_YEAR;
        
        double mortgage = principal*((annualInterest*Math.pow(1+annualInterest , numberOfPayments))/Math.pow(1+annualInterest , numberOfPayments)-1);
        
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println( "Mortgage : " + mortgageFormatted);

        


       
    }

    
}
