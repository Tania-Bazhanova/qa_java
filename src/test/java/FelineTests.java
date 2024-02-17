import com.example.Feline;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {

    @Spy
    private Feline feline;

    @org.junit.Test
    public void getFelineKittens() {
        Assert.assertEquals("Количество не совпадает", 1, feline.getKittens());
    }

    @org.junit.Test
    public void eatFelineMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(2)).getFood("Хищник");
    }
}
