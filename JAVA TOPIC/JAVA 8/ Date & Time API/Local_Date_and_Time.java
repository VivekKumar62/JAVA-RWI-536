import java.time.LocalDate;
import java.time.LocalDateTime;

//Local Date Time : - Represents Time and Date without a Time Zone
public class Local_Date_and_Time {
    public static void main(String[] args) {
        LocalDateTime NOW= LocalDateTime.now();
        System.out.println(NOW); //2024-05-13T02:53:51.605147700

        LocalDateTime MyDate = LocalDateTime.parse("2024-01-11T02:58");
        System.out.println(MyDate); //2024-01-11T02:58

        
    }
}
