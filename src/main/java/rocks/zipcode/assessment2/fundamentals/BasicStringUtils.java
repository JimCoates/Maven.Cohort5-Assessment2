package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        String answer = "";
        answer += string1;
        answer += string2;
        return answer;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String answer = "";
        for (int i = string1.length()-1; i >= 0 ; i--) {
            answer += string1.charAt(i);
        }
        return answer;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String answer = "";
        String string1rev = reverse(string1);
        String string2rev = reverse(string2);

        answer += concatentate(string1rev,string2rev);
        return answer;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        char[] removal = charactersToRemove.toCharArray();
        StringBuilder input = new StringBuilder(string);

        for (int i = 0; i < charactersToRemove.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if(input.charAt(j) == removal[i]){
                    input.deleteCharAt(j);
                }
            }
        }
        return input.toString();
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String temp = removeCharacters(string,charactersToRemove);
        return reverse(temp);

    }
}
