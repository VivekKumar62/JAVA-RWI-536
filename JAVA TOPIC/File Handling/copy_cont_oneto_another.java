import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyFile {
    public static void main(String[] args) {
        try (FileInputStream read = new FileInputStream("C:\\Users\\Vivek\\bikku.txt");
             FileOutputStream writecopy = new FileOutputStream("C:\\Users\\Vivek\\ritesh.txt")) {

            int i;
            while ((i = read.read()) != -1) {
                writecopy.write(i);
            }

            System.out.println("Data copied successfully");
        } catch (IOException e) {
            System.out.println("Exception handled: " + e);
        }
    }
}
