import java.util.Scanner;

//1st example
//print table of a number input by user
public class While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:- ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= 100) {
            System.out.println(i * n);
            i++;
        }
    }
}
//  2nd example print reverse star pattern
//public class While_Loop {
//    public static void main(String[]args){
//        int i = 5;
//        while (i >= 1) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print('*');
//                j++;
//            }
//            System.out.println();
//            i--;
//        }
//
//    }
//}
