class  E extends Thread {
    public  void run(){
        String n=Thread.currentThread().getName();
   try {
       for(int i=1; i<=3; i++){
           System.out.println( n);
           Thread.sleep(1000);
       }
   }catch (InterruptedException e){
       System.out.println(e);
   }
}
}
class F {
    public static void main(String[] args) {
        E t1=new E();
        E t2=new E();
        E t3=new E();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t2.setName("Thread 3");
        t1.start();
        t2.start();
        t3.start();








    }
}