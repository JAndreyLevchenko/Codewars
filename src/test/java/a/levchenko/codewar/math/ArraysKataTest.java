package a.levchenko.codewar.math;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArraysKataTest {

    ArraysKata arraysKata = new ArraysKata();

    @Test
    public void sumOfDifferencesTest() {
        assertEquals(9, arraysKata.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, arraysKata.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, arraysKata.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, arraysKata.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, arraysKata.sumOfDifferences(new int[0]));
        assertEquals(0, arraysKata.sumOfDifferences(new int[]{0}));
        assertEquals(0, arraysKata.sumOfDifferences(new int[]{-1}));
        assertEquals(0, arraysKata.sumOfDifferences(new int[]{1}));
    }

    @Test
    public void sumTest() {
        final double DELTA = 1e-4;
        assertEquals(0, arraysKata.sum(new double[]{}), DELTA);
        assertEquals(-2.398, arraysKata.sum(new double[]{-2.398}), DELTA);
        assertEquals(6, arraysKata.sum(new double[]{1, 2, 3}), DELTA);
        assertEquals(6.6, arraysKata.sum(new double[]{1.1, 2.2, 3.3}), DELTA);
        assertEquals(9.2, arraysKata.sum(new double[]{1, 5.2, 4, 0, -1}), DELTA);
        assertEquals(320, arraysKata.sum(new double[]{30, 89, 100, 101}), DELTA);
    }

    @Test
    public void mapTest() {
        assertArrayEquals(new int[]{2, 4, 6}, arraysKata.map(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{8, 2, 2, 2, 8}, arraysKata.map(new int[]{4, 1, 1, 1, 4}));
        assertArrayEquals(new int[]{2, 2, 2, 2, 2, 2}, arraysKata.map(new int[]{1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void testCountSheepsTest() {
        Boolean[] array1 = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};

        assertEquals("There are 17 sheeps in total", 17, arraysKata.countSheeps(array1));
    }

    @Test
    public void countPositivesSumNegativesTest() {
        int[] expectedResult1 = new int[]{10, -65};
        int[] expectedResult2 = new int[]{8, -50};

        assertArrayEquals(expectedResult1, arraysKata.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
        assertArrayEquals(expectedResult2, arraysKata.countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}));
    }

    @Test
    public void firstNonConsecutiveNumberTest() {
        assertEquals(Integer.valueOf(6), arraysKata.firstNonConsecutiveNumber(new int[]{1, 2, 3, 4, 6, 7, 8}));
        assertEquals(null, arraysKata.firstNonConsecutiveNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(Integer.valueOf(6), arraysKata.firstNonConsecutiveNumber(new int[]{4, 6, 7, 8, 9, 11}));
        assertEquals(Integer.valueOf(11), arraysKata.firstNonConsecutiveNumber(new int[]{4, 5, 6, 7, 8, 9, 11}));
        assertEquals(null, arraysKata.firstNonConsecutiveNumber(new int[]{31, 32}));
        assertEquals(Integer.valueOf(0), arraysKata.firstNonConsecutiveNumber(new int[]{-3, -2, 0, 1}));
        assertEquals(Integer.valueOf(-1), arraysKata.firstNonConsecutiveNumber(new int[]{-5, -4, -3, -1}));
    }

    @Test
    public void nthPowerTest() {
        assertEquals(-1, arraysKata.nthPower(new int[]{1, 2}, 2));
        assertEquals(8, arraysKata.nthPower(new int[]{3, 1, 2, 2}, 3));
        assertEquals(4, arraysKata.nthPower(new int[]{3, 1, 2}, 2));
    }
}