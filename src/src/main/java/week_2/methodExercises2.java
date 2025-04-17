package week_2;

import java.util.Scanner;

public class methodExercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1
        System.out.println("1: Lord " + getPlayerTitle("Preston."));

        //2
        int orginal_number = 10;
        System.out.println("2: orginal #: " + orginal_number);
        int result = doubleXP(orginal_number);
        System.out.println("number x2: " + result);

        //3
        if (hasLeveledUp(9, 10)) {
            System.out.println("3: You leveled up!");
        } else
            System.out.println("3: Keep grinding...");

        //4
        System.out.println("4: " + rollDice());
        System.out.println("   " + rollDice());
        System.out.println("   " + rollDice());

        //5
        int D_calc = calculateDamage(20, 5);
        System.out.println("5: " + D_calc);

        //6
        boolean outcome1 = canOpenChest(true, true);
        boolean outcome2 = canOpenChest(true, false);
        boolean outcome3 = canOpenChest(false, true);
        boolean outcome4 = canOpenChest(false, false);
        System.out.println("6: " + outcome1 + " | " + outcome2 + " | " + outcome3 + " | " + outcome4);

        //7
        System.out.println("7: default-peasant.");
        System.out.println("      1-warrior.");
        System.out.println("      2-mage.");
        System.out.println("      3-rogue.");
        System.out.print("choose a class number:");
        int choose_class = getPlayerClass(scanner.nextInt());

        //8
        System.out.print("8: What is your current gold count:");
        int currentGold = scanner.nextInt();
        System.out.print("   What is your gold you found:");
        int goldFound = scanner.nextInt();
        int addgold = addGold(currentGold, goldFound);

        if (goldFound >= 100) {
            double taxedG = goldFound - (goldFound * 0.10);
            System.out.println("taxed total: " + (taxedG + currentGold));
        } else
            System.out.println("total: " + (currentGold + goldFound));

        //9
        System.out.println("9: you have 20 total task");
        int totaltask = 20;
        System.out.print("   how many task did you complete: ");
        int tasksDone = scanner.nextInt();
        isQuestComplete(tasksDone, totaltask);
        if (tasksDone == totaltask) {
            System.out.println("✅ Quest complete!");
        } else
            System.out.println("⏳ You still have work to do.");

        //10
        boolean deafeat_boss = isBossDefeated(100, 50, true);
        System.out.println("10: " + deafeat_boss);


    }

    /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //1
    public static String getPlayerTitle(String name) {
        return name;
    }

    //2
    public static int doubleXP(int xp) {
        return xp * 2;
    }

    //3
    public static boolean hasLeveledUp(int currentXP, int threshold) {
        if (currentXP >= threshold) {
            return true;
        } else
            return false;
    }

    //4
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;

    }

    //5
    public static int calculateDamage(int strength, int enemyDefense) {
        return (strength * 2) - enemyDefense;
    }

    //6
    public static boolean canOpenChest(boolean hasKey, boolean lockIsBroken) {
        if (hasKey || lockIsBroken) {
            return true;
        } else
            return false;
    }

    //7
    public static int getPlayerClass(int choice) {
        if (choice == 1) {
            System.out.println("you chose warrior.");
        } else if (choice == 2) {
            System.out.println("you chose mage.");
        } else if (choice == 3) {
            System.out.println("you chose rogue");
        } else
            System.out.println("you got peasent.");
        return choice;
    }

    //8
    public static int addGold(int currentGold, int goldFound) {
        return currentGold + goldFound;
    }

    //9
    public static boolean isQuestComplete(int tasksDone, int totalTasks) {
        if (tasksDone == totalTasks) {
            return true;
        } else
            return false;
    }

    //10
    public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion) {
        if (bossHP <= 0) {
            return true;
        } else if (playerHP <= 0 && usedPotion == false) {
            return false;
        } else if (usedPotion) {
            return playerHP + 50 > bossHP;
        } else
            return playerHP > bossHP;

    }

}
