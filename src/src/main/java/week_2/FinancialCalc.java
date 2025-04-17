package week_2;

import java.util.Scanner;

public class FinancialCalc {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        //asked what calc u want to use
        System.out.println("(1) Mortgage Calc | (2) Future Value Calc");
        System.out.print("Pick what number calc you want:");
        int calc_choice = scanner.nextInt();

        if(calc_choice == 1){
            mortgageCalc();
        } else if (calc_choice == 2){
            futurevalue();
        }


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

//                  method for calc 2
    public static void futurevalue() {

//                 deposit
        System.out.print("1: The deposit amount:");
        double initial_deposit_amount = scanner.nextInt();

//                 annual interest rate
        System.out.print("2: How much is your interest rate?:");
        double r1st = scanner.nextDouble();
        double annual_interest_rate = r1st / 100;

//                 number of years
        System.out.print("3: How many years for your deposit?:");
        int number_of_years = scanner.nextInt();

//                 day per year
        int days_per_year = number_of_years * 365;

//                 future value
        double future_value1st = initial_deposit_amount * Math.pow( 1 + (annual_interest_rate / 365) , (356 * number_of_years));
        double future_value = Math.round(future_value1st * 100.0) / 100.0;
        //double future_value = future_value2nd + 1.53;

//                 total interest
        double total_interest1st = future_value - initial_deposit_amount;
        double total_interest = Math.round(total_interest1st * 100.0) / 100.0;

//                  output future value and total interest
        System.out.println(" ");
        System.out.println("  :If you deposit $"+ initial_deposit_amount + " in a CD that earns "+ r1st + "% interest and");
        System.out.println("   matures in "+ number_of_years + " years, your CD's ending balance will");
        System.out.println("   be $"+ future_value + " and you would have earned %"+ total_interest + " in interest.");

    }

    public static void present_value(){
        //monthly payout

        //expected interest rates

        //years to pay out from the user


    }


}
