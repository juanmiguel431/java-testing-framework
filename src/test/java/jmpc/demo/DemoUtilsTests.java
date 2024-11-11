package jmpc.demo;

import org.junit.jupiter.api.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class DemoUtilsTests {

    private DemoUtils demoUtils;

    @BeforeEach
    public void setup() {
        System.out.println("@BeforeEach method executed.");
        demoUtils = new DemoUtils();
    }

    @AfterEach
    public void cleanUp() {
        System.out.println("@AfterEach method executed.");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("@BeforeAll method executed.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("@AfterAll method executed.");
    }

    @Test
    @DisplayName("Equals and Not Equals")
    public void testEqualsAndNotEquals() {

        Assertions.assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
    }

    @Test
//    @DisplayName("Null and Not Null")
    public void test_null_and_not_null() {

        Assertions.assertNotNull(demoUtils.checkNull(5));
        Assertions.assertNull(demoUtils.checkNull(null));
    }

}
