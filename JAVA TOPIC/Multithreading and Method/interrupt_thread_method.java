class interrupt extends Thread{
   public void run(){

    try {
        for (int i=1; i<=5; i++){
            System.out.println("name1 thread running");
            Thread.sleep(1000);
        }
    }
    catch (InterruptedException e){
        System.out.println("name1 thread terminated "+e);
    }
    }
}
class interrupts{
    public static void main(String[] args) {
        interrupt myname1= new interrupt();
        myname1.start();
        myname1.interrupt();

    }
}