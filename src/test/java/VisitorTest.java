import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor;

    @Before

    public void setUp() {
        visitor = new Visitor(31, 182, 30);
    }

    @Test
    public void canGetAge() {
        assertEquals(31, visitor.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(182, visitor.getHeight());
    }

    @Test
    public void canGetMoney() {
        assertEquals(30, visitor.getMoney());
    }
}
