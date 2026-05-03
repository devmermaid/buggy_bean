package Basic.numbers;

import java.time.LocalDate;

public class DateTime1
{
    static void main(String[] args) {
        //LocalDate is class in jave util.time package
        //it can not get initiated with new as it works for static
        LocalDate date=LocalDate.of(2026,05,03);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
    }
}
