package week_2;

import java.util.Scanner;

public class full_name_app {
static Scanner scanner = new Scanner(System.in);
//    Glen Williams
//    Glen C. Williams
//    Glen Williams, PhD
//    Glen C. Williams, PhD

    public static void main(String[] args) {
        System.out.println(name_prompter());
        System.out.println("what is your full name");
//        System.out.println(full_name_parser());

    }

    public static String name_prompter(){
        System.out.println("what is your name");
        String name = scanner.next();
        System.out.println("what is your middle name (y/n)");
        String middle_name = scanner.next();
        if(middle_name.equalsIgnoreCase("y")){
            name += " "+ scanner.next().trim();
        }
        System.out.println("what is your last name");
        name += " "+ scanner.next().trim();
        System.out.println("do you have a suffix (y/n)");
        String suffix = scanner.next();
        if(suffix.equalsIgnoreCase("y")){
            name += " "+ scanner.next().trim();
        }
        return name;
    }

    public static void full_name_parser(String full_name){
        String[] name_parts = full_name.split(" ");
        String first_name = name_parts[0];
        String middle_name = "";
        String last_name = "";
        if(name_parts.length == 2){
            last_name = name_parts[1];
        }else{
            middle_name = name_parts[1];
        }
        System.out.println("first name "+ first_name );
        System.out.println("middle name "+ middle_name);
        System.out.println("last name "+ last_name);
        String nr = "5";



    }


}
