/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package btllib;

public class BlindNtHash {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BlindNtHash(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BlindNtHash obj) {
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
        btllibJNI.delete_BlindNtHash(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean roll(char char_in) {
    return btllibJNI.BlindNtHash_roll(swigCPtr, this, char_in);
  }

  public boolean roll_back(char char_in) {
    return btllibJNI.BlindNtHash_roll_back(swigCPtr, this, char_in);
  }

  public boolean peek(char char_in) {
    return btllibJNI.BlindNtHash_peek(swigCPtr, this, char_in);
  }

  public boolean peek_back(char char_in) {
    return btllibJNI.BlindNtHash_peek_back(swigCPtr, this, char_in);
  }

  public void sub(VectorUnsigned positions, SWIGTYPE_p_std__vectorT_unsigned_char_t new_bases) {
    btllibJNI.BlindNtHash_sub(swigCPtr, this, VectorUnsigned.getCPtr(positions), positions, SWIGTYPE_p_std__vectorT_unsigned_char_t.getCPtr(new_bases));
  }

  public SWIGTYPE_p_unsigned_long_long hashes() {
    long cPtr = btllibJNI.BlindNtHash_hashes(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public long get_pos() {
    return btllibJNI.BlindNtHash_get_pos(swigCPtr, this);
  }

  public boolean forward() {
    return btllibJNI.BlindNtHash_forward(swigCPtr, this);
  }

  public long get_hash_num() {
    return btllibJNI.BlindNtHash_get_hash_num(swigCPtr, this);
  }

  public long get_k() {
    return btllibJNI.BlindNtHash_get_k(swigCPtr, this);
  }

  public java.math.BigInteger get_forward_hash() {
    return btllibJNI.BlindNtHash_get_forward_hash(swigCPtr, this);
  }

  public java.math.BigInteger get_reverse_hash() {
    return btllibJNI.BlindNtHash_get_reverse_hash(swigCPtr, this);
  }

  public BlindNtHash(String seq, long hash_num, long k, long pos) {
    this(btllibJNI.new_BlindNtHash__SWIG_0(seq, hash_num, k, pos), true);
  }

  public BlindNtHash(String seq, long hash_num, long k) {
    this(btllibJNI.new_BlindNtHash__SWIG_1(seq, hash_num, k), true);
  }

}