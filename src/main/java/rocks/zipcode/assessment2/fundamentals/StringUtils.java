package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding  - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        StringBuilder sb = new StringBuilder();
        while (sb.length() < amountOfPadding - stringToBePadded.length()){
            sb.append(' ');
        }
        sb.append(stringToBePadded);

        return sb.toString();
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding  - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0;i<amountOfPadding;i++){
            sb.append(' ');
        }

        return stringToBePadded+sb.substring(stringToBePadded.length());

    }

    /**
     * @param stringToBeRepeated   - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String retStr = "";
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            retStr += stringToBeRepeated;
        }
        return retStr;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        Boolean flag = false;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isAlphabetic(string.charAt(i))) {
                flag = true;
            }
            else
                flag = false;
        }
            return  flag;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        return string.matches("-?\\d+(\\.\\d+)?");

//        Boolean flag = false;
//        for (int i = 0; i < string.length(); i++) {
//            if (!Character.isAlphabetic(string.charAt(i))||!Character.isSpaceChar(string.charAt(i))) {
//                flag = true;
//            }
//            else
//                flag = false;
//        }
//        return  flag;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        Boolean flag = false;
        for (int i =0;i<string.length();i++){
           flag = isSpecialCharacter(string.charAt(i));
        }
        return flag;
    }

    public static boolean isSpecialCharacter(Character c){
        return  c!= 32 &&
                (c < 48 || c>57) &&
                (c<65 || c>90) &&
                (c<97 || c>122);
    }

}
