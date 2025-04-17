package mini_projects;

import java.util.Scanner;

public class mini_project_1_calculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //asked the use for number input
        System.out.println("1: Calculate two numbers");
        System.out.print("   First number:");
        double first_number = scanner.nextDouble();
        System.out.print("   Second number:");
        double second_number = scanner.nextDouble();

        //ask user to choose operation input
        System.out.println(" ");
        System.out.println("2: Now choose a operation (+, -, *, /)");
        System.out.print("   operation:");
        String Operation = scanner.next();

        //calc the inputs
        double result = calc_input(first_number, second_number, Operation);

        //output
        System.out.println("The answer "+ result);
    }

    public static double calc_input(double number_a, double number_b, String op){

        if(op.equals("+")) return number_a + number_b;
        else if (op.equals("-")) return number_a - number_b;
        else if (op.equals("*")) return number_a * number_b;
        else if (op.equals("/")) return number_a / number_b;
        return 0;

    }

}
