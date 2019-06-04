import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    private Park park;

    @Before

    public void setUp() {
        park = new Park("Park", 3);
    }

    @Test
    public void getParkName() {
        assertEquals("Park", park.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(3, park.getRating());
    }
}


