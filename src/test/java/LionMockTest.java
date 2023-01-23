import com.animalplanet.Feline;
import com.animalplanet.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(lion.getKittens()).thenReturn(5); //  стаб
        Assert.assertEquals(5, lion.getKittens());
    }
    @Test
    public void getFoodTest() throws Exception {
        feline.getFood("Хищник");
        Mockito.verify(feline).getFood("Хищник"); // мок - проверяем
    }
}