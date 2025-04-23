package week_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Dates_again {
    public static void main(String[] args) {
        //1
        LocalDate date1 = LocalDate.now();
        System.out.println(" 1: "+ date1);

        //2
        LocalDate date2 = LocalDate.of(2025, 12, 25);
        System.out.println(" 2: "+ date2);

        //3
        System.out.println(" 3: "+ date1.getYear());
        System.out.println("    "+ date1.getMonth());
        System.out.println("    "+ date1.getDayOfMonth());

        //4
        LocalTime lt1 = LocalTime.now();
        System.out.println(" 4: "+ lt1);

        //5
        LocalTime lt2 = LocalTime.of(15, 30);
        System.out.println(" 5: "+ lt2);

        //6
        System.out.println(" 6: "+ lt2.getHour());
        System.out.println("    "+ lt2.getMinute());

        // LEVEL 2
        System.out.println("---LEVEL 2---"+"\n");

        //7 - 8
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(" 7-8: "+ldt1);

        //9
        System.out.println(" 9: "+ LocalDate.now().plusWeeks(1));

        //10
        System.out.println("10: "+ LocalDate.now().minusDays(3));

        //11
        System.out.println("11: "+ LocalTime.now().plusHours(2).plusMinutes(15));

        //12
        System.out.println("12: "+ LocalDateTime.now().plusDays(1));

        //LEVEL 3
        System.out.println("---LEVEL 3---"+ "\n");

        //13
        String date_string = "2025-04-01";
        LocalDate string_to_date = LocalDate.parse(date_string);
        System.out.println("13: "+ string_to_date);

        //14
        String time_string = "09:30";
        LocalTime string_to_time = LocalTime.parse(time_string);
        System.out.println("14: "+ string_to_time);

        //15
        String ldt_string = "2025-04-01T09:30";
        LocalDateTime string_to_ldt = LocalDateTime.parse(ldt_string);
        System.out.println("15: "+ string_to_ldt);

        //16
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println("16: "+ LocalDate.now().format(dtf));

        //17
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("17: "+ LocalTime.now().format(dtf1));

        //18
        LocalDateTime ldt = LocalDateTime.of(2025, 4, 22, 9, 30);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm a");
        System.out.println("18: "+ ldt.format(dtf2) +" at "+ ldt.format(dtf3));

        //LEVEL 4
        System.out.println("--LEVEL 4---"+ "\n");

        //19
        if(date1.isBefore(date2)){
            System.out.println("19: "+ date1 +" is before "+ date2);
        }else
            System.out.println("    "+date1 +" is not before "+ date2);
        if(date1.isAfter(date2)){
            System.out.println("19: "+ date1 +" is after "+ date2);
        }else
            System.out.println("    "+date1 +" is not after "+ date2);

        //LEVEL 5
        System.out.println("---LEVEL 5---"+ "\n");

        //24
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Count Down for Your Next Event. FORMAT(mm-dd-yyyy)");
//        System.out.print("EVENT:");
//        String event = scanner.nextLine();
//
//        DateTimeFormatter event_fromat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
////        LocalDate event_pars = LocalDate.parse(event, event_fromat);
//        String[] event_to_int = event.split("-");
//
//        Month month = date1.getMonth();
//        int day = date1.getDayOfMonth();
//        int year = date1.getYear();
//
//        int countdown_M = month - Integer.parseInt(event_to_int[0]);





















    }
}
