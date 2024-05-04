class B implements  Runnable{

    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("hello " + i);
        }
    }

}
class C{
    public static void main(String[] args) {
        B r = new B();
        Thread t=new Thread(r);
        t.start();
    }
    }

