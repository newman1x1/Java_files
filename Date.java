import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Date {

    public static void main(String args[]) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate previousMonthSameDay = today.minusMonths(1);
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        boolean isLeapYear = today.isLeapYear();
        System.out.println("today Date: " + today);
        System.out.println("tomorrow Date: " + tomorrow);
        System.out.println("previousMonthSameDay Date: " + previousMonthSameDay);
        System.out.println("dayOfWeek : " + dayOfWeek);
        System.out.println("isLeapYear : " + isLeapYear);
    }
}