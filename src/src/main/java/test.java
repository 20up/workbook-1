import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String input = "111|Hot Chocolate (12-count)|21|4.99";
        String[] tokens = input.split(Pattern.quote("|"));

        int id = Integer.parseInt(tokens[0]);

        String name = tokens[1];

        int quantity = Integer.parseInt(tokens[2]);

        double price = Double.parseDouble(tokens[3]);

        System.out.println(id);
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(name);


    }
}
