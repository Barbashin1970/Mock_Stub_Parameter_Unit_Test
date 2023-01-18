import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionTestFact {

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        int kittens =  lion.getKittens();
        Assert.assertEquals(1, kittens);
    }
    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        List<String> food = lion.getFood();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }
    @Test
    public void haveManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        boolean mane =  lion.doesHaveMane();
        Assert.assertEquals(false, mane);
    }
    @Test
    public void haveManeKingTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        boolean mane =  lion.doesHaveMane();
        Assert.assertEquals(true, mane);
    }

    @Test
    public void haveManeExceptionTest() throws Exception {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("детеныш", feline);
        boolean mane =  lion.doesHaveMane();
        Assert.assertEquals(true, mane);
        }
         catch (Exception exception) {
             Assert.assertEquals(exception.getMessage(),"Используйте допустимые значения пола животного - самец или самка");
         };
    }

}
