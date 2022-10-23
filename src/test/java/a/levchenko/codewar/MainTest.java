package a.levchenko.codewar;

import jdk.jfr.Description;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    private static final double DELTA = 1e-15;
    private static final double delta = 0.0001;

    @Test
    public void find_average() {
        assertEquals(1, Main.find_average(new int[]{1,1,1}), DELTA);
        assertEquals(2, Main.find_average(new int[]{1, 2, 3}), DELTA);
    }



    @Test
    @Description("Sum of differences in array")
    public void basicTests() {
        assertEquals(9, Main.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, Main.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, Main.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, Main.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, Main.sumOfDifferences(new int[0]));
        assertEquals(0, Main.sumOfDifferences(new int[]{0}));
        assertEquals(0, Main.sumOfDifferences(new int[]{-1}));
        assertEquals(0, Main.sumOfDifferences(new int[]{1}));
    }

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(4, Main.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(63, Main.getVolumeOfCuboid(6.3, 2, 5), delta);
    }
}