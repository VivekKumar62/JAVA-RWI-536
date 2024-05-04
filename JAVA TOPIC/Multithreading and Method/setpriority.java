class setpriority extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
class setPriorityy{
    public static void main(String[] args) {

        priority name1= new priority();
        priority name2= new priority();
        priority name3= new priority();

        name1.setName("name1 thread");
        name2.setName("name2 thread");
        name3.setName("name3 thread");

        name1.setPriority(2);
        name2.setPriority(7);
        name3.setPriority(8);

        name1.start();
        name2.start();
        name3.start();

    }
}

