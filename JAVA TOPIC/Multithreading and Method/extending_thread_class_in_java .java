
// 1. extending thread  class in java
class  Z extends  Thread {

    public  void fun(){
try {
    for(int i=0; i<5; i++){
        System.out.println("hgg");
        Thread.sleep(1000);
    }
}catch (Exception e){
    System.out.println(e);
}
    }
}

class  v{
    public static void main(String[] args) throws InterruptedException{
        Z t= new Z();
        t.run();
        for(int i=0; i<5; i++){
            System.out.println("oj");
            Thread.sleep(1000);
        }
    }
}