

//By extending Thread class

//class A extends Thread{
//    public  void  run(){
//      for(int i=1; i<=10; i++){
//          System.out.println("vivek");
//      }
//    }
//}
//class B{
//    public static void main(String[] args) {
//          A t=new A();
//            t.start();
//    }
//}



////------------*********************************----------------------
//
////By implementing Runnable interface.
//
//
//class A implements  Runnable{
//    public  void run(){
//        for(int i=1; i<=10; i++){
//            System.out.println("hello dear");
//        }
//    }
//}
//
//class B
//{
//    public static void main(String[] args) {
//
//  A r=new A();
//  Thread t=new Thread(r);
//  t.start();
//        for(int i=1; i<=10; i++){
//            System.out.println("main thread");
//        }
//    }
//}