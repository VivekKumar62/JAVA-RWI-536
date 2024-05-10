import java.util.function.Predicate;

public class Example_three_Predicate {
    public static void main(String[] args) {
       Predicate<String> startsWithLetterV = x-> x.toLowerCase().charAt(0) == 'v';
        System.out.println(startsWithLetterV.test("vamika"));
    }
}
//true