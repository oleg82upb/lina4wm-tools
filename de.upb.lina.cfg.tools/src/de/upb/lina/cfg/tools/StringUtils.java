package de.upb.lina.cfg.tools;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * This class is a static utility class providing convenience methods and constants which are useful
 * when working with strings.
 * 
 * @author Alexander Hetzer
 *
 */
public class StringUtils {

   public static final String RIGHT_BRACKET = ")";
   public static final String LEFT_BRACKET = "(";
   public static final String EMPTY_STRING = "";
   public static final String NUMBERS_REGEX = "[0-9]+";
   public static final String REPLACE_DOTS_REGEX = "\\.";
   public static final String WHITESPACE_SINGLE = " ";


   private StringUtils() {
   }


   /**
    * Returns the current time stamp in the following format: "yyyy_MM_dd_HH_mm_ss"
    * 
    * @return the current time stamp
    */
   public static String getCurrentTimeStamp()
   {
      SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");// dd/MM/yyyy
      Date now = new Date();
      String strDate = sdfDate.format(now);
      return strDate;
   }


   /**
    * Checks if the given string is either {@code null} or empty. Returns {@code true} if the given
    * string is {@code null} or empty, {@code false} otherwise.
    *
    * @param string The string to check which may be {@code null}.
    * @return {@code true} if the given string is {@code null} or empty, {@code false} otherwise.
    */
   public static boolean isEmpty(final String string)
   {
      return string == null || string.isEmpty();
   }

}
