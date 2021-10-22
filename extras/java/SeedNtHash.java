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

  public SeedNtHash(String seq, long seq_len, VectorSpacedSeed seeds, long hash_num_per_seed, long k, long pos) {
    this(btllibJNI.new_SeedNtHash__SWIG_0(seq, seq_len, VectorSpacedSeed.getCPtr(seeds), seeds, hash_num_per_seed, k, pos), true);
  }

  public SeedNtHash(String seq, long seq_len, VectorSpacedSeed seeds, long hash_num_per_seed, long k) {
    this(btllibJNI.new_SeedNtHash__SWIG_1(seq, seq_len, VectorSpacedSeed.getCPtr(seeds), seeds, hash_num_per_seed, k), true);
  }

  public SeedNtHash(String seq, VectorSpacedSeed seeds, long hash_num_per_seed, long k, long pos) {
    this(btllibJNI.new_SeedNtHash__SWIG_2(seq, VectorSpacedSeed.getCPtr(seeds), seeds, hash_num_per_seed, k, pos), true);
  }

  public SeedNtHash(String seq, VectorSpacedSeed seeds, long hash_num_per_seed, long k) {
    this(btllibJNI.new_SeedNtHash__SWIG_3(seq, VectorSpacedSeed.getCPtr(seeds), seeds, hash_num_per_seed, k), true);
  }

  public SeedNtHash(String seq, long seq_len, VectorString seeds, long hash_num_per_seed, long k, long pos) {
    this(btllibJNI.new_SeedNtHash__SWIG_4(seq, seq_len, VectorString.getCPtr(seeds), seeds, hash_num_per_seed, k, pos), true);
  }

  public SeedNtHash(String seq, long seq_len, VectorString seeds, long hash_num_per_seed, long k) {
    this(btllibJNI.new_SeedNtHash__SWIG_5(seq, seq_len, VectorString.getCPtr(seeds), seeds, hash_num_per_seed, k), true);
  }

  public SeedNtHash(String seq, VectorString seeds, long hash_num_per_seed, long k, long pos) {
    this(btllibJNI.new_SeedNtHash__SWIG_6(seq, VectorString.getCPtr(seeds), seeds, hash_num_per_seed, k, pos), true);
  }

  public SeedNtHash(String seq, VectorString seeds, long hash_num_per_seed, long k) {
    this(btllibJNI.new_SeedNtHash__SWIG_7(seq, VectorString.getCPtr(seeds), seeds, hash_num_per_seed, k), true);
  }

  public boolean roll() {
    return btllibJNI.SeedNtHash_roll(swigCPtr, this);
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

  public java.math.BigInteger get_forward_hash() {
    return btllibJNI.SeedNtHash_get_forward_hash(swigCPtr, this);
  }

  public java.math.BigInteger get_reverse_hash() {
    return btllibJNI.SeedNtHash_get_reverse_hash(swigCPtr, this);
  }

}
