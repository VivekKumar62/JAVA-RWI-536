import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example_two_Predicate {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x->x%2==0;
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,78,4,89,100);
        for(Integer i:numbers){
            if(isEven.test(i)){
                System.out.println("Even number: " +i);
            }
        }
    }
}

//Even number: 2
//Even number: 4
//Even number: 6
//Even number: 78
//Even number: 4
//Even number: 100
