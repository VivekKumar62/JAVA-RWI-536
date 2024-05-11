
interface STATIC1{
      static  void sayHellodear(){
        System.out.println("Hello ji");
    }
//    default void sayByedear(){
//        System.out.println("Bye bye dear");
//    }
}
public class StaticClass implements STATIC1 {
    public static void main(String[] args) {
        StaticClass obj= new StaticClass();
 STATIC1.sayHellodear();
    }
}
