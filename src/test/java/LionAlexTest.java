import com.animalplanet.Feline;
import com.animalplanet.LionAlex;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionAlexTest {

    @Test
    public void haveManeAlexTest() throws Exception {
        Feline feline = new Feline();
        LionAlex lionAlex = new LionAlex(feline);
        boolean mane =  lionAlex.doesHaveMane();
        Assert.assertTrue(mane);
    }
    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        LionAlex lionAlex = new LionAlex(feline);
        List<String> food = lionAlex.getFood();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }
    @Test
    public void getFriendsTest() throws Exception {
        Feline feline = new Feline();
        LionAlex lionAlex = new LionAlex(feline);
        List<String> actual = lionAlex.getFriends();
        Assert.assertEquals(List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман"), actual);
    }
    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Feline feline = new Feline();
        LionAlex lionAlex = new LionAlex(feline);
        String actual = lionAlex.getPlaceOfLiving();
        Assert.assertEquals("Нью-Йоркский зоопарк", actual);
    }
    @Test
    public void getKittensAlexTest() throws Exception {
        Feline feline = new Feline();
        LionAlex lionAlex = new LionAlex(feline);
        int actual = lionAlex.getKittens();
        Assert.assertEquals(0, actual);
    }

}