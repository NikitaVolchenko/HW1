import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeekdayTest {

    @Test
    public void test() {
        Weekday weekday = Weekday.WEEKEND;
        System.out.println(weekday.StatusOfTheDay());

        weekday = Weekday.WORKDAY;
        System.out.println(weekday.StatusOfTheDay());
    }

}