import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeekdayTest {

    @Test
    public void test() {
        Weekday weekday = Weekday.WEEKEND;
        assertEquals("Today you can rest", weekday.StatusOfTheDay());

        weekday = Weekday.WORKDAY;
        assertEquals("You're working today", weekday.StatusOfTheDay());
    }

}