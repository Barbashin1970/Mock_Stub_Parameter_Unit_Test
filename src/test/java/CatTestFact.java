import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CatTestFact {
    @Test
    public void getSoundTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String voice = cat.getSound(); //
        Assert.assertEquals("Мяу", voice);
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> food = cat.getFood();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }
}
