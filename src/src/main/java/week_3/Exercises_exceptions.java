package week_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercises_exceptions {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //1
//        System.out.println("use two numbers to divided by");
//        boolean dividable = true;
//
//        while(dividable) {
//            try {
//                System.out.print("number one:");
//                int number_one = scanner.nextInt();
//                System.out.print("number two:");
//                int number_two = scanner.nextInt();
//                int result = number_one / number_two;
//                System.out.println("results: "+ result);
//                dividable = false;
//            } catch (InputMismatchException e){
//                scanner.nextLine();
//                System.out.println("didn't put in numbers");
//                System.out.println(" ");
//            } catch (ArithmeticException e){
//                System.out.println("can't divide by 0");
//                System.out.println(" ");
//            }
//        }
        //2
//        System.out.println("put in a number as a string:");
//
//        boolean is_number = true;
//
//        while(is_number){
//            try{
//                System.out.print("number:");
//                String string_number = scanner.nextLine();
//                int the_number = Integer.parseInt(string_number);
//                System.out.println("the number: "+ the_number);
//                is_number =false;
//            } catch (Exception e){
//                System.out.println(" ");
//                System.out.println("!!THAT IS A LETTER!!");
//                System.out.println(" ");
//            }
//        }

        //3
//        System.out.println("age checker");
//
//        boolean age_valid = true;
//
//        while(age_valid){
//            try{
//                System.out.print("enter age:");
//                int age = scanner.nextInt();
//                if(age >= 18){
//                    age_valid = false;
//                    System.out.println("Age is Valid");
//                }else
//                    System.out.println("!!YOUR UNDERAGE!!");
//            }catch (Exception e){
//                scanner.nextLine();
//                System.out.println("!!WRONG INPUT!!");
//                System.out.println(" ");
//            }
//        }

        //4
//        System.out.println("Guess a Number Between 1 - 10.");
//        boolean guess_valid = true;
//        int right_number = 3;
//
//        while(guess_valid){
//            try{
//                System.out.print("guess:");
//                int guess = scanner.nextInt();
//                if(guess == right_number){
//                    guess_valid = false;
//                    System.out.println("WINNER WINNER CHICKEN DINNER");
//                }else
//                    System.out.println("!!WRONG NUMBER!!");
//            }catch (InputMismatchException e){
//                scanner.nextLine();
//                System.out.println("!!THAT NOT A NUMBER!!");
//                System.out.println(" ");
//            }
//        }

        //5
//        System.out.println("What is The Temp in Celsius.");
//
//        boolean vaild_number = true;
//
//        while(vaild_number){
//            try{
//                System.out.print("temp:");
//                int temp = scanner.nextInt();
//                vaild_number = false;
//                System.out.println(temp +" Degrees Celsius");
//            }catch(InputMismatchException e){
//                scanner.nextLine();
//                System.out.println("!!WRONG INPUT!!");
//            }
//        }

        //6
        System.out.println("Even Number Checker");

        boolean number_even = true;

        while(number_even){
            try{
                System.out.print("Number:");
                int number = scanner.nextInt();
               if(number % 2 == 0){
                   number_even = false;
                   System.out.println("Number is even");
               } else
                   System.out.println("!!NUMBER IS ODD!!");
            }catch (Exception e){
                scanner.nextLine();
                System.out.println("!!WRONG INPUT!!");
            }
        }






    }
}
