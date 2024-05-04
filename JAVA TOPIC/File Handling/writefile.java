import java.io.FileWriter;
import java.io.IOException;

class WriteData {
    public static void main(String[] args) {
        try {
            FileWriter mydata = new FileWriter("C:\\Users\\Vivek\\vivekk.txt");
            mydata.write("hello railworld india ");
            mydata.close();
            System.out.println("Successfully");
        }
        catch (IOException e) {
            System.out.println("something exception " + e );

        }
    }
}
