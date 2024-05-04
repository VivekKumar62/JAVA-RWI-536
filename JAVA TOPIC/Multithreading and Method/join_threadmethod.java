class JOIN extends Thread{
    public void run(){
        String n= Thread.currentThread().getName();
        System.out.println(Thread.currentThread().getPriority());
        for(int i=1; i<=4; i++){
            System.out.println(n);

        }
    }
}

class JOIN_METHOD{
    public static void main(String[] args) {

        JOIN t1=new JOIN();
        JOIN t2=new JOIN();
        JOIN t3=new JOIN();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t3.setPriority(8);

        t2.start();
       try {
           t2.join();

       }catch (InterruptedException i) {

       }
        t1.start();
        t3.start();
    }
}