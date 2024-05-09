//with body method
interface  Parent{
    default void  sayHello(){
        System.out.println("hello");
    }
}
class Child implements  Parent{
  @Override
    public  void sayHello(){
        System.out.println("child say hello");
    }
        }
public class default_method {
    public static void main(String[] args) {
        Child c= new Child();
        c.sayHello();
    }
}
