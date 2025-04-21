package week_2.OOP;

public class chair_app {
    public static void main(String[] args) {
        System.out.println(chair.latin_name);

        chair mychair = new chair();
        mychair.number_legs = 4;
        mychair.color = "black";
        mychair.has_wheels = true;
        mychair.maxWeight = 350;

        chair c = mychair;
        c.color = "red";

        chair preston_chair = new chair();
        preston_chair.number_legs = 4;
        preston_chair.color = "green";
        preston_chair.has_wheels = false;
        preston_chair.maxWeight = 0;

        preston_chair.sit();
        mychair.sit();

    }
}
