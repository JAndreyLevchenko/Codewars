package a.levchenko.codewar.math;


import java.util.Arrays;

public class MathematicsKata {

    /**
     * @see <a href="https://www.codewars.com/kata/58261acb22be6e2ed800003a"></a>
     * Bob needs a fast way to calculate the volume of a cuboid with three values:
     * the length, width and height of the cuboid. Write a function to help Bob with this calculation.
     */
    public double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }

    /**
     * @see <a href="https://www.codewars.com/kata/57a2013acf1fa5bfc4000921"></a>
     * Write a function which calculates the average of the numbers in a given list.
     * Note: Empty arrays should return 0.
     */
    public double findAverage(int[] array) {
        Double average = Arrays.stream(array).average().getAsDouble();
        return average;
    }

    /**
     * @see <a href="https://www.codewars.com/kata/57e92e91b63b6cbac20001e5"></a>
     * Given an array of 3 non-negative integers a, b and c, determine if they form a pythagorean triple.
     * A pythagorean triple is formed when:
     * c2 = a2 + b2
     * where c is the largest value of a, b, c.
     * <p>
     * For example: a = 3, b = 4, c = 5 forms a pythagorean triple, because 52 = 32 + 42
     * <p>
     * Return Values
     * 1 if a, b and c form a pythagorean triple
     * 0 if a, b and c do not form a pythagorean triple
     */
    public int pythagoreanTriple(int[] triple) {
        //TODO: to solve this problem
        return 0;
    }


    /**
     * @see <a href="https://www.codewars.com/kata/57e92e91b63b6cbac20001e5"></a>
     * <p>
     * The purpose of this kata is to work out just how many bottles of duty free whiskey you would have to buy such that the saving over the normal high street price would effectively cover the cost of your holiday.
     * You will be given the high street price (normPrice), the duty free discount (discount) and the cost of the holiday.
     * <p>
     * For example, if a bottle cost £10 normally and the discount in duty free was 10%, you would save £1 per bottle.
     * If your holiday cost £500, the answer you should return would be 500.
     * All inputs will be integers. Please return an integer. Round down.
     */
    public int dutyFree(int normPrice, int discount, int hol) {
        //TODO: to solve this problem
        return 0;
    }

    /**
     * @see <a href="https://www.codewars.com/kata/5ce9c1000bab0b001134f5af"></a>
     * <p>
     * Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.
     * For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter;
     * and month 11 (November), is part of the fourth quarter.
     */
    public int quarterOf(int month) {
        //TODO: to solve this problem
        return 0;
    }


    /**
     *  @see <a href="https://www.codewars.com/kata/55cbc3586671f6aa070000fb"></a>
     * <p>
     * This function should test if the factor is a factor of base.
     * <p>
     * Return true if it is a factor or false if it is not.
     * <p>
     * About factors
     * Factors are numbers you can multiply together to get another number.
     * <p>
     * 2 and 3 are factors of 6 because: 2 * 3 = 6
     * <p>
     * You can find a factor by dividing numbers. If the remainder is 0 then the number is a factor.
     * You can use the mod operator (%) in most languages to check for a remainder
     * For example 2 is not a factor of 7 because: 7 % 2 = 1
     * <p>
     * Note: base is a non-negative number, factor is a positive number.
     * */
    public boolean checkForFactor(int base, int factor) {
        return false;
    }

    /**
     * @see <a href="https://www.codewars.com/kata/59342039eb450e39970000a6"></a>
     * Given a number n, return the number of positive odd numbers below n, EASY!
     * <p>
     * Examples (Input -> Output)
     * 7  -> 3 (because odd numbers below 7 are [1, 3, 5])
     * 15 -> 7 (because odd numbers below 15 are [1, 3, 5, 7, 9, 11, 13])
     * Expect large Inputs!
     * */
    public int oddCount(int n){
        return 0;
    }

}
