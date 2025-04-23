package week_3;

public class Loop {
    public static void main(String[] args) {
        //1
        int[] numbers = {1, 2, 3, 4, 5};

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
        }

        //2
        System.out.println(" ");
        int number2 = numbers.length;
        while(number2 >=1){
            System.out.print(number2--);
        }


        //3
        System.out.println(" ");
        String[] names = {"Alice", "Bob", "Charlie"};

        for(int j = 0; j < names.length; j++){
            System.out.print("hello "+ names[j] +" ");
        }

        //4
        System.out.println(" ");
        int[] number4 = {3, 5, 7, 2, 8};
        int sum = 0;
        for(int k = 0; k < number4.length; k++){
            sum =(number4[0] + number4[1] + number4[2] + number4[3] + number4[4]);
        }
        System.out.println("Sum: "+ sum);

        //5
//        System.out.println(" ");
//        int[] number5 = {4, 7, 10, 15, 18};
//
//        for(int l = 0; l < number4.length; l++){
//
//        }







    }
}

