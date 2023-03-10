import com.animalplanet.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

    public class FelineFactTest {

        @Test
        public void getFamilyFelineTest() {
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
        public void getFoodExceptionTest() {
            try {Feline feline = new Feline();
                List<String> food = feline.getFood("Колобок");
                Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);}
            catch (Exception exception) {
                Assert.assertEquals(exception.getMessage(), "Неизвестный вид животного, используйте значение Травоядное или Хищник");
            }
        }
        @Test
        public void getFoodAnimalTest() throws Exception {
            Animal animal = new Animal();
            List<String> food = animal.getFood("Травоядное");
            Assert.assertEquals(List.of("Трава", "Различные растения"), food);
        }

        @Test
        public void getFamilyAnimalTest()  {
            Animal animal = new Animal();
            String family = animal.getFamily();
            Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", family);
        }
        @Test
        public void eatMeatTest() throws Exception {
            Feline feline = new Feline();
            List<String> food = feline.eatMeat();
            Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
        }

        @Test
        public void getKittensWithArgumentTest() {
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
