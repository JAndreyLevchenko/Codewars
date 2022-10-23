package a.levchenko.codewar.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathematicsKataTest {
    MathematicsKata mathematicsKata = new MathematicsKata();

    @Test
    public void testGetVolumeOfCuboidTest() {
        assertEquals(1000.0d, mathematicsKata.getVolumeOfCuboid(10.0d, 10.0d, 10.0d), 0.0);
        assertEquals(50.0d, mathematicsKata.getVolumeOfCuboid(0.5d, 10.0d, 10.0d), 0.0);
        assertEquals(-50.0d, mathematicsKata.getVolumeOfCuboid(-0.5d, 10.0d, 10.0d), 0.0);
        assertEquals(Double.NaN, mathematicsKata.getVolumeOfCuboid(Double.NaN, 10.0d, 10.0d), 0.0);
    }

    @Test
    public void findAverageTest() {
        final double DELTA = 1e-15;
        final double delta = 0.0001;
        assertEquals(1, mathematicsKata.findAverage(new int[]{1, 1, 1}), DELTA);
        assertEquals(2, mathematicsKata.findAverage(new int[]{1, 2, 3}), DELTA);
    }

    @Test
    public void pythagoreanTripleTests() {
        int[] p1 = {3, 4, 5};
        int[] p2 = {3, 5, 7};

        //validTriple
        assertEquals(1, mathematicsKata.pythagoreanTriple(p1));
        //invalidTriple
        assertEquals(0, mathematicsKata.pythagoreanTriple(p2));
    }

    @Test
    public void dutyFreeTests() {
        assertEquals(166, mathematicsKata.dutyFree(12, 50, 1000));
        assertEquals(294, mathematicsKata.dutyFree(17, 10, 500));
        assertEquals(357, mathematicsKata.dutyFree(24, 35, 3000));
        assertEquals(20, mathematicsKata.dutyFree(1400, 35, 10000));
        assertEquals(38, mathematicsKata.dutyFree(700, 26, 7000));
    }


    @Test
    public void quarterOfTests() {
        assertEquals(3, mathematicsKata.quarterOf(1));
        assertEquals(8, mathematicsKata.quarterOf(3));
        assertEquals(11, mathematicsKata.quarterOf(4));
    }

    @Test
    public void checkForFactorTests() {
        assertEquals(true, mathematicsKata.checkForFactor(10, 2));
        assertEquals(true, mathematicsKata.checkForFactor(63, 7));
        assertEquals(true, mathematicsKata.checkForFactor(2450, 5));
        assertEquals(true, mathematicsKata.checkForFactor(24612, 3));
    }

    @Test
    public void oddCountTests() {
        assertEquals(7, mathematicsKata.oddCount(15));
        assertEquals(7511, mathematicsKata.oddCount(15023));
    }
}
