import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {

        //  here my first file create

        try (FileWriter writer = new FileWriter("C:\\Users\\Vivek\\INDORE.txt")) {
            writer.write("hello , sir ");
        } catch (IOException e) {
            System.out.println("error to create  file ");
        }

        // here second file create and read and copy data first file to second file

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Vivek\\Indore.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Vivek\\BHOPAL.txt"))) {
            String  i;
            while ((i = reader.readLine()) != null) {
                writer.write(i);
            }
            System.out.println("successfully create file and copy your data ");
        } catch (IOException e) {
            System.out.println("error for copy data ");
        }

       // here my first file will delete

        try {
            File file = new File("C:\\Users\\Vivek\\Indore.txt");
            if (file.delete()) {
                System.out.println("Deleted the file: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (SecurityException e) {
            System.out.println(" error to delete file " );
        }

        // here i want recover my first file data

        finally {

            try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Vivek\\Indore.txt"))) {
                String line;
                System.out.println("Previous file data:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Previous file not found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("error to read previous file data  " + e.getMessage());
            }
        }
    }
}