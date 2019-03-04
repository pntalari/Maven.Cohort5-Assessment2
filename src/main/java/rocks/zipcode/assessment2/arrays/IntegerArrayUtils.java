package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray   - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer index = integerArray.length;
        Integer[] retArr = Arrays.copyOf(integerArray, index + 1);

        retArr[retArr.length - 1] = valueToBeAdded;

        return retArr;
    }

    /**
     * @param integerArray      - array to be manipulated
     * @param indexToInsertAt   - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < integerArray.length; i++) {
            if (i != indexToInsertAt) {
                list.add(integerArray[i]);
            } else {
                list.add(valueToBeInserted);
            }
        }

        return list.toArray(integerArray);
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        Integer[] retArr = new Integer[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {
                Integer val = integerArray[i];
                retArr[i] = val + 1;
            } else {
                Integer val = integerArray[i];
                retArr[i] = val - 1;
            }
        }

        return retArr;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        Integer[] retArr = new Integer[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {
                Integer val = integerArray[i];
                retArr[i] = val + 1;
            }
            else{
                retArr[i] = integerArray[i];
            }
        }
        return retArr;

    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        Integer[] retArr = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 != 0) {
                Integer val = input[i];
                retArr[i] = val - 1;
            }
            else{
                retArr[i] = input[i];
            }
        }
        return retArr;
    }
}
