import java.io.File;
import java.io.IOException;

public class FileCreation {

    public static void main(String[] args) {
        File myFile = new File("LearningJava2.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}