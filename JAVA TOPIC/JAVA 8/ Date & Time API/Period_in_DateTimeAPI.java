import java.time.LocalDate;
import java.time.Period;

public class Period_in_DateTimeAPI {
    public static void main(String[] args) {
       LocalDate now= LocalDate.now();
        LocalDate then = LocalDate.of(1996,5,15);
        Period period=Period.between(now,then);
        System.out.println(period);

        //period use: - when we use days,month,year
    }
}
