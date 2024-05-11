import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BICONSUMER {
    public static void main(String[] args) {

        Consumer<Integer> myconsumer= (x) -> {
            System.out.println(x);
        };
        myconsumer.accept(550); // o/p 550

        BiConsumer<Integer,Integer> mybiConsumer = (x,y) -> {
            System.out.println(x+y);
        };
        mybiConsumer.accept(11,2); //o/p 13
    }
}
