package week_2;

import java.util.Scanner;

public class exercisesSandwichShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // sandwich size prices
        double R = 5.45;
        double L = 8.95;
        // student discount
        double s1_student1st = 5.45 - (5.45 * 0.10);
        double s1_student = Math.round(s1_student1st * 100.0) / 100.0;
        double s2_student1st = 8.95 - (8.95 * 0.10);
        double s2_student = Math.round(s2_student1st * 100.0) / 100.0;
        // senior discount
        double s1_senior = 5.45 - (5.45 * 0.20);
        double s2_senior1st = (8.95 - (8.95 * 0.20));
        double s2_senior = Math.round(s2_senior1st * 100.0) / 100.0;

        // order number input
        System.out.println("   1-Regular");
        System.out.println("   2-Large");
        System.out.print("What order number do you want?:");
        int order_number = scanner.nextInt();

        //age input
        System.out.print("How old are you?:");
        int age = scanner.nextInt();

        // dicount scanner
        if (age <= 17 && order_number == 1) {
            System.out.println("you are " + age + " years old, so you get a 10% discount and your total is " + s1_student + "$");
        } else if (age <= 17 && order_number == 2) {
            System.out.println("you are " + age + " years old, so you get a 10% discount and your total is " + s2_student + "$");
        } else if (age >= 65 && order_number == 1) {
            System.out.println("you are " + age + " years old, so you get a 10% discount and your total is " + s1_senior + "$");
        } else if (age >= 65 && order_number == 2) {
            System.out.println("you are " + age + " years old, so you get a 10% discount and your total is " + s2_senior + "$");
        } else if (order_number == 1) {
            System.out.println("you are " + age + " years old, so do not get a discount and your total is " + R + "$");
        } else
            System.out.println("you are " + age + " years old, so do not get a discount and your total is " + L + "$");
    }


}
