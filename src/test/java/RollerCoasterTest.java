import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RollerCoasterTest {

    private RollerCoaster rollerCoaster;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Coaster", 6);
        visitor1 = new Visitor(16, 150, 20);
        visitor2 = new Visitor(10, 150, 20);
    }

    @Test
    public void isAllowed() {
        assertTrue(rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void isNotAllowed() {
        assertFalse(rollerCoaster.isAllowedTo(visitor2));
    }
}
