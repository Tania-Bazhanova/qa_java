import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

public class LionExeptionConstructorTest {
    @Test
    public void exeptionConstructorTest() {

        String expected = "Используйте допустимые значения пола животного - самец или самка";

        try {
            Lion lion = new Lion("Тест");
            Assert.fail("Должен упасть exeption");
        } catch (Exception e) {
            Assert.assertEquals("Сообщения не совпадают", expected, e.getMessage());
        }
    }
}
