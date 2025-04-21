package week_3;

public class book_main {
    public static void main(String[] args) {

        //objects
        book hogwarts = new book();
        hogwarts.setPages(200);
        hogwarts.setCover_type("hard cover");
        hogwarts.setIs_fiction(true);
        hogwarts.setRead_time(24);

        book how_to_java_101 = new book();
        how_to_java_101.setPages(1000);
        how_to_java_101.setCover_type("paper cover");
        how_to_java_101.setIs_fiction(false);
        how_to_java_101.setRead_time(50);

        hogwarts.read();
        System.out.println(" ");
        how_to_java_101.read();
    }

}
