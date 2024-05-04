import java.io.File;
import java.io.IOException;

class fileInfo{
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Vivek\\vivekk.txt");
     try {
         if(f.createNewFile()){
             System.out.println(" create successfully");

         }
         if(f.exists()){
             System.out.println("already exist"+f.getName());
             System.out.println("file name"+ f.getAbsolutePath());
             System.out.println("file Writable"+f.canWrite());
             System.out.println("file read" +f.canRead());
             System.out.println("file size"+f.length());

         }

         else {
             System.out.println("file doest not exists");
         }
     }
     catch (IOException e){
         System.out.println(e +" Exception ");
     }
    }
}