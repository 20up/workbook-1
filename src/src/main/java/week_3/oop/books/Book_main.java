package week_3.oop.books;

public class Book_main {
    public static void main(String[] args) {
        //objects
        Book hogwarts = new Book("hagwarts","Preston Panom",200);
        hogwarts.setPages(200);
        hogwarts.setCover_type("hard cover");
        hogwarts.setIs_fiction(true);
        hogwarts.setRead_time(24);


        Book how_to_java_101 = new Book("how to java 101","Preston Panom",1000);
        how_to_java_101.setPages(1000);
        how_to_java_101.setCover_type("paper cover");
        how_to_java_101.setIs_fiction(false);
        how_to_java_101.setRead_time(50);



        Book book3 = new Book("pokemon 101", "preston panom",1);
        Book book4 = new Book("3ds 101", "Preston panom",10 );
        Book book5 = new Book("the lightning theif","tim cheese" ,200 );
        Book book6 = new Book("the last of us","joel" ,100 );

        Book book7 = new Book();



        



        //output
        hogwarts.read();
        System.out.println(" ");
        how_to_java_101.read();
        System.out.println(" ");
        book3.describe();
        book4.describe();
        book5.describe();
        book6.describe();
        System.out.println(" ");
        book7.describe();




    }
}
