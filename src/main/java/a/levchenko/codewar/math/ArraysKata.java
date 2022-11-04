package a.levchenko.codewar.math;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysKata {

    /**
     * @see <a href="https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e"></a>
     * Your task is to sum the differences between consecutive pairs in the array in descending order.
     * <p>
     * Example
     * [2, 1, 10]  -->  9
     * <p>
     * In descending order: [10, 2, 1]
     * <p>
     * Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9
     * If the array is empty or the array has only one element the result should be 0
     */
    public int sumOfDifferences(int[] arr) {
        return 9;
    }

    /**
     * @see <a href="https://www.codewars.com/kata/53dc54212259ed3d4f00071c"></a>
     * Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0.
     * <p>
     * Examples
     * Input: [1, 5.2, 4, 0, -1]
     * Output: 9.2
     * <p>
     * Input: []
     * Output: 0
     * <p>
     * Input: [-2.398]
     * Output: -2.398
     * <p>
     * Assumptions
     * You can assume that you are only given numbers.
     * You cannot assume the size of the array.
     * You can assume that you do get an array and if the array is empty, return 0.
     * Tests expect accuracy of 1e-4.
     * <p>
     * What We're Testing
     * We're testing basic loops and math operations. This is for beginners who are just learning loops and math operations.
     * Advanced users may find this extremely easy and can easily write this in one line.
     */
    public double sum(double[] numbers) {

        return Arrays.stream(numbers).sum();


    }


    /**
     * @see <a href="https://www.codewars.com/kata/57f781872e3d8ca2a000007e"></a>
     * Given an array of integers, return a new array with each value doubled.
     * <p>
     * For example:
     * <p>
     * [1, 2, 3] --> [2, 4, 6]
     */
    public void map() {
        Scanner scanner = new Scanner(System.in);       //Тут ты создал обьект типа сканер
        int[] noviyMasiv = new int[3];                  //Тут ты создал масив и обьявил что длина этого масива 3 элемента
        for (int i = 0; i <= noviyMasiv.length; i++) {  //Тут ты создал цыкл который будет выполнен 3 раза
            System.out.println("Vvedite chislo: ");     //Тут ты выводишь на экран строку Vvedite chislo
            int novoeChisloVmasiv= scanner.nextInt();   //Тут ты создаёшь новую переменную типа Int и присваиваешь ей значение, которое получаешь из сканера клавиатуры
            noviyMasiv[i] = novoeChisloVmasiv * 2;      //Тут ты засовываешь в масив новое число умноженое на два
        }
        for (int i = 0; i <= noviyMasiv.length; i++) {
            System.out.println(noviyMasiv[i]);          //Тут ты пробегаешь по масиву и выводишь все элементы
        }
    }

    public int[] map(int[] masiv) {
        for (int i = 0; i < masiv.length; i++) {
            int chisloIzMasiva= masiv[i];
            masiv[i] = chisloIzMasiva * 2;
        }
        return masiv;
    }

    /**
     * @see <a href="https://www.codewars.com/kata/54edbc7200b811e956000556"></a>
     * Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).
     * <p>
     * For example,
     * [true,  true,  true,  false,
     * true,  true,  true,  true ,
     * true,  false, true,  false,
     * true,  false, false, true ,
     * true,  true,  true,  true ,
     * false, false, true,  true]
     * The correct answer would be 17.
     * Hint: Don't forget to check for bad values like null/undefined
     */

    public int countSheeps(Boolean[] arrayOfSheeps) {
        return 0;
    }


    /**
     * @see <a href="https://www.codewars.com/kata/576bb71bbbcf0951d5000044"></a>
     * Given an array of integers.
     * Return an array, where the first element is the count of positives numbers and the second element
     * is sum of negative numbers. 0 is neither positive nor negative.
     * If the input is an empty array or is null, return an empty array.
     * <p>
     * Example
     * For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
     */
    public int[] countPositivesSumNegatives(int[] input) {
        return null; //return an array with count of positives and sum of negatives
    }


    /**
     * @see <a href="https://www.codewars.com/kata/58f8a3a27a5c28d92e000144"></a>
     * Your task is to find the first element of an array that is not consecutive.
     * <p>
     * By not consecutive we mean not exactly 1 larger than the previous element of the array.
     * <p>
     * E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are all consecutive but 6 is not,
     * so that's the first non-consecutive number.
     * <p>
     * If the whole array is consecutive then return null.
     * The array will always have at least 2 elements1 and all elements will be numbers.
     * The numbers will also all be unique and in ascending order.
     * The numbers could be positive or negative and the first non-consecutive could be either too!
     * <p>
     * Can you write a solution that will return null for both [] and [ x ] though?
     * (This is an empty array and one with a single number and is not tested for,
     * but you can write your own example test. )
     */
    public Integer firstNonConsecutiveNumber(final int[] array) {
        return null;
    }


    /**
     * @see <a href="https://www.codewars.com/kata/57d814e4950d8489720008db"></a>
     * This kata is from check py.checkio.org
     * <p>
     * You are given an array with positive numbers and a non-negative number N.
     * You should find the N-th power of the element in the array with the index N.
     * If N is outside of the array, then return -1. Don't forget that the first element has the index 0.
     * <p>
     * Let's look at a few examples:
     * <p>
     * array = [1, 2, 3, 4] and N = 2, then the result is 3^2 == 9;
     * array = [1, 2, 3] and N = 3, but N is outside of the array, so the result is -1.
     */
    public int nthPower(int[] array, int n) {
        return 0;
    }
}
