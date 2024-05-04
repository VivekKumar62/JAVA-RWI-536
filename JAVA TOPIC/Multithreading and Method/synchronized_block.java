class msg {
    public synchronized void show(String name) {
       synchronized(this) {
        for (int i = 0; i <= 3; i++) {
            System.out.println("hello vivek" + name);
        }
       }
    }
}

class helloThread extends Thread {
    msg m;
    String name;

    helloThread(msg m, String name) {
        this.m = m;
        this.name = name;
    }

    public void run() {
        m.show(name);
    }
}

    class SynBlock {
    public static void main(String[] args) {
        msg m = new msg();
        helloThread t1 = new helloThread(m, "Thread1");
        helloThread t2 = new helloThread(m, "Thread2");
        t1.start();
        t2.start();
    }
}
