import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class FelineGetFamilyTest {

    String expectedAnimalFamily = "Кошачьи";

    @Test
    public void felineGetFamily() {
        Feline feline = new Feline();
        String actualAnimalFamily = feline.getFamily();
        Assert.assertEquals("Семейство не совпадает", expectedAnimalFamily, actualAnimalFamily);
    }
}
