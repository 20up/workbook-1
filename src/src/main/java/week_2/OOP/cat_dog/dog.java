package week_2.OOP.cat_dog;

public class dog {

    int dog_legs;

    int dog_age;

    double dog_weight;

    String name;

    String dog_size;

    String dog_color;

    public void bark(){
        System.out.println(name +" started barking. ID age:"+ dog_age +". color:"+ dog_color + ". size:"+ dog_size +".");
    }
    public void sit(){
        System.out.println(name +" started sitting. ID age:"+ dog_age +". color:"+ dog_color + ". size:"+ dog_size +".");
    }
}
