import org.junit.Test;
import static org.junit.Assert.assertEquals;

// Kiểm thu dong dieu kien voi do phu C2
public class BranchCovTest {
    @Test
    public void testRidePricingService1(){
        assertEquals(-1, RidePricingService.calculatePrice(0f, 1f, true),0.0);
    }

    @Test
    public void testRidePricingService2(){
        assertEquals(-1, RidePricingService.calculatePrice(1f, -1f, true),0.0);
    }

    @Test
    public void testRidePricingService3(){
        assertEquals(34000, RidePricingService.calculatePrice(1f, 3f, true),0.0);
    }

    @Test
    public void testRidePricingService4(){
        assertEquals(28000, RidePricingService.calculatePrice(2f, 1f, false),0.0);
    }
}
