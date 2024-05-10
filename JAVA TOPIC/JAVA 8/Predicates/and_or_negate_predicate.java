
  // and or negate
import java.util.function.Predicate;

public class and_or_negate_predicate {
    public static void main(String[] args) {

        Predicate<String> startsWithLetterV = x-> x.toLowerCase().charAt(0) == 'v';
        Predicate<String> endsWithLetterL = x-> x.toLowerCase().charAt(x.length() -1) == 'l';

        Predicate<String> and = startsWithLetterV.and(endsWithLetterL);
        System.out.println(and.test("vipul"));

        Predicate<String> or = startsWithLetterV.or(endsWithLetterL);
        System.out.println(or.test("vivek"));

        System.out.println(startsWithLetterV.negate().test("vishal"));
    }
}

//true
//true
//false