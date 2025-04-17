package week_2;

import java.util.Scanner;

public class FinancialCalc {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

// mortgage calc
        mortgageCalc();

        scanner.close();
    }

//                  method for calc 1
    public static void mortgageCalc() {

//                  loan Amount
        System.out.print("1: How much is your loan?:");
        double principal = scanner.nextDouble();

//                  interest rate
        System.out.print("2: How much is your interest rate?:");
        double air1st = scanner.nextDouble();
        double annual_interest_rate = air1st / 100;

//                  how many years
        System.out.print("3: How many year is your loan?:");
        int years = scanner.nextInt();

//                  numbers of monthly payment
        double number_of_monthly_payment = 12 * years;

//                  monthly Interest Rate
        double monthly_interest_rate = annual_interest_rate / 12;

//                  calc monthly payment
        double monthlyP1st = (principal * monthly_interest_rate * Math.pow(1 + monthly_interest_rate, number_of_monthly_payment)) / (Math.pow(1 + monthly_interest_rate, number_of_monthly_payment) - 1);
        double monthly_payments = Math.round(monthlyP1st * 100.0) / 100.0;

//                  calc total interest
        double total_interest1st = (monthly_payments * number_of_monthly_payment) - principal;
        double total_interest = Math.round(total_interest1st * 100.0) / 100.0;

//                  output
        System.out.println(" ");
        System.out.println(" :A $" + principal + " loan at " + air1st + "% interest for " + years + " years would have a");
        System.out.println(" ($" + monthly_payments + "/mo) payment with a total interest of ($" + total_interest1st + ").");
    }

    // method for calc 2
    public static void futurevalue() {

        //deposit
        System.out.print("1: The deposit amount:");
        double P = scanner.nextInt();
        //annual interest rate
        System.out.print("2: How much is your interest rate?:");
        double r1st = scanner.nextInt();
        double r = r1st / 100;
        //number of years

        //day per year

        //total number of days

        //total number of days

        //future value

        //output future value and total interest

    }


}
