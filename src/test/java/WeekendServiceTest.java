import org.example.WeekendsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeekendServiceTest {
    @Test
            public void shouldCalculateWeekendService1() {
        int count = WeekendsService.calculate(10000, 3000, 20000);
        int expected = 3;

        Assertions.assertEquals(expected, count);
    }
}
