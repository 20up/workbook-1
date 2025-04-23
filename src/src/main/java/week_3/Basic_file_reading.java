package week_3;

//public class Basic_file_reading {
//    static Scanner scanner = new Scanner(System.in);
//    public static void main(String[] args) {
//        //1
//        try {
//            FileWriter writer = new FileWriter("output.txt");
//            writer.write("Hello, file world!");
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //2
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
//            String line = reader.readLine();
//            System.out.println(line);
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        //3
//        String[] poem = {"one fish", "two fish ", "red fish ", "blue fish"};
//        try {
//            FileWriter writer = new FileWriter("poem.txt");
//            for (int i = 0; i < poem.length; i++) {
//                writer.write(poem[i] + "\n");
//            }
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //4
//        try {
//        BufferedReader reader = new BufferedReader(new FileReader("poem.txt"));
//        String read_poem;
//        while ((read_poem = reader.readLine()) != null) {
//            System.out.println(read_poem);
//        }
//    }catch (IOException e){
//            e.printStackTrace();
//        }
//        //5
//        try{
//        FileWriter fileWriter = new FileWriter("scanner_file.txt");
//        fileWriter.write(scanner.nextLine());
//        fileWriter.close();
//    }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        //6
//        System.out.print("Enter a word to search: ");
//        String search = scanner.nextLine();
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("poem.txt"));
//            int count = 0;
//            String line;
//            while ((line = reader.readLine()) != null) {
//                if (line.contains(search)) {
//                    count++;
//                }
//            }
//            reader.close();
//            System.out.println("The word '" + search + "' appeared in " + count + " line(s). ");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//}


