package Basic.Methods;

import java.time.*;

public class localdate
{
    static void main() {
        LocalDate date=LocalDate.of(2026,4,3);
        int day=date.getDayOfMonth();
        Month month=date.getMonth();
        int year=date.getYear();
        int dayofyear=date.getDayOfYear();
        String dayofweek=date.getDayOfWeek().toString();
        boolean isLeap=date.isLeapYear();
        System.out.println("Day: "+day);
        System.out.println("Month: "+month);
        System.out.println("Year: "+year);
        System.out.println("Day of Year: "+ dayofyear);
        System.out.println("Day of week: "+dayofweek);
        System.out.println("Leap Year: "+ isLeap);
    }
}
