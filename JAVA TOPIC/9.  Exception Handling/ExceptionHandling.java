//--------------**** ArithmeticException ****--------------------

public class ExceptionHandling{
    public static void main(String args[]){
        try{

            int data=100/0;
                System.out.println("divide");

        }
        catch(ArithmeticException  e)

        {
            System.out.println(e);} //java.lang.ArithmeticException: / by zero


    }
}



//--------------**** ArrayIndexOutOfBounds ****--------------------


//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InterruptedIOException;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ExceptionHandling{
//    public static void main(String[] args) {
//
////        int arr[]={1,52,78,56};
////        System.out.println(Arrays.toString(arr));
////        int i=10;
////        System.out.println(arr[i]); // Index 10 out of bounds for length 4
//
//        int arr[]={12,25,85,45};
//        try{
//            System.out.println(arr[10]);
//        }
//        catch (Exception e){
//            System.out.println(e);//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 4
//        }
//
//
//    }
//}


//--------------**** ArrayStoreException ****--------------------



//public class ExceptionHandling{
//    public static void main(String[] args) {
//
//Number[] numArray = new Double[2];
//numArray[0]=4;
//       try {
//           System.out.println(numArray[0]);
//       }
//       catch (Exception e){
//           System.out.println(e); //Exception in thread "main" java.lang.ArrayStoreException: java.lang.Integer
//       }
//
//    }
//}

//--------------**** finally ****--------------------

//public class ExceptionHandling{
//    public static void main(String[] args) {
//    int a=10;
//    int b=0;
//    int c=a/b;
//      try {
//          System.out.println(c);
//      }catch (Exception e){
//          System.out.println(e);
//      }
//      finally {
//          System.out.println("result print ");
//      }
//
//    }
//}



//--------------**** throw ****--------------------
//
//class  youngerage extends  RuntimeException{
//    youngerage (String msg){
//        super(msg);
//    }
//}
//public class ExceptionHandling{
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter your age");
//        int age= sc.nextInt();
//        if(age<18){
//          throw  new youngerage("you can not vote"); //Exception in thread "main" youngerage: you can not vote
//        }
//        else {
//            System.out.println(" you can  vote");
//        }
//    }
//}

//--------------**** throws ****--------------------

//
//public class ExceptionHandling {
//    static void checkAge(int age) throws ArithmeticException {
//        if (age < 18) {
//            throw new ArithmeticException("you can not vote.");
//        }
//            else {
//            System.out.println(" you can vote ");
//        }
//    }
//
//    public static void main(String[] args) {
//        checkAge(12);
//    }
//}

//Exception in thread "main" java.lang.ArithmeticException: you can not vote.


//--------------**** throws ****--------------------

//public class ExceptionHandling {
//    public static void main(String[] args) throws  InterruptedException {
//        for(int i=0; i<=10; i++){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//
//    }
//}

//0
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10