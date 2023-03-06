import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService.service.SQRService;

public class SQRServiceTest {
        @Test
        public void ThenNumberOfSquares() {
            SQRService sqrService = new SQRService();

            int expected = 3;
            var actual =  sqrService.calcSQR( 200 , 300);
            Assertions.assertEquals(expected, actual);
        }
    }
