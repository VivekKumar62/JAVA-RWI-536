import java.util.Optional;
import java.util.OptionalInt;

public class OPTIONAL {
    public static void main(String[] args) {
        Optional<String> NamePrint = getName(2);

        Optional<String> NamePrint1 = NamePrint.map(x->x.toUpperCase());
        NamePrint1.ifPresent(System.out::println); //VIVEK

        Optional<String> NamePrint2 = NamePrint.map(x-> String.valueOf(x.length()));
        NamePrint2.ifPresent(System.out::println); //5





    }
    private static Optional<String> getName(int id){
//        return Optional.ofNullable(name);
        return Optional.of("vivek");
    }
}
