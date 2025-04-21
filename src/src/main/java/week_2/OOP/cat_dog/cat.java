package week_2.OOP.cat_dog;

public class cat {

    int cat_legs;

    private int cat_age;

    double cat_weight;

    String name;

    String cat_size;

    String cat_color;

    public void scratch(){
        System.out.println(name +" scratches you. cat ID: cat size:"+ cat_size + ". cat color:"+ cat_color +". cat age:"+ cat_age +"." );
    }

    public void give_mean_look(){
        System.out.println(name +" give you a mean look. cat ID: cat size:"+ cat_size + ". cat color:"+ cat_color +". cat age:"+ cat_age +"." );
    }

    //getter and setter
    public int getCat_age() {
        return cat_age;
    }

    public void setCat_age(int cat_age) {
        if(cat_age >= 0){
        this.cat_age = cat_age;
        }
    }
}
