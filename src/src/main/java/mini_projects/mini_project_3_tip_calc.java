package mini_projects;

import java.util.Scanner;

public class mini_project_3_tip_calc {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("waht is your bill?");
        double bill = promt_user(scanner.nextInt());
        System.out.println(bill);


    }

    public static double promt_user(double bill_amount){
        return bill_amount;
    }
}
