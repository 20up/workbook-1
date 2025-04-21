package week_2.OOP;

public class chair {
    static String latin_name = "sella";

    double maxWeight;

    String color;

    int number_legs;

    boolean has_wheels;

    public void sit(){
        System.out.println("sitting in chair" + number_legs + " legs. in the color"+ color);
    }
}
