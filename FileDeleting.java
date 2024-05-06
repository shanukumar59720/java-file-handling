import java.io.File;

public class FileDeleting {
    public static void main(String[] args) {
        File myFile = new File("LearningJava2.txt");
        if (myFile.delete()) {
            System.out.println("I have deleted " + myFile.getName());
        } else {
            System.out.println("Some problem occured while deleting the file!!");
        }

    }
}
