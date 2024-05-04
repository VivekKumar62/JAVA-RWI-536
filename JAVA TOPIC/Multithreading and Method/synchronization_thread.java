
 //problem of multithreading
//class Bus implements  Runnable
//{
//    int available =1,passenger;
//    Bus(int passenger){
//        this.passenger=passenger;
//    }
//    public void run(){
//        String name= Thread.currentThread().getName();
//      if(available>=passenger){
//          System.out.println(name + "reserved seat:-  ");
//          available = available-passenger;
//      }
//      else
//      {
//          System.out.println(" sorry seat not available ");
//      }
//    }
//}
//class customer {
//    public static void main(String[] args) {
//        Bus r= new Bus(1);
//
//        Thread t1=new Thread(r);
//        Thread t2=new Thread(r);
//        Thread t3=new Thread(r);
//
//
//         t1.setName("ram");
//         t2.setName("shyam");
//         t3.setName("sita");
//
//          t1.start();
//          t2.start();
//          t3.start();
//
//    }
//
//
//}



                    // solution


 class Bus implements  Runnable
 {
     int available =1,passenger;
     Bus(int passenger){
         this.passenger=passenger;
     }
     public synchronized void run(){
         String name= Thread.currentThread().getName();
         if(available>=passenger){
             System.out.println(name + "  reserved seat:-  ");
             available = available-passenger;
         }
         else
         {
             System.out.println(" sorry seat not available ");
         }
     }
 }
 class customer {
     public static void main(String[] args) {
         Bus r = new Bus(1);

         Thread t1 = new Thread(r);
         Thread t2 = new Thread(r);
         Thread t3 = new Thread(r);


         t1.setName("ram");
         t2.setName("shyam");
         t3.setName("sita");

         t1.start();
         t2.start();
         t3.start();

     }


 }

 //ram  reserved seat:-
 // sorry seat not available
 // sorry seat not availabl