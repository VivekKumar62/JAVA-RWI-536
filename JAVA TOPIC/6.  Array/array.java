//import java.util.Scanner;
//
//public class array {
//    public static void main(String[]args){
//
//        //----------**************-------------
//
//
////        //old method
////      int []  marks=new int[3];
////      marks[0]=98;
////      marks[1]=20;
////      marks[2]=85;
//
////        System.out.println(marks); //[I@4dd8dc3
////        System.out.println(marks[0]); //98
////        System.out.println(marks[1]); //20
////        System.out.println(marks[2]); //85
////        for (int i=0; i<marks.length; i++) // all marks print with the help
////        of for loop
////        for (int i=0; i<3; i++)
////        {
////            System.out.println(marks[i]);
////
// //   }
//
////   output=
////98
////20
////85
//
//
////-----------  new method ***********************--
//
//// int marks[]={98,58,69};
////       for (int i=0; i<marks.length; i++){
////           System.out.println(marks[i]);
////       }
//
// //output =
////98
////58
////69
//
//
//
//// -----------with the help of scanner ***********************--
////
////        Scanner sc= new Scanner(System.in);
////        int size=sc.nextInt();
////        int numbers[]=new int[size];
////
////        for(int i=0; i<size; i++){
////            numbers[i] =sc.nextInt();
////        }
////        //output
////        for (int i=0; i<size; i++){
////            System.out.println(numbers[i]);
////        }
//
////output=
////5
////1
////2
////3
////4
////5
////1
////2
////3
////4
////5
//
//
//
//// -----------take an array like a input from the user or programmer and search
//// given number x and print the index at which it occurs ***********************--
//        Scanner sc= new Scanner(System.in);
//        int size= sc.nextInt();
//        int numbers[]=new int [size];
//        //take input from user and
//        for(int i=0; i<size; i++){
//            numbers[i]=sc.nextInt();
//
//           int x=sc.nextInt();
//
//            //give output  for user and
//            for (int i=0; i<numbers.length; i++){
//               if(numbers[i]==x){
//                   System.out.println("x found on index no:- " + i);
//
//               }
//               else {
//                   System.out.println("Not found ");
//               }
//            }
//        }
//
//
//
//    }
//}
