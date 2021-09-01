import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MonthOfYearTest {

    @Test
    public void test() {
        MonthOfYear monthOfYear = MonthOfYear.JANUARY;
        assertEquals(31, monthOfYear.getNumberOfDays());

        monthOfYear = monthOfYear.next();
        assertEquals(28, monthOfYear.getNumberOfDays());

        monthOfYear = monthOfYear.next();
        assertEquals(31, monthOfYear.getNumberOfDays());

        monthOfYear = monthOfYear.next();
        assertEquals(30, monthOfYear.getNumberOfDays());

        monthOfYear = monthOfYear.next();
        assertEquals(31, monthOfYear.getNumberOfDays());

        monthOfYear = monthOfYear.next();
        assertEquals(30, monthOfYear.getNumberOfDays());

        monthOfYear = monthOfYear.next();
        assertEquals(31, monthOfYear.getNumberOfDays());

        monthOfYear = monthOfYear.next();
        assertEquals(31, monthOfYear.getNumberOfDays());

        monthOfYear = monthOfYear.next();
        assertEquals(30, monthOfYear.getNumberOfDays());

        monthOfYear = monthOfYear.next();
        assertEquals(31, monthOfYear.getNumberOfDays());

        monthOfYear = monthOfYear.next();
        assertEquals(30, monthOfYear.getNumberOfDays());

        monthOfYear = monthOfYear.next();
        assertEquals(31, monthOfYear.getNumberOfDays());

        monthOfYear = monthOfYear.next();
        assertEquals("January", monthOfYear.getValue());
    }

}