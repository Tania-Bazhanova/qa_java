import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

public class LionExeptionConstructorTest {
    @Test
    public void exeptionConstructorTest() {
        String expectedMesage = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = Assert.assertThrows("Исключение не случается", Exception.class, () -> new Lion("123", new Feline()));
        Assert.assertEquals("Сообщения не совпадают", expectedMesage, exception.getMessage());
    }
}
