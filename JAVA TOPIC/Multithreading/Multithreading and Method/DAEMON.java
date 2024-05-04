class DEMONCHECK extends  Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread ");
        } else {
            System.out.println("user thread ");
        }
    }
}

public  class DAEMON{
    public static void main(String[] args) {
        DEMONCHECK t1=new DEMONCHECK();
        DEMONCHECK t2=new DEMONCHECK();
        DEMONCHECK t3=new DEMONCHECK();

        t1.setDaemon(true);


        t1.start();
        t2.start();
        t3.start();




    }

}