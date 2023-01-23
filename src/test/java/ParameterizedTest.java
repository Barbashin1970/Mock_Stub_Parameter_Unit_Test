import com.animalplanet.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    private final int kitten;
    public ParameterizedTest(int kitten){
        this.kitten = kitten;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {0},
                {1},
                {9},
        };
    }
    @Test
    public void getKittensWithArgumentTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kitten);
        Assert.assertEquals(kitten, actual);
    }

}