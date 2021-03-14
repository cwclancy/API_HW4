package HW4;

import java.util.Comparator;

/**
* The class {@code Collater} allows users to compare strings using a collation ordering
* appropriate for the current locale. Function the same as {@code RuleBasedCollator} class.
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
* multibyte string to a byte sequence that represents the string’s position in the collating
* sequence of the current locale. Comparing two such byte sequences in a simple fashion is
* equivalent to comparing the strings with the locale’s collating sequence.
*
* <p>
* The locale used by these functions in particular can be specified by setting the locale category
* {@code lc_locale}, which applies to collation of strings.
* By default the locale is initialized to user's current location inside the constructor.
* We use Java build-in class {@code Locale}'s static filed to define enum type {@LOCALE}
* See definition here.{@link https://docs.oracle.com/cd/E23824_01/html/E26033/glmbx.html}.
*
* <p>
*
* There are two methods in Collater interface, {@code stringCollate} and {@code stringTransform}.
* {@code stringCollate} do the mapping implicitly and is used to compare two strings directly.
* By contrast, {@code stringTransform} do the mapping explicitly, which is more efficiently when
* comparing the same string for several times.
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
* many comparisons are done. In that case you will want to first tranform the words using {@code stringTransform},
* and then the default string comparison. For example to sort the same array of {@code frenchWords}
* <blockquote><pre>
*   Collater c = new Collater(LOCALE.fr_FR);
    String[] frenchWords = new String[4];
    for (int i=0; i<frenchWords.length; i++) {
        frenchWords[i] = c.stringTransform(frenchWords[i]);
    }
    Arrays.sort(frenchWords); 
* </pre></blockquote>
*/
class Collater implements Comparator<String> {
    /* Enum for locale category. Here we just list some of them */
    enum LOCALE{ en_US, fr_FR, zh_CN};
 
    /*
     * Variable to store current lc_locale setting
     */
    static LOCALE lc_locale;
 
    /**
     * Constructor using to set the lc_locale to locale's value.
     * If argument locale is not specified, set lc_locale to current locale.
     */
    Collater(LOCALE locale) {}
    /* Set the lc_locale*/
    void setLcLocale(LOCALE locale) {}
    /* Get the lc_locale*/
    LOCALE getLcLocale() {return LOCALE.en_US;}
    /**
     * Compare two strings using collating sequence of the current locale {@code}lc_locale setting
     * for one time comparing purpose.
     * @param str1 string1
     * @param str2 string2
     * @return return -1 if string1 less then string2, return 0 is string1 equals to string2,
     * return 1 if string1 larger then string2.
     */
    int stringCollate(String str1, String str2) {return 1;}
 
    /**
     * Transfer the input string using collation transformation determined by current lc_locale
     * setting for multiple time comparing purpose.
     * @param source the string need to be transferred.
     * @return The transferred string.
     */
     String transform (String source) {return "";}

    /**
     * Compares the strings {@code s1} and {@code s2}. These strings are compared using the locale
     * returned by {@code getLcLocale}. The strings are implicity cast into the locale returned
     * by {@code getLcLocale} and then compared. If you plan on comparing the strings many times, 
     * to improve efficiency, transform the strings using {@code stringTransform} and then use
     * the default java string comparison.
     * @param s1 first string to be compared
     * @param s2 second string to be compared
     * @return a negative value if s1 < s2, 0 if the strings are equal, and a positive
     * value of s1 > s2.
     */
    @Override
    public int compare(String s1, String s2) {
        return 0;
    };
 } 