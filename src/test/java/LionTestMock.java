import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTestMock {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(lion.getKittens()).thenReturn(5); //  стаб
        Assert.assertEquals(5, lion.getKittens());
    }
    @Mock
    Lion lion;
    @Test
    public void getFoodTest() throws Exception {
        lion.getFood();
        Mockito.verify(lion).getFood(); // мок - проверяем
    }

    @Test
    public void haveManeTest() {
        lion.doesHaveMane();
        Mockito.verify(lion).doesHaveMane(); // мок - проверяем
    }

}