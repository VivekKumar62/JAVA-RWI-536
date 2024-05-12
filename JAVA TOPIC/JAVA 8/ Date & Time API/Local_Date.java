import java.time.LocalDate;
import java.time.Month;

//Local date: - Represents a date without a time zone
public class Local_Date {
    public static void main(String[] args) {
      LocalDate now=  LocalDate.now();
        System.out.println(now); //2024-05-13

        LocalDate MyBirthday =LocalDate.of(2001,12,15);
        System.out.println(MyBirthday); //2001-12-15

        int DayOfMonth = now.getDayOfMonth();
        Month month= now.getMonth();
         int year = now.getYear();

        System.out.println(DayOfMonth);  // 13
        System.out.println(month);      //MAY
        System.out.println(year);       //2024

// Minus date month year
        LocalDate today= LocalDate.now();
        System.out.println(today);
        LocalDate CustomDate= LocalDate.of(2001,12,15);
        LocalDate Yesterday=today.minusDays(5);
        System.out.println(Yesterday);
        LocalDate pastDate =today.minusMonths(50);
        System.out.println(pastDate);
        //2024-05-13
        //2024-05-08
        //2020-03-13

        if(today.isAfter(Yesterday)){
            System.out.println("Done"); //Done
        }

    }
}
