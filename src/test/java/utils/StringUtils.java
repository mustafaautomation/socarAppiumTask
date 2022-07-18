package utils;

public class StringUtils {

    public String getFirstWordFromString(final String s) {
        String firstWord = null;

        if (s.contains(" ")) {
            firstWord = s.substring(0, s.indexOf(" "));
        } else {
            firstWord = s;
        }
        return firstWord;
    }

    public String getLastWordFromString(final String s) {
        final String lastWord = s.substring(s.lastIndexOf(" ") + 1);

        return lastWord;
    }



}