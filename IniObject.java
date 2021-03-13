package HW4;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.security.KeyException;
import java.util.ArrayList;

/**
 * An {@code IniObject} is a sectioned collection of key/value pairs. Specifically this class
 * is meant to work with .ini files and handles key/value mappings of the types supported by these files: {@code string}, 
 * {@code int}, {@code long}, {@code double}, and {@code boolean}. A common use case of this class is to
 * create .ini files from key value pairs, or to simply load and query .ini files - like you might a JSON file.
 * 
 * An .ini file maps entries to values. The entries are of the form "section" or "section:key". {@code IniParser} provides
 * {@code get}ing methods to the values of entries. Each get method is overloaded to take either the entry string as "section"
 * or "section:key", or to take the section and key separately. The get methods throw a runtime {@code IniException} if
 * the entry does not exist.
 * 
 * To <b>load a .ini file</b> simply TODO: add loading example
 * 
 * <b>Values can be added or removed</b> from the {@code IniObject} using the {@code put} and {@code remove} methods
 * respectively. For example:
 * 
 * To <b>dump the contents</b> of an {@code IniObject} into a .ini file, simply: TODO: add dump example
 * 
 * 
 */
public class IniObject {
    /**
     * Returns the name of the nth section of the {@code IniObject}. Sections are ordered by when they
     * are added to the {@code IniObject} by {@code put}, or the order they appear in loaded from a .ini file.
     * @param n The index of the section in order.
     * @return The nth section's name.
     * @throws IndexOutOfBoundsException Throws if there are less than n sections.
     */
    public String getNthSectionName(int n) throws IndexOutOfBoundsException {return "";}
    /**
     * Returns a list of the names of the sections in the {@code IniObject}. 
     * @return A list of the names of the sections in the {@code IniObject}.
     */
    public ArrayList<String> sections() {return new ArrayList<>();}
    /**
     * Puts a section:key to val mapping in the {@code IniObject}. Put either overwrites the current value stored at
     * the entry, or creates a new entry and stores the value. Only 
     * strings, ints, longs, doubles, and booleans can be added.
     * 
     * @param section The section for val
     * @param key The key for val
     * @param val The value to store in the {@code IniObject}
     * @return {@code this}
     * @throws IniException throws if the type of val is not an allowed type.
     */
    public IniObject put(String section, String key, Object val) throws IniException {return new IniObject();}
    /**
     * Removes the section:key entry from the {@code IniObject} if it exists. 
     * @param section The section of the entry to remove
     * @param key The key of the entry to remove
     * @return The object at section:key that was removed, or null
     */
    public Object remove(String section, String key) {return new IniObject();} //TODO: maybe add invalid key exception
    /**
     * Writes the contents of the {@code IniObject} in a loadable ini format.
     * 
     * // TODO: add example
     * 
     * <b>Warning: This method assumes the data structure is acyclical</b>
     * @param writer the writer object
     * @return the writer
     * @throws IniException if an error occurs while writing
     */
    public Writer write(Writer writer) throws IniException {return new BufferedWriter(new OutputStreamWriter(System.out));}
    /**
     * Writes the contents of a section of the {@code IniObject} in a loadable ini format.
     * 
     * // TODO: add example
     * 
     * <b>Warning: This method assumes the data structure is acyclical</b>
     * @param writer the writer object
     * @param section the section we wish to write
     * @return the writer
     * @throws IniException
     */
    public Writer write(Writer writer, String section) throws IniException {return new BufferedWriter(new OutputStreamWriter(System.out));}
    /**
     * Writes the contents of the {@code IniObject} line by line. This method is commonly used
     * for debugging
     * 
     * // TODO: add example
     * 
     * @param writer
     * @param shouldWriteLineByLineContents
     * @return
     * @throws IniException
     */
    public Writer writeLines(Writer writer) throws IniException {return new BufferedWriter(new OutputStreamWriter(System.out));}
    /**
     * Returns an array list of the keys in a given section if the section exists. For example
     * if a section had entries {@code "car:mazda", "car:toyota", "car:ford"}, then calling {@code keyForSection("car")}
     * would return {@code ["mazda", "toyota", "ford"]}.
     * @param section the section whose keys to return
     * @return A list of the keys in a section. 
     */
    public ArrayList<String> keysForSection(String section) {return new ArrayList<>();}
    /**
     * Returns the string stored at the entry "section:key". 
     * 
     * @param section
     * @param key
     * @return the string value of the entry "section:key".
     * @throws ClassCastException if the entry at "section:key" cannot be cast as a string.
     * @throws KeyException if "section:key" does not exist in the {@code IniObject}.
     */
    public String getString(String section, String key) throws KeyException, ClassCastException  {return "";}
    /**
     * Returns the int stored at the entry "section:key". 
     * 
     * @param section
     * @param key
     * @return the int value of the entry "section:key".
     * @throws ClassCastException if the entry at "section:key" cannot be cast as an int.
     * @throws KeyException if "section:key" does not exist in the {@code IniObject}.
     */
    public int getInt(String section, String key) throws KeyException, ClassCastException {return 0;} // TODO: possibly overload with entries
    /**
     * Returns the long stored at the entry "section:key". 
     * 
     * @param section
     * @param key
     * @return the long value of the entry "section:key".
     * @throws ClassCastException if the entry at "section:key" cannot be cast as a long.
     * @throws KeyException if "section:key" does not exist in the {@code IniObject}.
     */
    public long getLong(String section, String key) throws KeyException, ClassCastException {return 0;}
    /**
     * Returns the double stored at the entry "section:key". 
     * 
     * @param section
     * @param key
     * @return the double value of the entry "section:key".
     * @throws ClassCastException if the entry at "section:key" cannot be cast as a double.
     * @throws KeyException if "section:key" does not exist in the {@code IniObject}.
     */
    public double getDouble(String section, String key) throws KeyException, ClassCastException {return 0;}
    /**
     * Returns the boolean stored at the entry "section:key". 
     * 
     * @param section
     * @param key
     * @return the boolean value of the entry "section:key".
     * @throws ClassCastException if the entry at "section:key" cannot be cast as a boolean.
     * @throws KeyException if "section:key" does not exist in the {@code IniObject}.
     */
    public boolean getBoolean(String section, String key) throws KeyException, ClassCastException {return true;}
    /**
     * Returns true if the entry exists in the {@code IniObject}. An entry maps to an optional value.
     * Entries are of the form "section" or "section:key".
     * @param entry The entry to check if exists in the {@code IniObject}.
     * @return {@code true} if the entry is in the {@code IniObject} and {@code false} otherwise.
     */
    public boolean hasEntry(String entry) {return true;}
    /**
     * Creates an empty {@code IniObject} with no entry value mappings. The class
     * is simply instanitated
     * <blockquote><pre>
     * ini = new IniObject();
     * </pre></blockquote>
     */
    public IniObject() {}
    /**
     * Creates an {@code IniObject} with the entry value mappings of the .ini file {@code iniFile}.
     * This class is simply instantiated
     * 
     * <blockquote><pre>
     * ini = new IniObject(new File("./config.ini"));
     * </pre></blockquote>
     * 
     * @param iniFilePath Path to the .ini file you wish to load.
     * @throws IOException if the {@code iniFilePath} is malformed or the wrong extension.
     */
    public IniObject(File iniFilePath) throws IOException {} 
}
