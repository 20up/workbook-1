import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class test {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean getn = true;

        while(getn) {
            try {
                System.out.print("please put number:");
                int number = scanner.nextInt();
                System.out.println("i lobe " + number + " its my fav number");
                getn = false;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("that's not a number");
            }
        }
        //sets date of present
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        //shows the time
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //set date you want
        LocalDate ld2 = LocalDate.of(2022, 1, 3);

        //creates a new date with ld2 as a starting point
        LocalDate ld3 = ld2.plusWeeks(3);

        LocalDateTime ldt2 = LocalDateTime.of(2025, 3, 12, 2, 20);
        System.out.println(ldt2);

        System.out.println(ld3);
        System.out.println(ld2);

        //see if ld2 is before ld3
        if(ld2.isBefore(ld3)){
            System.out.println("is before");
        }
        //see if ld2 is after ld3
        if(ld2.isAfter(ld3)){
            System.out.println("ld2 is after ld3");
        }

        //formats the date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        System.out.println(ld3.format(dtf));

        //turn the string to a formated date
        String stringdate = "23-apr-2025";
        LocalDate ld4 = LocalDate.parse(stringdate, dtf);
        System.out.println(ld4);















            // loops
//        String[] hobbiess = {"pokemon","bron","basketball"};
//
//        for(int i = 0; i < hobbiess.length; i++ ){
//            System.out.println(hobbiess[i]);
//        }
//        boolean c = true;
//        while(c){
//            if(Math.random() < 0.2){
//                System.out.println("snappin out the loop");
//                c = false;
//            }
//            System.out.println("keep going");
//        }



    }
}
