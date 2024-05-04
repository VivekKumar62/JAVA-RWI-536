import java.util.Scanner;
// 1. you can give one letter and check it, it is vowel or not
//public class vowel {
//    public static void main(String[] args){
//       char ch;
//       Scanner r=new Scanner(System.in);
//        System.out.println("Enter a string");
//       ch= r.next().charAt(0);
//        if(ch =='a' ||ch =='e' || ch =='i' || ch =='o' ||ch =='u'|| ch =='A' ||ch =='E' || ch =='I' || ch =='O' ||ch =='U'){
//            System.out.println("vowel");
//        }
//        else {
//            System.out.println("const");
//        }
//    }
//}




//2. you can give word and check it, it is vowel or not
public class vowel {
    public static void main(String[] args) {
        String name = "vivek"; 
        for(int i=0; i<name.length();i++){
            char v=name.charAt(i);
            if(v=='a' || v=='e' || v=='i' || v=='o' || v=='u'){
                System.out.println(v);
            }
        }
    }
}


