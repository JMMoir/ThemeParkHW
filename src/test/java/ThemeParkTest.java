import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThemeParkTest {

    private ThemePark themePark;

    @Before

    public void setUp() {
        themePark = new ThemePark();
    }

    @Test
    public void hasReviews() {
        TobaccoStall tobaccoStall = new TobaccoStall("smoke", "John", "A12", 5 );
        themePark.addReviewed(tobaccoStall);
        assertEquals(1,themePark.getAllReviewed().size());
    }
}
