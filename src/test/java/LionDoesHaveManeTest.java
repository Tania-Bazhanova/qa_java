import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {

    String sex;
    boolean expectedMane;

    public LionDoesHaveManeTest(String sex, boolean expectedMane) {
        this.sex = sex;
        this.expectedMane = expectedMane;
    }

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void lionDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        boolean actualMane = lion.doesHaveMane();
        Assert.assertEquals("Присутсвие/отсутствие гривы не совпадает", expectedMane, actualMane);
    }

}
