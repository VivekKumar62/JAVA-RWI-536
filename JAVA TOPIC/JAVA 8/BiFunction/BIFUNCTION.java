import java.util.function.BiFunction;
import java.util.function.Function;

public class BIFUNCTION {
    public static void main(String[] args) {

        Function<String,Integer> myfunction = str -> str.length();
        System.out.println(myfunction.apply("vivek")); // o/p 5

          // now we will create function take two string and add length both string

        BiFunction<String,String,Integer> mybifunction =(x,y)->x.length()+y.length();
        System.out.println(mybifunction.apply("ashish sir"," shivam sir ")); // o/p 22
    }
}
