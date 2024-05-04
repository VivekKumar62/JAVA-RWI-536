//string is basically an object that represents
//        sequence of char values. An array of characters works
//        same as Java string. For example:

import java.util.Scanner;

//***********---------------------********************
//// example .

public class string {
    public  static  void main(String[]args){
        String name="Vivek";
        String fullname="Vivek kumar";
        String sentences="i am vivek";
        System.out.println(name);
        System.out.println(fullname);
        System.out.println(sentences);

    }
}
//***********---------------------********************

//// example .

//public class string {
//    public  static  void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        String name=sc.next();
//        System.out.println("your name is " + name);
//
//    }
//}
//output print only single word but you want print full sentences then ...


//***********---------------------********************

//example :-

//public class string {
//    public  static  void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        String name=sc.nextLine();
//        System.out.println("your name is " + name);
//
//    }
//}
//print full sentences
//output
// your name is i am vivek



//***********---------------------********************

                   //  format

//public class string {
//    public  static  void main(String[]args){
//        String s1=new String("vivek");
//        String s2=new String("java");
//        String s3=String.format("%s %s",s1,s2);
//        System.out.println(s3.toString());
//
//
//
//    }
//}


//example  ***********---------------------********************

                         //getByte

//public class string {
//    public  static  void main(String[]args){
//       String str="vivek";
//       byte COUNTBYTES[] =str.getBytes();
//       for(int i=0; i< COUNTBYTES.length; i++){
//           System.out.println( COUNTBYTES[i]);
//
//       }
//
//    }
//}
//             118
////           105
////           118
////           101
////           107


//example  ***********---------------------********************\

                  // uppercase   & lowercase

//public class string {
//    public  static  void main(String[]args){
//
//    String str="vivek";
//        System.out.println(str); //vivek
//        System.out.println(str.toUpperCase()); //VIVEK
//        System.out.println(str.toLowerCase()); //vivek
//
//    }
//}


//example ***********------***********

             //concatenation
//
//public class string {
//    public  static  void main(String[]args){
//        String firstname = "vivek";
//        String lastname = "kumar";
//        String fullname = firstname +" " +  lastname;
//        System.out.println(fullname);
//
//    }
//
//}
//output
//vivek kumar



//example 8 : ***********------***********

          // compare_two_string
//
//public class string {
//    public  static  void main(String[]args){
//
//        //1. s1>s2 :+ve value
//        //2. s1<s2 :-ve value
//        //3. s1 == s2 :0
//
//        String s1="vivek";
//        String s2="vivek kumar";
//        if(s1.compareTo(s2)==0){
//            System.out.println("String are equal");
//        }
//        else {
//            System.out.println("String are not equal");
//        }
//    }
//}
