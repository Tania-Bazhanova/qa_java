import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class FelineGetKittensTest {
    private final int kittensCount;
    private final int expectedFelineKittens;

    public FelineGetKittensTest(int kittensCount, int expectedFelineKittens) {
        this.kittensCount = kittensCount;
        this.expectedFelineKittens = expectedFelineKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][] {
                { 10, 10},
                { 0, 0},
                //{ -1, 0}
        };
    }

    @Test
    public void getFelineKittens() {
        Feline feline = new Feline();
        int actualFelineKittens = feline.getKittens(kittensCount);
        Assert.assertEquals("Количество не совпадает", expectedFelineKittens, actualFelineKittens);
    }
}
