package week_2;

import java.util.Scanner;

public class methodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        String welcome = "Welcome to Code Quest!";
        printWelcome(welcome);
        //2
        System.out.print(" 2: Enter Player Name:");
        String player_name = scanner.next();
        displayPlayerName(player_name);
        //3
        int random_level = (int) (Math.random() * 20) + 1;
        int level = random_level;
        showLevel(level);
        //4
        String attacker = "charmander";
        String target = "bulbasuar";
        attack(attacker, target);

        //5
        String item = "potion";
        foundItem(player_name, item);

        //6
        int heal_amount = 20;
        usepotion(player_name, item, heal_amount);

        //7
        String white_out = player_name + " HAS WHITE OUT";
        whiteout(white_out);

        //8
        int Item_count = 30;
        displaybag(player_name, Item_count);

        //9
        emotes(player_name);


    }

    public static void printWelcome(String welcome) {
        System.out.println(" 1: " + welcome);
    }

    public static void displayPlayerName(String player_name) {
        System.out.println("Player joined: " + player_name);
    }

    public static void showLevel(int level) {
        System.out.println(" 3: charmander's Level: " + level);
    }

    public static void attack(String attacker, String target) {
        System.out.println(" 4: " + attacker + " uses Ember on " + target);
        System.out.println(target + " use leach seed on " + attacker);

    }

    public static void foundItem(String player_name, String Item) {
        System.out.println(" 5: " + player_name + " found a " + Item);

    }

    public static void usepotion(String player_name, String Item, int heal_amount) {
        System.out.println(" 6: " + player_name + " used a " + Item + " to heal charmander for " + heal_amount + "HP");
    }

    public static void whiteout(String white_out) {
        System.out.println(" 7: " + white_out);

    }

    public static void displaybag(String player_name, int Item_count) {
        System.out.println(" 8: " + player_name + " has " + Item_count + " Items in there bag.");
    }

    public static void emotes(String player_name) {
        System.out.println("10: " + player_name + " emotes the Take the L");
    }


}
