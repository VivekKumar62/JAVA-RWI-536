import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

//Zoned Date Time:- Represents a date and time without time zone
// *Coordinated Universal Time (UTC)
public class Zoned_Date_Time {
    public static void main(String[] args) {
        ZonedDateTime CurrentNow  = ZonedDateTime.now();
        Set<String> AvlableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(AvlableZoneIds);
        AvlableZoneIds.forEach(System.out::println);

        ZonedDateTime CustomIndianCocos = ZonedDateTime.of(
                2001,
                12,
                15,
                19,35,30,
                25,
                ZoneId.of("Indian/Cocos"));
        System.out.println(CustomIndianCocos); //2001-12-15T19:35:30.000000025+06:30[Indian/Cocos]

        ZonedDateTime IndianTime  = ZonedDateTime.now();
        System.out.println("Current time in India " + IndianTime);

        ZonedDateTime Hongkong = ZonedDateTime.now(ZoneId.of("Hongkong"));
        System.out.println("Current time in Hongkong"+ Hongkong);

        //Current time in India 2024-05-13T03:17:06.318876400+05:30[Asia/Calcutta]
        //Current time in Hongkong2024-05-13T05:47:06.322880500+08:00[Hongkong]
    }
}
