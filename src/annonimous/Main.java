package annonimous;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        boolean flag;

        try {

            File file = new File("E:\\Workspace\\Datastructure\\DSA\\src\\annonimous/Keyboard.java");

            // making the file to read only mode
            file.setWritable(false);

            // check if the  file is writable or not
            // if not writable then it is readonly file.
            if (!file.canWrite()) {
                System.out.println(
                        "This File is read only.");
            }
            else {
                System.out.println(
                        "This File is writable.");
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
