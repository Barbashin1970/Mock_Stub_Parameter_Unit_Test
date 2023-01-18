import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class FelineTestMock {
    @Mock
    Feline feline; // подменим тип кошачий моком
    @Test
    public void getFoodTest() throws Exception {
        feline.getFood("Кошачье семейство");
        Mockito.verify(feline).getFood(Mockito.anyString()); // мок - проверяем
    }
    @Mock
    Animal animal; // cоздадим мок - Колобок
    @Test
    public void getFoodExceptionTest() throws Exception {
        animal.getFood("Колобок");
        Mockito.verify(animal).getFood(Mockito.anyString()); // мок - проверяем
    }
}