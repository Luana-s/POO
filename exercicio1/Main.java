import java.util.Scanner;
import java.util.Locale;

public class Main{

    public static void main(String[] args) {
        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double precoDollar = sc.nextDouble();

        System.out.print("How many dollar will be bought? ");
        double quantDollar = sc.nextDouble();

		double result = ConversorMoedas.dollarToReall(quantDollar, precoDollar);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);
        sc.close();

    }
}

