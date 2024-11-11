package jmpc.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoUtilsTests {

    @Test
    public void testEqualsAndNotEquals() {
        var demoUtils = new DemoUtils();

        Assertions.assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
    }


}
