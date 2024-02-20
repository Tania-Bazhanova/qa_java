import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class CatGetSoundTest {
    @Test
    public void getSoundTest() {
        String expectedResult = "Мяу";

        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        String resultSound = cat.getSound();

        Assert.assertEquals("Кошка не говорит Мяу", expectedResult, resultSound);
    }
}
