class A extends  Thread{
    public void run(){
        String n=Thread.currentThread().getName();
      for(int i=1; i<=3; i++){
          System.out.println(n);
      }
    }
}
class D{
    public static void main(String[] args) {
      A t1= new  A();
      A t2= new  A();
      A t3= new  A();
      t1.setName("thread 1");  //it is my thread  1
      t2.setName("thread 2");  // it is my thread 2
      t3.setName("thread 3");  // it is my thread 3
      t1.start();
      t2.start();
      t3.start();

//        String n=Thread.currentThread().getName();
//        for(int i=1; i<=3; i++){
//            System.out.println(n); // four method available t1,t2,t3 and main method
//        }


    }
}