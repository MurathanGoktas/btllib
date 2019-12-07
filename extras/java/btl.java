/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class btl {
  public static boolean is_fasta(String input, long n) {
    return btlJNI.is_fasta(input, n);
  }

  public static boolean is_fastq(String input, long n) {
    return btlJNI.is_fastq(input, n);
  }

  public static boolean is_sam(String input, long n) {
    return btlJNI.is_sam(input, n);
  }

  public static String getCOMPLEMENTS() {
    return btlJNI.COMPLEMENTS_get();
  }

  public static String getCAPITALS() {
    return btlJNI.CAPITALS_get();
  }

  public static void check_stream(SWIGTYPE_p_std__ios stream, String name) {
    btlJNI.check_stream(SWIGTYPE_p_std__ios.getCPtr(stream), name);
  }

}
