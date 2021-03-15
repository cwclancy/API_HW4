package HW4;

import java.util.Comparator;

/**
* The class {@code Collater} allows users to compare strings using a collation ordering
* appropriate for the current locale.
* <p>
*
* In some locales, the conventions for lexicographic ordering differ from the strict
* numeric ordering of character codes. For example, in Spanish most glyphs with diacritical
* marks such as accents are not considered distinct letters for the purposes of collation.
* On the other hand, the two-character sequence ‘ll’ is treated as a single letter that is
* collated immediately after ‘l’.
* <p>
*
* The way these functions work is by applying a mapping to transform the characters in a
* string to a string that represents the string’s position in the collating
* sequence of the current locale. Comparing two such strings in a simple fashion is
* equivalent to comparing the strings with the locale’s collating sequence.
*
* <p>
* The locale used by these functions in particular can be specified by setting the locale
* when constructing the Collater.
* We use Java's built-in class {@code Locale}'s static filed to define enum type {@code LOCALE}
*  <a href="https://docs.oracle.com/cd/E23824_01/html/E26033/glmbx.html">See definition here</a>.
*
* <p>
*
* There are two methods in Collater interface, {@code compare} and {@code transform}.
* {@code compare} implicitly casts the passed in strings and then does the comparison.
* By contrast, {@code transform} does the mapping explicitly, explicitly returning the transformed string.
*
* <p>
*
* To simply sort an array of strings {@code frenchWords} using the french locale, all you need to do is
* <blockquote><pre>
* Arrays.sort(frenchWords, new Collater(LOCALE.fr_FR));
* </pre></blockquote>
*
* <p>
* 
* When done like this each word is transformed in every comparison. This can become inefficient if
* many comparisons are done. In that case you will want to first tranform the words using {@code transform},
* and then the default string comparison. For example to sort the same array of {@code frenchWords}
* <blockquote><pre>
*   Collater c = new Collater(LOCALE.fr_FR);
    String[] frenchWords = new String[4];
    for (int i=0; i {@code <frenchWords.length;} i++) {
        frenchWords[i] = c.transform(frenchWords[i]);
    }
    Arrays.sort(frenchWords); 
* </pre></blockquote>
*/
public class Collater implements Comparator<String> {
    /**
     * Available locales for the Collater to tranform and compare strings.
     */
    public enum LOCALE{ en_US, fr_FR, zh_CN};
 
    /**
     * Create a {@code Collater} object with the given {@code locale}. For example, this class
     * is simply instantiated with the french locale as follows:
     * 
     * <blockquote><pre>
     * Collater collater = new Collater(LOCALE.fr_FR);
     * </pre></blockquote>
     */
    Collater(LOCALE locale) {}

    /**
     * Returns the locale the Collater object is using.
     * @return the locale the Collater object is using.
     */
    public LOCALE locale() {return LOCALE.en_US;}
 
    /**
     * Transfer the input string using collation transformation determined by current locale
     * setting for multiple time comparing purpose.
     * @param source the string need to be transferred.
     * @return The transferred string.
     */
     public String transform (String source) {return "";}

    /**
     * Compares the strings {@code s1} and {@code s2}. These strings are compared using the locale
     * returned by {@code locale}. The strings are implicity cast into the locale returned
     * by {@code locale} and then compared. If you plan on comparing the strings many times, 
     * to improve efficiency, transform the strings using {@code transform} and then use
     * the default java string comparison.
     * @param s1 first string to be compared
     * @param s2 second string to be compared
     * @return a negative value if s1 {@literal <} s2, 0 if the strings are equal, and a positive
     * value of s1 {@literal >} s2.
     */
    @Override
    public int compare(String s1, String s2) {
        return 0;
    };
 } 