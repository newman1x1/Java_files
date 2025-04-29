
import java.time.LocalTime;

public class DateTimeNewEx {

    public static void main(String args[]) {
        LocalTime current_time = LocalTime.now();
        System.out.println("Current Time: " + current_time);
        LocalTime specificTime = LocalTime.of(11, 30, 45); // 11:30:45 AM
        System.out.println("specificTime : " + specificTime);
        LocalTime parsedTime = LocalTime.parse("15:30:45");
        System.out.println("parsedTime : " + parsedTime);

        // Operations
        LocalTime now = LocalTime.now();
        LocalTime nextHour = now.plusHours(1);
        int hour = now.getHour();
        int min = now.getMinute();
        boolean isAfter = now.isAfter(LocalTime.NOON);
        System.out.println("Current time : " + now);
        System.out.println("nextHour: " + nextHour);
    }
}