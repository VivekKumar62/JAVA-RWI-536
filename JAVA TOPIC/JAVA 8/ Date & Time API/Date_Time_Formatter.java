
// DateTimeFormatter :- Formates and parses dates and times

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args) {

        LocalDate myLocalDate = LocalDate.now();
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format= myLocalDate.format(myFormatter);
        System.out.println(myLocalDate); //2024-05-13

        String date="13/05/2024";
        DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse= LocalDate.parse(date,dateTimeFormatter);
        System.out.println(parse);//2024-05-13

        String DateTimeSting ="2024-05-28 11:10:30:44+05:30";
        DateTimeFormatter FORMATTER =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX");
        System.out.println(FORMATTER);
        //Value(YearOfEra,4,19,EXCEEDS_PAD)'-'Value(MonthOfYear,2)'-'Value(DayOfMonth,2)' 'Value(HourOfDay,2)':'Value(MinuteOfHour,2)':'Value(SecondOfMinute,2)Offset(+HH:MM,'Z')

    }
}
