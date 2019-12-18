/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class SeqReader {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SeqReader(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SeqReader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        btlJNI.delete_SeqReader(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SeqReader(String input_path, int flags) {
    this(btlJNI.new_SeqReader__SWIG_0(input_path, flags), true);
  }

  public SeqReader(String input_path) {
    this(btlJNI.new_SeqReader__SWIG_1(input_path), true);
  }

  public boolean flagFoldCase() {
    return btlJNI.SeqReader_flagFoldCase(swigCPtr, this);
  }

  public boolean flagTrimMasked() {
    return btlJNI.SeqReader_flagTrimMasked(swigCPtr, this);
  }

  public SeqReader.Format get_format() {
    return SeqReader.Format.swigToEnum(btlJNI.SeqReader_get_format(swigCPtr, this));
  }

  public int peek() {
    return btlJNI.SeqReader_peek(swigCPtr, this);
  }

  public boolean read() {
    return btlJNI.SeqReader_read(swigCPtr, this);
  }

  public String seq() {
    return btlJNI.SeqReader_seq(swigCPtr, this);
  }

  public String qual() {
    return btlJNI.SeqReader_qual(swigCPtr, this);
  }

  public void manip(SWIGTYPE_p_f_r_std__istream__r_std__istream f) {
    btlJNI.SeqReader_manip(swigCPtr, this, SWIGTYPE_p_f_r_std__istream__r_std__istream.getCPtr(f));
  }

  public final static class Flag {
    public final static SeqReader.Flag FOLD_CASE = new SeqReader.Flag("FOLD_CASE", btlJNI.SeqReader_FOLD_CASE_get());
    public final static SeqReader.Flag NO_FOLD_CASE = new SeqReader.Flag("NO_FOLD_CASE", btlJNI.SeqReader_NO_FOLD_CASE_get());
    public final static SeqReader.Flag NO_TRIM_MASKED = new SeqReader.Flag("NO_TRIM_MASKED", btlJNI.SeqReader_NO_TRIM_MASKED_get());
    public final static SeqReader.Flag TRIM_MASKED = new SeqReader.Flag("TRIM_MASKED", btlJNI.SeqReader_TRIM_MASKED_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Flag swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Flag.class + " with value " + swigValue);
    }

    private Flag(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Flag(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Flag(String swigName, Flag swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Flag[] swigValues = { FOLD_CASE, NO_FOLD_CASE, NO_TRIM_MASKED, TRIM_MASKED };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class Format {
    public final static SeqReader.Format UNKNOWN = new SeqReader.Format("UNKNOWN");
    public final static SeqReader.Format FASTA = new SeqReader.Format("FASTA");
    public final static SeqReader.Format FASTQ = new SeqReader.Format("FASTQ");
    public final static SeqReader.Format SAM = new SeqReader.Format("SAM");
    public final static SeqReader.Format GFA2 = new SeqReader.Format("GFA2");
    public final static SeqReader.Format INVALID = new SeqReader.Format("INVALID");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Format swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Format.class + " with value " + swigValue);
    }

    private Format(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Format(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Format(String swigName, Format swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Format[] swigValues = { UNKNOWN, FASTA, FASTQ, SAM, GFA2, INVALID };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
