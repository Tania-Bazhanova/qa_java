import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionAlexTests {
    @Test
    public void getLionAlexKittens() throws Exception {

        int expectedCountKittens = 0;

        LionAlex alex = new LionAlex();
        int actualCountKittens = alex.getKittens();
        Assert.assertEquals("Количество львят не совпадает", expectedCountKittens, actualCountKittens);
    }

    @Test
    public void getPlaceOfLivingLionAlex() throws Exception {
        String expectedPlaceOfLivingAlex = "Нью-Йоркский зоопарк";

        LionAlex alex = new LionAlex();
        String actualPlaceOfLivingAlex = alex.getPlaceOfLiving();

        Assert.assertEquals("Место жительства Алекса не совпадает", expectedPlaceOfLivingAlex, actualPlaceOfLivingAlex);
    }

    @Test
    public void getFriendsLionAlex() throws Exception {
        List<String> expectedFriendsLionAlex = List.of("Марти", "Глория", "Мелман");

        LionAlex alex = new LionAlex();
        List<String> actualFriendsLionAlex = alex.getFriends();

        Assert.assertEquals("Список друзей Алекса не совпадает", expectedFriendsLionAlex, actualFriendsLionAlex);
    }
}
