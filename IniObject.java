package HW4;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.security.KeyException;
import java.util.ArrayList;

/**
 * An {@code IniObject} is a sectioned collection of key/value pairs that simply interfaces with .ini files. Specifically this class
 * is meant to work with .ini files and handles key/value mappings of the types supported by these files: {@code string}, 
 * {@code int}, {@code long}, {@code double}, and {@code boolean}. A common use case of this class is to
 * create .ini files from key value pairs, or to simply load and query .ini files - like you might a JSON file.
 * <p>
 * An .ini file maps entries to values. The entries are of the form "section" or "section:key". {@code IniParser} provides
 * {@code get}ing methods for the values of entries. The get methods throw a runtime {@code IniException} if
 * the entry does not exist.
 * <p>
 * To <b>load a .ini file</b> simply 
 * <blockquote><pre>
 * IniObject ini = new IniObject(new File("test.ini"));
 * </pre></blockquote>
 * <p>
 * <b>Values can be added or removed</b> from the {@code IniObject} using the {@code put} and {@code remove} methods
 * respectively. For example:
 * <blockquote><pre>
 * ini.put("student", "connor", 42);
 * ini.put("student", "piper", 36);
 * ini.remove("student", "piper");
 * </pre></blockquote>
 * The resulting {@code IniObject} will only contain the mapping {@code "student:connor"} to {@code 42}.
 * <p>
 * To <b>dump the contents</b> of an {@code IniObject} into a .ini file, simply:
 * <blockquote><pre>
 *  try {
            ini.write(new FileWriter("out.ini"));
        } catch (IOException e) {
            System.out.println("file does not exist");
        } 
 * </pre></blockquote>
 * <p>
 * This class is mutable and <b>not thread safe</b>.
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
     * strings, ints, longs, doubles, and booleans can be added. <p>
     * 
     * For example, starting from an empty {@code IniObject}
     * <blockquote><pre>
     * IniObject ini = new IniObject();
     * ini.put("car", "ford", 1);
     * ini.put("car", "ford", 2);
     * </pre></blockquote> 
     * Calling {@code ini.getInt("car", "ford")} will return {@code 2}.
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
     * <p>
     * For example we can write to the file "out.ini"
     * <blockquote><pre>
     * ini.write(new FileWriter("out.ini"));
     * </pre></blockquote>
     * <p>
     * <b>Warning: This method assumes the data structure is acyclical</b>
     * @param writer the writer object
     * @return the writer
     * @throws IniException if an error occurs while writing
     */
    public Writer write(Writer writer) throws IniException {return writer;}
    /**
     * Writes the contents of a section of the {@code IniObject} in a loadable ini format.
     * <p>
     * For example we can write a section of the {@code IniObject} like
     * <blockquote><pre>
     * ini.write(new FileWriter("out.ini"), "car")
     * </pre></blockquote>
     * <p>
     * <b>Warning: This method assumes the data structure is acyclical</b>
     * @param writer the writer object
     * @param section the section we wish to write
     * @return the writer
     * @throws IniException if an error occurs while writing
     */
    public Writer write(Writer writer, String section) throws IniException {return new BufferedWriter(new OutputStreamWriter(System.out));}
    /**
     * Writes the contents of the {@code IniObject} line by line. This method is commonly used
     * for debugging
     * <p>
     * For example we can print the {@code IniObject} line by line in stdout like
     * <blockquote><pre>
     * ini.writeLines(new BufferedWriter(new OutputStreamWriter(System.out)));
     * </pre></blockquote>
     * <p>
     * @param writer the writer object
     * @return the writer
     * @throws IniException if an error occurs while writing
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
     * @param section the section of the entry
     * @param key the key of the entry
     * @return the string value of the entry "section:key".
     * @throws ClassCastException if the entry at "section:key" cannot be cast as a string.
     * @throws KeyException if "section:key" does not exist in the {@code IniObject}.
     */
    public String getString(String section, String key) throws KeyException, ClassCastException  {return "";}
    /**
     * Returns the int stored at the entry "section:key". 
     * 
     * Supported values for ints include
     * <ul>
     *  <li> "42" to 42
     *  <li> "042" to 34 (octal to decimal)
     *  <li> "0x42" to 66 (hexa to decimal)
     * </ul>
     * 
     * No guarantees are made on conversions that overflow.
     * 
     * @param section the section of the entry
     * @param key the key of the entry
     * @return the int value of the entry "section:key".
     * @throws ClassCastException if the entry at "section:key" cannot be cast as an int.
     * @throws KeyException if "section:key" does not exist in the {@code IniObject}.
     */
    public int getInt(String section, String key) throws KeyException, ClassCastException {return 0;} // TODO: possibly overload with entries
    /**
     * Returns the long stored at the entry "section:key". 
     * 
     * Supported values for longs include
     * <ul>
     *  <li> "42" to 42
     *  <li> "042" to 34 (octal to decimal)
     *  <li> "0x42" to 66 (hexa to decimal)
     * </ul>
     * 
     * No guarantees are made on conversions that overflow.
     * 
     * @param section the section of the entry
     * @param key the key of the entry
     * @return the long value of the entry "section:key".
     * @throws ClassCastException if the entry at "section:key" cannot be cast as a long.
     * @throws KeyException if "section:key" does not exist in the {@code IniObject}.
     */
    public long getLong(String section, String key) throws KeyException, ClassCastException {return 0;}
    /**
     * Returns the double stored at the entry "section:key". 
     * 
     * @param section the section of the entry
     * @param key the key of the entry
     * @return the double value of the entry "section:key".
     * @throws ClassCastException if the entry at "section:key" cannot be cast as a double.
     * @throws KeyException if "section:key" does not exist in the {@code IniObject}.
     */
    public double getDouble(String section, String key) throws KeyException, ClassCastException {return 0;}
    /**
     * Returns the boolean stored at the entry "section:key". 
     * <p>
     * A {@code true} boolean is returned if one of the follwing is matched 
     * <ul>
     *  <li> A string starting with a 'y'
     *  <li> A string starting with a 'Y'
     *  <li> A string starting with a 't'
     *  <li> A string starting with a 'T'
     *  <li> A string starting with a '1'
     * </ul>
     * A {@code false} boolean is returned if one of the follwing is matched
     * <ul>
     *  <li> A string starting with a 'n'
     *  <li> A string starting with a 'N'
     *  <li> A string starting with a 'f'
     *  <li> A string starting with a 'F'
     *  <li> A string starting with a '0'
     * </ul>
     * @param section the section of the entry
     * @param key the key of the entry
     * @return the boolean value of the entry "section:key".
     * @throws ClassCastException if the entry at "section:key" cannot be cast as a boolean.
     * @throws KeyException if "section:key" does not exist in the {@code IniObject}.
     */
    public boolean getBoolean(String section, String key) throws KeyException, ClassCastException {return true;}
    /**
     * Returns true if the entry exists in the {@code IniObject}.
     * Entries are of the form "section" or "section:key".
     * 
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
     * @param iniFilePath The file of the .ini object you wish to load
     * @throws IniException if the {@code iniFilePath} is malformed or the wrong extension.
     */
    public IniObject(File iniFilePath) throws IniException {} 
}
