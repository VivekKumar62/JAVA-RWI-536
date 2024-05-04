import java.util.Scanner;

               //1st example

public class if_else_statements {
    public static void main(String[] args){
        System.out.println("Enter your  age: ");
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
         if(age>17){
             System.out.println("Adult");
         }
         else {
             System.out.println("Child");
         }

    }
}


                        //2nd example

//public class if_else_statements {
//    public static void main(String[] args){
//        System.out.println("Enter your  button :- ");
//        Scanner sc=new Scanner(System.in);
//        int button= sc.nextInt();
//        if(button==1){
//            System.out.println("LOW");
//        }
//        else if(button == 2){
//            System.out.println("Medium");
//        }
//        else if(button==3){
//            System.out.println("HIGH");
//        }
//        else {
//            System.out.println("Invalid button");
//        }

//
//    }
//}