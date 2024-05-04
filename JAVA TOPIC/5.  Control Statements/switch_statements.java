import java.util.Scanner;

                        // 1st example check day
public class switch_statements {
    public static void main(String[]args){
        // switch
        System.out.println("Enter you day:- ");
        Scanner sc=new Scanner(System.in);
        int day= sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid ");
        }

        }
    }




                        // 2nd example check vowel or const
//public class switch_statements {
//    public static void main(String[]args){
//        // switch
//        System.out.println("Enter you char:- ");
//        Scanner sc=new Scanner(System.in);
//        char ch = sc.next().charAt(0);
//        switch (ch){
//            case 'a':
//                System.out.println("vowel");
//                break;
//            case 'e':
//                System.out.println("vowel");
//                break;
//            case 'i':
//                System.out.println("vowel");
//                break;
//            case 'o':
//                System.out.println("vowel");
//                break;
//            case 'u':
//                System.out.println("vowel");
//                break;
//            default:
//                System.out.println("const");
//
//        }
//
//
//
//
//
//    }
//}
//
