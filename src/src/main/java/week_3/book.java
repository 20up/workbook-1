package week_3;

public class book {
    private int pages;

    private String cover_type;

    private double read_time;

    private boolean is_fiction;

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

    public void read(){
        System.out.println("Preston is reading a book with ("+ pages +") pages"+ " the read time for this is about ("+ read_time + ") hours. ");
        if(is_fiction){
            System.out.println("Ah, a fictional tale!");
        }else
            System.out.println("AHH the knowledge!!");
    }
}






