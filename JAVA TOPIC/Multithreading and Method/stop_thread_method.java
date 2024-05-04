class G  extends  Thread {
    public void run() {
        String myname = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            System.out.println(myname);
            Thread.yield();
        }
    }
}
class  J {
    public static void main(String[] args) {
       G t1=new G();
       G t2=new G();
       G t3=new G();
        t1.setName("t1 vivek ");
        t2.setName("t2 vivek ");
        t2.setName("t3 vivek ");

        t1.start();
        t2.start();
        t2.start();

//        t2.stop();
    }
}
