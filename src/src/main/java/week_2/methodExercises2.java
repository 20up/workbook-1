package week_2;

import java.util.Scanner;

public class methodExercises2 {
    public static void main(String[] args) {


        //1
        String player_name = getPlayerTilte(" Preston ");
        System.out.println(player_name);

        //2
        int value = 50;
        System.out.println("original level " + value);
        int newValue = doubleXP(value);
        System.out.println("double: " + newValue);

        //3
        int randomXP = (int) (Math.random() * 20) + 1;
        System.out.println("3: your current xp: "+ randomXP);

        if(hasLeveledUp(randomXP, 10)){
            System.out.println("You levled up!");
        }else {
            System.out.println("keep griding...");
        }

        //10
//        boolean defeatedBoss = isBossDefeated(150, 99, false);
//        System.out.println(defeatedBoss);
    }


    public static String getPlayerTilte(String name) {
        return "Lord" + name;
    }

    public static int doubleXP(int xp) {
        int doublexp = xp * 2;
        return doublexp;
    }

    public static boolean hasLeveledUp(int current, int threshold) {
       return current >= threshold;
    }

//    public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion) {
//        if (bossHP <= 0) {
//            return true;
//        } else if (playerHP <= 0 && !usedPotion) {
//
//        } else if (usedPotion) {
//            return playerHP + 50 > bossHP;
//        }
//        return playerHP > bossHP;
//
//    }


}
