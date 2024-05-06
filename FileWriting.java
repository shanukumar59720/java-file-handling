//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        //File myFile = new File("WriteInJava.txt");
        try {
            FileWriter fileWriter = new FileWriter("WriteInJava.txt");
            fileWriter.write("Learning how to code takes time but once you're good in one programming language, then others will automatically gonna be easier for you!!");
            fileWriter.close();
            System.out.println("Done!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
