package api.recodecamp.compile_service.util;

import java.util.List;

/**
* Utility functions for String objects
* 
* @author Jasmine Anderson
* @version 1.0
*/
public final class StrUtil {

    private StrUtil() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    };

    /**
     * Checks if Object is null or an empty string
     * @param String parameter value to be checked
     * @return Indicates whether the parameter value is valid
     */
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    };

    /**
     * Formats object to return String lowercase
     * @param String string to be formatted
     * @return Returns String that has been formatted
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/String.html">Class String</a>
     */
    public static String fStrLowerCase(String str) {
        if (isNullOrEmpty(str)) {
            throw new IllegalArgumentException("String length must be greater than 1");
        }

        return str.toLowerCase();
    };

    /**
     * Formats String to titlecase format
     * @param String to be formatted
     * @return Returns String that has been formatted
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/String.html">Class String</a>
     */
    public static String fStrTitleCase(String str) {
        if (isNullOrEmpty(str)) {
            throw new IllegalArgumentException("String length must be greater than 1");
        }
        
        String ft = String.valueOf(str.charAt(0)).toUpperCase().concat(str.substring(1).toLowerCase());
        return str.length() == 1 ? str.toUpperCase() : ft;
    };
    
    /**
     * Converts an array of strings to titlecase string format
     * @param String string to be formatted
     * @return Returns String that has been formatted
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/String.html">Class String</a>
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html">Class List</a>
     */
    public static String fStrTitleCase(List<String> arr) {
        StringBuilder fStr = new StringBuilder();

        arr.forEach(str -> {
            if (isNullOrEmpty(str)) {
                throw new IllegalArgumentException("String length must be greater than 1");
            } else {
                String result = fStrTitleCase(str);
                fStr.append(result); 
            }
        });

        return fStr.toString();
    }
        
    /**
     * Converts an array of strings to camelCase string format
     * @param List<String> list of strings to be formatted to a string
     * @return Returns String that has been formatted from list of strings
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/String.html">Class String</a>
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html">Class List</a>
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html">Class StringBuilder</a>
     */ 
    public static String fStrCamelCase(List<String> arr) {
        StringBuilder fStr = new StringBuilder();

        for (int i = 0; i < arr.size(); i++) {
            String str = arr.get(i);
            if (isNullOrEmpty(str)) {
                throw new IllegalArgumentException("String length must be greater than 1");
            } else if (i == 0) {
                fStr.append(str.toLowerCase());
            } else if (i != 0 && str.length() == 1) {
                fStr.append(str.toUpperCase());
            } else {
                String result = fStrTitleCase(str);
                fStr.append(result);
            }
        }
                
        return fStr.toString();
    };
}
