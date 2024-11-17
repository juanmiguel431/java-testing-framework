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

    @Test
    @DisplayName("Same and Not Same - String literals")
    public void testSameAndNotSameV1() {

        // Both values will reference the same objet.
        var firstName1 = "Juan";
        var firstName2 = "Juan";

        var lastName1 = new String("Paulino");
        var lastName2 = new String("Paulino");

        Assertions.assertSame(firstName1, firstName2, "Objects should refer to the same objects");
        Assertions.assertNotSame(5, 6, "Values must be different.");
    }

    @Test
    @DisplayName("Same and Not Same - String objets")
    public void testSameAndNotSameV2() {
        var lastName1 = new String("Paulino");
        var lastName2 = new String("Paulino");

        Assertions.assertNotSame(lastName1, lastName2, "Values must be different.");
    }
}
