import com.animalplanet.Feline;
import com.animalplanet.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedManeTest {
    private final String lionType;
    private final boolean mane;

    public ParameterizedManeTest(String lionType, boolean mane){
        this.lionType = lionType;
        this.mane = mane;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"другое", false},
        };
    }
    @Test
    public void doesHaveManeTest() {
        try {
            Feline feline = new Feline();
            Lion lion = new Lion(lionType, feline);
            boolean actual = lion.doesHaveMane();
            Assert.assertEquals(mane, actual);
        }
        catch (Exception exception) {
            Assert.assertEquals(exception.getMessage(),"Используйте допустимые значения пола животного - самец или самка");
        }
    }
}