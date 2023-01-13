import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/number.csv")

    public void testNumberOfSqeares(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.numberOfSquares(min, max);

        Assertions.assertEquals(expected, actual);
    }
}
