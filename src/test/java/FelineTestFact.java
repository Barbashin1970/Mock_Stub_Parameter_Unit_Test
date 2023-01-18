import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTestFact {

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        Assert.assertEquals("Кошачьи", family);
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.getFood("Хищник");
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void getFoodTest2() throws Exception {
        Animal animal = new Animal();
        List<String> food = animal.getFood("Травоядное");
        Assert.assertEquals(List.of("Трава", "Различные растения"), food);
    }

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    public void getKittensTestParameter() {
        Feline feline = new Feline();
        int kittens = feline.getKittens(10);
        Assert.assertEquals(10, kittens);
    }
    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int kittens = feline.getKittens();
        Assert.assertEquals(1, kittens);
    }
}