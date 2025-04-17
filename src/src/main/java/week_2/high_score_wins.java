package week_2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class high_score_wins {

 static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //teams with score - Home:Visitor|21:9

        //ask for team and score
        System.out.println("please enter game score:");
        String game_score = scanner.next();

        //this splits up
        String[] team = game_score.split("\\|")[0].split(":");
        String[] score = game_score.split("\\|")[1].split(":");

        String winner = "";
        if(Integer.parseInt(score[0]) > Integer.parseInt(score[1])){
            System.out.println("winner is "+ team[0]);
        } else if(Integer.parseInt(score[1]) >  Integer.parseInt(score[0])){
            System.out.println("winner is "+ team[1]);
        }

    }
}

        //this splits the game score in this layout Home:Visitor|21:9
//        String[] team_score = game_score.split("[:|]");
//
//        //this is give variables to the Game Score you just split
//        String team1 = team_score[0];
//        String team2 = team_score[1];
//        int score1 = Integer.parseInt(team_score[2]);
//        int score2 = Integer.parseInt(team_score[3]);
//
//        //this decides a winner
//        String winner = "";
//
//        if (score1 > score2){
//            System.out.println("Winner is: "+ team1);
//        } else if (score2 > score1){
//            System.out.println("winner is:"+ team2);
//        }


