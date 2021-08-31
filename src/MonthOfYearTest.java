import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MonthOfYearTest {

    @Test
    public void test(){
        MonthOfYear monthOfYear = MonthOfYear.JANUARY;
        for(int i = 0; i < 12; i++)
        {
            System.out.println(monthOfYear);
            System.out.println(monthOfYear.numberOfDays());
            monthOfYear = monthOfYear.next();
        }
    }

}