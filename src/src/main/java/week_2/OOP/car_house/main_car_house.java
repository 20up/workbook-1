package week_2.OOP.car_house;

public class main_car_house {
    public static void main(String[] args) {

        house my_house = new house();
        my_house.color = "pine green";
        my_house.bathrooms = 2.5;
        my_house.bedroom = 3;
        my_house.storys = 2;

        car my_car = new car();
        my_car.brand = "mazda";
        my_car.model = "rx8";
        my_car.color = "silver";
        my_car.doors = 4;
        my_car.number_of_wheels = 4;

        my_car.car_descriptions();
        my_house.house_description();


    }
}
