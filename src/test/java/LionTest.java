import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        // создай объект класса
        Lion lion = new Lion("Самка", feline);
        Mockito.when(lion.getKittens()).thenReturn(11); //  стаб
        Assert.assertEquals(11, lion.getKittens());
    }
    @Mock
    Lion lion;
    @Test
    public void getFoodTest() throws Exception {
        lion.getFood();
        Mockito.verify(lion).getFood(); // мок - проверяем
    }

}