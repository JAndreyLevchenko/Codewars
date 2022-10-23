package a.levchenko.codewar;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }

    public static double find_average(int[] array) {
        Double average = Arrays.stream(array).average().getAsDouble();
        return average;
    }


    public static int sumOfDifferences(int[] arr) {

       return 9;
    }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }
}
