import org.junit.Test;
import static org.junit.Assert.assertEquals;

// Kiểm thử biên
public class BoundaryTest {
    @Test
    public void testRidePricingService1(){
        assertEquals(-1, RidePricingService.calculatePrice(0.9f, 500f, false),0.0);
    }

    @Test
    public void testRidePricingService2(){
        assertEquals(2005000, RidePricingService.calculatePrice(1f, 500f, false),0.0);
    }

    @Test
    public void testRidePricingService3(){
        assertEquals(2005000, RidePricingService.calculatePrice(1.1f, 500f, false),0.0);
    }

    @Test
    public void testRidePricingService4(){
        assertEquals(2005000, RidePricingService.calculatePrice(1.5f, 500f, false),0.0);
    }

    @Test
    public void testRidePricingService5(){
        assertEquals(2005000, RidePricingService.calculatePrice(1.9f, 500f, false),0.0);
    }

    @Test
    public void testRidePricingService6(){
        assertEquals(4510000, RidePricingService.calculatePrice(2f, 500f, false),0.0);
    }

    @Test
    public void testRidePricingService7(){
        assertEquals(-1, RidePricingService.calculatePrice(2.1f, 500f, false),0.0);
    }

    @Test
    public void testRidePricingService8(){
        assertEquals(-1, RidePricingService.calculatePrice(1.5f, -0.1f, false),0.0);
    }

    @Test
    public void testRidePricingService9(){
        assertEquals(13000, RidePricingService.calculatePrice(1.5f, 0f, false),0.0);
    }

    @Test
    public void testRidePricingService10(){
        assertEquals(13000, RidePricingService.calculatePrice(1.5f, 0.1f, false),0.0);
    }

    @Test
    public void testRidePricingService11(){
        assertEquals(4004600, RidePricingService.calculatePrice(1.5f, 999.9f, false),0.1);
    }

    @Test
    public void testRidePricingService12(){
        assertEquals(4005000, RidePricingService.calculatePrice(1.5f, 1000f, false),0.0);
    }

    @Test
    public void testRidePricingService13(){
        assertEquals(-1, RidePricingService.calculatePrice(1.5f, 1000.1f, false),0.0);
    }

    @Test
    public void testRidePricingService14(){
        assertEquals(-1, RidePricingService.calculatePrice(0.9f, 500f, true),0.0);
    }

    @Test
    public void testRidePricingService15(){
        assertEquals(4010000, RidePricingService.calculatePrice(1f, 500f, true),0.0);
    }

    @Test
    public void testRidePricingService16(){
        assertEquals(4010000, RidePricingService.calculatePrice(1.1f, 500f, true),0.0);
    }

    @Test
    public void testRidePricingService17(){
        assertEquals(4010000, RidePricingService.calculatePrice(1.5f, 500f, true),0.0);
    }

    @Test
    public void testRidePricingService18(){
        assertEquals(4010000, RidePricingService.calculatePrice(1.9f, 500f, true),0.0);
    }

    @Test
    public void testRidePricingService19(){
        assertEquals(9020000, RidePricingService.calculatePrice(2f, 500f, true),0.0);
    }

    @Test
    public void testRidePricingService20(){
        assertEquals(-1, RidePricingService.calculatePrice(2.1f, 500f, true),0.0);
    }

    @Test
    public void testRidePricingService21(){
        assertEquals(-1, RidePricingService.calculatePrice(1.5f, -0.1f, true),0.0);
    }

    @Test
    public void testRidePricingService22(){
        assertEquals(26000, RidePricingService.calculatePrice(1.5f, 0f, true),0.0);
    }

    @Test
    public void testRidePricingService23(){
        assertEquals(26000, RidePricingService.calculatePrice(1.5f, 0.1f, true),0.0);
    }

    @Test
    public void testRidePricingService24(){
        assertEquals(8009200, RidePricingService.calculatePrice(1.5f, 999.9f, true),1);
    }

    @Test
    public void testRidePricingService25(){
        assertEquals(8010000, RidePricingService.calculatePrice(1.5f, 1000f, true),0.0);
    }

    @Test
    public void testRidePricingService26(){
        assertEquals(-1, RidePricingService.calculatePrice(1.5f, 1000.1f, true),0.0);
    }
}
