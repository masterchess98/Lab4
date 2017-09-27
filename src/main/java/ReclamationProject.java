/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * This thing does a thing to words.
 */
public class ReclamationProject {
    /**
     *
     * @param word1 first word being used
     * @param word2 second word being used
     * @return r
     */
    public static String doit(final String word1, final String word2) {
        String longWord = word1;
        String shortWord = word2;

        if (word1.length() > word2.length()) {
            String temp = longWord;
            longWord = shortWord;
            shortWord = temp;
            }
        String commonLetters = "";

        for (int i = 0; i < word1.length(); i++) {
            for (int j = word1.length() - i; j > 0; j--) {
                for (int k = 0; k < word2.length() - j; k++) {
                    if (word1.regionMatches(i, word2, k, j) && j > commonLetters.length()) {
                       commonLetters = word1.substring(i, i + j);
                    }
                }
            }
        }
        return commonLetters;
        }
}
