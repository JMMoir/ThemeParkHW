import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    private IceCreamStall iceCreamStall;

    @Before

    public void setUp() {
        iceCreamStall = new IceCreamStall("Ice Cream", "John", "A45", 4);
    }

    @Test
    public void canGetName() {
        assertEquals("Ice Cream", iceCreamStall.getName());
    }

    @Test
    public void canGetOwnersName() {
        assertEquals("John", iceCreamStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals("A45", iceCreamStall.getParkingSpot());
    }

    @Test
    public void canGetRating() {
        assertEquals(4, iceCreamStall.getRating());
    }
}
