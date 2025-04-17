package mini_projects;

import java.util.Scanner;

public class mini_project_2_sentence_analysis {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //asks for sentence
        System.out.print("1: Enter sentence:");
        String sentence = scanner.nextLine();

        //count
        int length = sentence.length();
        System.out.println("   your sentence has ("+ length +") characters.");

        String[] word = sentence.split(" ");
        int wordcount = word.length;
        System.out.println("2: This shows how much words are in your sentence: "+ wordcount);

        if(sentence.length() > 0){
            System.out.println("3: first char: "+ sentence.charAt(0));
            System.out.println("   last char: "+ sentence.charAt( sentence.length() - 1));
        }

    }
}
