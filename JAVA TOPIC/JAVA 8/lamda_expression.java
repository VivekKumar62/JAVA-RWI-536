// remove midifier
public class lamda_expression {

    private void add(int a, int b){
        System.out.println(a+b);
    }

    //converted to
   // (int a, int b) ->{
     //   System.out.println(a+b);

    //converted to
    //(a,b) ->{
    //   System.out.println(a+b);
    // }

}

