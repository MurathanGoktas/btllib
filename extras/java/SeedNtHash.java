/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package btllib;

public class SeedNtHash {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SeedNtHash(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SeedNtHash obj) {
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
        btllibJNI.delete_SeedNtHash(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean roll() {
    return btllibJNI.SeedNtHash_roll(swigCPtr, this);
  }

  public boolean roll_back() {
    return btllibJNI.SeedNtHash_roll_back(swigCPtr, this);
  }

  public boolean peek() {
    return btllibJNI.SeedNtHash_peek__SWIG_0(swigCPtr, this);
  }

  public boolean peek_back() {
    return btllibJNI.SeedNtHash_peek_back__SWIG_0(swigCPtr, this);
  }

  public boolean peek(char char_in) {
    return btllibJNI.SeedNtHash_peek__SWIG_1(swigCPtr, this, char_in);
  }

  public boolean peek_back(char char_in) {
    return btllibJNI.SeedNtHash_peek_back__SWIG_1(swigCPtr, this, char_in);
  }

  public SWIGTYPE_p_unsigned_long_long hashes() {
    long cPtr = btllibJNI.SeedNtHash_hashes(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public long get_pos() {
    return btllibJNI.SeedNtHash_get_pos(swigCPtr, this);
  }

  public boolean forward() {
    return btllibJNI.SeedNtHash_forward(swigCPtr, this);
  }

  public long get_hash_num() {
    return btllibJNI.SeedNtHash_get_hash_num(swigCPtr, this);
  }

  public long get_hash_num_per_seed() {
    return btllibJNI.SeedNtHash_get_hash_num_per_seed(swigCPtr, this);
  }

  public long get_k() {
    return btllibJNI.SeedNtHash_get_k(swigCPtr, this);
  }

  public SWIGTYPE_p_unsigned_long_long get_forward_hash() {
    long cPtr = btllibJNI.SeedNtHash_get_forward_hash(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public SWIGTYPE_p_unsigned_long_long get_reverse_hash() {
    long cPtr = btllibJNI.SeedNtHash_get_reverse_hash(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public SeedNtHash(String seq, VectorSpacedSeed seeds, long hash_num_per_seed, long k, long pos) {
    this(btllibJNI.new_SeedNtHash__SWIG_0(seq, VectorSpacedSeed.getCPtr(seeds), seeds, hash_num_per_seed, k, pos), true);
  }

  public SeedNtHash(String seq, VectorSpacedSeed seeds, long hash_num_per_seed, long k) {
    this(btllibJNI.new_SeedNtHash__SWIG_1(seq, VectorSpacedSeed.getCPtr(seeds), seeds, hash_num_per_seed, k), true);
  }

}
