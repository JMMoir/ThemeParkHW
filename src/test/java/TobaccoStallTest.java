import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TobaccoStallTest {

    private TobaccoStall tobaccoStall;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before

    public void setUp() {
        tobaccoStall = new TobaccoStall("Smokey Joe", "John", "B12", 5);
        visitor1 = new Visitor(18, 150, 20);
        visitor2 = new Visitor(10, 150, 20);
    }

    @Test
    public void isOldEnough() {
        assertTrue(tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void isNotOldEnough() {
        assertFalse(tobaccoStall.isAllowedTo(visitor2));
    }
}

