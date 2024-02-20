import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {

    @Mock
    Feline feline;

    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedListFood = List.of("Животные", "Птицы", "Рыба");
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedListFood);
        List<String> actualListFood = lion.getFood();
        Assert.assertEquals("Списки не совпадают", expectedListFood, actualListFood);
    }

    @Test
    public void getLionKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualLionKittens = lion.getKittens();
        Assert.assertEquals("Количество львят не совпадает", 1, actualLionKittens);
    }
}
