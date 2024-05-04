import java.io.File;

class renameFile{
    public static void main(String[] args) {
         File originalname=new File("C:\\Users\\Vivek\\vivekk.txt");
          File rename=new File("C:\\Users\\Vivek\\bikku.txt");
 if(originalname.exists()){
     System.out.println(originalname.renameTo(rename)+" successfully changed name ");

 }
 else {
     System.out.println("File doest not exits");
 }

    }
}