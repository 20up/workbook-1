package week_2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class address_builder {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //name
        System.out.println("1:Please provide the following information:");
        System.out.print("Full name:");
        String name = scanner.nextLine();

        //billing
        System.out.println(" ");//line skip
        StringBuilder billing = new StringBuilder();
        System.out.print("Billing Street: " );
        billing.append( scanner.nextLine() + " " + ("\n"));
        System.out.print("Billing City: ");
        billing.append(scanner.nextLine()+", ");
        System.out.print("Billing State: " );
        billing.append(scanner.nextLine()+" ");
        System.out.print("Billing Zip: " );
        billing.append(scanner.nextLine()+" ");

        //shipping
        System.out.println(" ");//line skip
        StringBuilder shipping = new StringBuilder();
        System.out.print("Shipping Street: ");
        shipping.append( scanner.nextLine() + (" ") + ("\n"));
        System.out.print("Shipping City: ");
        shipping.append(scanner.nextLine()+", ");
        System.out.print("Shipping State: ");
        shipping.append(scanner.nextLine()+" ");
        System.out.print("Shipping Zip: ");
        shipping.append(scanner.nextLine()+" ");

        //name output
        System.out.println(" ");//line skip
        System.out.println(name);

        //billing output
        System.out.println(" ");//line skip
        System.out.println("Billing Address:");
        String the_billing = billing.toString();
        System.out.println(the_billing);

        //shipping output
        System.out.println(" ");//line skip
        System.out.println("Shipping Address:");
        String the_shipping1 = shipping.toString();
        System.out.println(the_shipping1);

        scanner.close();
    }
}
