import com.animalplanet.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatMockTest {
    @Mock
    Feline feline; // подменим тип кошачий моком
    @Test
    public void getFoodTest() throws Exception {
        feline.getFood("Кошачье семейство");
        Mockito.verify(feline).getFood(Mockito.anyString()); // мок - проверяем
    }
}