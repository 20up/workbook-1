package week_3.oop.books;

public class Book {
    private int pages;

    private String cover_type;

    private String title;

    private String author;

    private double read_time;

    private boolean is_fiction;

    //constructor
    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(){
        this.title = "untitled";
        this.author = "unknown";
        this.pages = 0;
    }

    //setter and getter for page
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCover_type() {
        return cover_type;
    }

    public void setCover_type(String cover_type) {
        this.cover_type = cover_type;
    }

    public double getRead_time() {
        return read_time;
    }

    public void setRead_time(double read_time) {
        this.read_time = read_time;
    }

    public boolean isIs_fiction() {
        return is_fiction;
    }

    public void setIs_fiction(boolean is_fiction) {
        this.is_fiction = is_fiction;
    }

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getAuthor() {return author;}

    public void setAuthor(String author) {this.author = author;}

    public void read() {
        System.out.println("You are reading a book with (" + pages + ") pages" + " the read time for this is about (" + read_time + ") hours. ");
        if (is_fiction) {
            System.out.println("Ah, a fictional tale!");
        } else
            System.out.println("AHH the knowledge!!");
    }

    public void describe(){
        System.out.println("this books title is ("+ getTitle() +") by ("+ getAuthor() + ") contains ("+ getPages() +") pages.");
    }
}






