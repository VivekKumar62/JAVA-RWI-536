
//    1st example
public class continue_statem {
    public static void main(String[] args){
        for(int i=1; i<=100; i++){
            if(i==45){
                continue;
            }
            System.out.println(i);

        }
    }
}

   //2nd example
//   public class continue_statem {
//       public static void main(String[] args){
//          int i=0;
//          do {
//              if(i==4 || i==18){
//                  i=i+2;
//                  continue;
//              }
//              System.out.println(i);
//              i=i+2;
//          }
//          while (i<=40);
//
//       }
//   }