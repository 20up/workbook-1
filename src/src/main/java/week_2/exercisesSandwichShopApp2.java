package week_2;

import java.util.Locale;
import java.util.Scanner;

public class exercisesSandwichShopApp2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // prompt for size
        int sizeOfSandwich = getSandwichSize();

        // prompt for loaded or not
        String loaded = getLoaded();

        // prompt for age
        int inputtedAge = getAge();


        // calculate price
        double total = calculateTotalPrice(sizeOfSandwich, inputtedAge, loaded);

        // display costs
        displayTotal(total);

        scanner.close();
    }

    public static int getSandwichSize() {
        System.out.println("Do you want regular(1) or large(2)?");
        int sizeOfSandwich = scanner.nextInt();
        return sizeOfSandwich;
    }

    public static String getLoaded(){
        System.out.println("Do you want your sandwich loaded (yes/no)");
        String loaded = scanner.next();
        return loaded;
    }


    public static int getAge() {
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        return age;
    }


    public static double calculateTotalPrice(int sandwichSize, int age, String loaded) {
        double totalPrice = 0;


        if(sandwichSize == 1) {
            totalPrice = 5.45;
        } else if(sandwichSize == 2) {
            totalPrice = 8.95;
        }

        if(loaded.equalsIgnoreCase("yes") && sandwichSize == 1){
            totalPrice += 1;
        }else if(loaded.equalsIgnoreCase("yes") && sandwichSize == 2){
            totalPrice += 1.75;
        }

        if(age <= 17) {
            totalPrice *= 0.9;
        } else if(age >= 65) {
            totalPrice *= 0.8;
        }

        return totalPrice;
    }

    public static void displayTotal(double total) {
        System.out.println("The total costs are: " + total);
    }

}