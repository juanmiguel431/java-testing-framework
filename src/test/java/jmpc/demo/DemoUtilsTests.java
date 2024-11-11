package jmpc.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DemoUtilsTests {

    private DemoUtils demoUtils;

    @BeforeEach
    public void setup() {
        demoUtils = new DemoUtils();
    }

    @Test
    public void testEqualsAndNotEquals() {

        Assertions.assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
    }

    @Test
    public void testNotNull() {

        Assertions.assertNotNull(demoUtils.checkNull(5));
    }

}
