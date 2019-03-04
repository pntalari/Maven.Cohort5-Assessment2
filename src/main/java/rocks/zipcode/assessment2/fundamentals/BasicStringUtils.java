package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String retStr = "";
        for (int i = string1.length() - 1; i >= 0; i--) {
            retStr += string1.charAt(i);
        }
        return retStr;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String retStr1 = reverse(string1);
        String retStr2 = reverse(string2);

        return retStr1 + retStr2;
    }

    /**
     * @param string             - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        StringBuilder str = new StringBuilder(string);
        String temp = removeFunction(str, charactersToRemove);
        StringBuilder temp1   = new StringBuilder(temp);

        if(temp.contains(charactersToRemove)) {
          return removeFunction(temp1, charactersToRemove);
        }
        else
        {
            return temp;
        }

    }

    public static String removeFunction(StringBuilder sbr, String charactersToRemove) {
        Integer index = 0;
        for (int i = 0; i < charactersToRemove.length(); i++) {
            index = sbr.indexOf(Character.toString(charactersToRemove.charAt(i)));
            sbr.deleteCharAt(index);
        }
        return sbr.toString();
    }

    /**
     * @param string             - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String reversed = reverse(string);
        String retStr = "";
        return retStr;
    }
}
