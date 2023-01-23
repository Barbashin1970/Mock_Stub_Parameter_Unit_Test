import com.animalplanet.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineMockTest {
    @Mock
    Animal animal; // cоздадим мок - Колобок
    @Test
    public void getFoodExceptionTest() throws Exception {
        animal.getFood("Колобок");
        Mockito.verify(animal).getFood(Mockito.anyString()); // мок - проверяем
    }
}