import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle= new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100,waterBottle.getVolume(),0.01);
    }

    @Test
    public void drinkGlass(){
        waterBottle.drinkWater();
        assertEquals(90,waterBottle.getVolume(),0.01);
    }

    @Test
    public void emptyBottle(){
        assertEquals(0,waterBottle.empty(),0.01);
    }
}
