import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Kiểm thử với độ phủ all-uses - KT dòng d liệu
public class AllUsesTest {
    @Test
    public void testRidePricingService1(){
        assertEquals(-1, RidePricingService.calculatePrice(0f, 3f, true),0.0);
    }

    @Test
    public void testRidePricingService2(){
        assertEquals(13000, RidePricingService.calculatePrice(1f, 1f, false),0.0);
    }

    @Test
    public void testRidePricingService3(){
        assertEquals(28000, RidePricingService.calculatePrice(2f, 1f, false),0.0);
    }

    @Test
    public void testRidePricingService4(){
        assertEquals(-1, RidePricingService.calculatePrice(1f, -1f, true),0.0);
    }

    @Test
    public void testRidePricingService5(){
        assertEquals(17000, RidePricingService.calculatePrice(1f, 3f, false),0.0);
    }

    @Test
    public void testRidePricingService6(){
        assertEquals(34000, RidePricingService.calculatePrice(1f, 3f, true),0.0);
    }

    @Test
    public void testRidePricingService7(){
        assertEquals(37000, RidePricingService.calculatePrice(2f, 3f, false),0.0);
    }

    @Test
    public void testRidePricingService8(){
        assertEquals(56000, RidePricingService.calculatePrice(2f, 1f, true),0.0);
    }
}

