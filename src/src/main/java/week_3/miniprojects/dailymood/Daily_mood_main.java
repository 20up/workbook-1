package week_3.miniprojects.dailymood;

import jdk.jshell.spi.ExecutionControl;

import java.io.*;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Daily_mood_main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       //this tell you to input one of the options and loops if you put something wrong

        int choice = 0;
        boolean option_1 = true;
        while (option_1) {
            try {
                System.out.println("CHOOSE NUMBER OPTION");
                System.out.println("[1] Log a new mood");
                System.out.println("[2] View past moods");
                System.out.println("[3] Exit");
                System.out.print("Enter:");
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 1 || choice == 2 || choice == 3) {
                    option_1 = false;
                } else
                    System.out.println("!!NO INPUT AVAILABLE TRY AGAIN!!"+ "\n");

            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("!!NO INPUT AVAILABLE TRY AGAIN!!"+ "\n");
            }
        }

        //this (1 puts your mood in file) (2 lets you look at your mood file 3 exit)
        boolean option_2 = true;
        while (option_2) {
            try {
                if (choice == 1) {
                    System.out.println("How are you feeling today on " + LocalDate.now());
                    System.out.print("Mood:");
                    String daily_entry = scanner.nextLine();

                    try {
                        FileWriter mood_file = new FileWriter("Mood_Log.txt", true);
                        mood_file.write("today is:("+ LocalDate.now() + ") Mood is: " + daily_entry + "\n");
                        mood_file.close();
                    } catch (IOException e) {
                        scanner.nextLine();
                        System.out.println("!!RAN INTO A PROBLEM!!");
                    }
                    option_2 = false;
                } else if (choice == 2) {
                    try {
                        BufferedReader mood_file = new BufferedReader(new FileReader("Mood_log.txt"));
                        String logs;
                        while ((logs = mood_file.readLine()) != null) {
                            System.out.println(logs);
                        }
                        mood_file.close();
                        option_2 = false;
                    } catch (IOException e) {
                        scanner.nextLine();
                        System.out.println("!!RAN INTO A PROBLEM!!");
                    }
                } else if (choice == 3) {
                    option_2 = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("!!THAT NOT A NUMBER!!");
            }

        }


    }
}
