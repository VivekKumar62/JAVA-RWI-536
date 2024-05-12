import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//Duration :- Represents a duration of time between two dates
public class Duration_in_DateTime{
    public static void main(String[] args) {

        Instant start = Instant.now();
        int sum=0;
        for(int i=0; i<=1000000; i++){

            sum +=i+1;
        }
        Instant end = Instant.now();
        Duration D1= Duration.between(start,end);
        Duration D2= Duration.of(2, ChronoUnit.MILLIS);
        System.out.println(D1);
        System.out.println(D2);
        //PT0.0049937S
        // PT0.002S
        int i= D1.compareTo(D2);
        System.out.println(i);  //2993700


        Duration duration=Duration.between(start,end);
        LocalDateTime a=LocalDateTime.now();
        LocalDateTime b=LocalDateTime.now();
        Duration duration1=Duration.between(a,b);
        System.out.println(duration1); //PT0S
 //duration use: - when we use millisecond, sec,minute,hours
    }
}
