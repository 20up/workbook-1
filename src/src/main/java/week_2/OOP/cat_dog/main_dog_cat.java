package week_2.OOP.cat_dog;

public class main_dog_cat {
    public static void main(String[] args) {
        //dog 1
        dog Pixel = new dog();
        Pixel.name = "Pixel";
        Pixel.dog_age = 5;
        Pixel.dog_legs = 4;
        Pixel.dog_weight = 30;
        Pixel.dog_color = "black";
        Pixel.dog_size = "small";
        //dog 2
        dog Pablo = new dog();
        Pablo.name = "Pablo";
        Pablo.dog_age = 4;
        Pablo.dog_legs = 4;
        Pablo.dog_weight = 40;
        Pablo.dog_color = "brown";
        Pablo.dog_size = "small";

        //cat 1
        cat Tommy = new cat();
        Tommy.name = "Tommy";
        Tommy.setCat_age(1);
        Tommy.cat_legs = 3;
        Tommy.cat_weight = 10;
        Tommy.cat_color  = "orange";
        Tommy.cat_size = "huge";
        //cat 2
        cat Mittens = new cat();
        Mittens.name = "Mitten";
        Mittens.setCat_age(15);
        Mittens.cat_legs = 4;
        Mittens.cat_weight = 25;
        Mittens.cat_color  = "grey";
        Mittens.cat_size = "small";

        //method output
        Pixel.bark();
        Pablo.sit();

        Tommy.scratch();
        Mittens.give_mean_look();


    }


}
