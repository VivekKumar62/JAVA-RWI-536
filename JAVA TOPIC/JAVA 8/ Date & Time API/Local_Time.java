import java.time.LocalTime;

//Local Time:-Represents a time without a time zone
public class Local_Time {
    public static void main(String[] args) {

        LocalTime  now = LocalTime.now();
        System.out.println(now); // 02:39:51.860564500 according to your current time

       LocalTime CustomTime= LocalTime.of(2,41,30);
        System.out.println(CustomTime); //02:41:30

       LocalTime ParsedTime  =LocalTime.parse("15:44:45") ;
        System.out.println(ParsedTime); // 15:44:45

        LocalTime BeforeTwoHour = now.minusHours(2);
        System.out.println(now);
        System.out.println(BeforeTwoHour); //00:47:01.850149200

        if(now.isAfter(BeforeTwoHour)){
            System.out.println("Yes "); //Yes Output will come 

        }
        else {
            System.out.println("No");
        }




    }
}
