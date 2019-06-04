import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlayGroundTest {

    private PlayGround playGround;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before

    public void setUp() {
        playGround = new PlayGround("PlayGround");
        visitor1 = new Visitor(16, 150, 20);
        visitor2 = new Visitor(10, 150, 20);

    }

    @Test
    public void isOldEnough () {
        assertTrue(playGround.isAllowedTo(visitor1));
    }

    @Test
    public void isNotOldEnough() {
        assertFalse(playGround.isAllowedTo(visitor2));
    }
}
