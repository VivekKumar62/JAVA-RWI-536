class THREAD1 extends Thread {
    public void run() {
        String myname = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            System.out.println(myname);
            Thread.yield();
        }
    }
}

class THREAD2 extends Thread {
    public void run() {
        String myname = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            System.out.println(myname);
        }
    }
}

class K {
    public static void main(String[] args) {
        THREAD1 t1 = new THREAD1();
        THREAD2 t2 = new THREAD2();
        t1.setName("vivek 1");
        t2.setName("Vivek 2");

        t1.start();
        t2.start();
    }
}
