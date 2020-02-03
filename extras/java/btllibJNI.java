/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package btllib;

public class btllibJNI {
  public final static native int SeqReader_FOLD_CASE_get();
  public final static native int SeqReader_NO_FOLD_CASE_get();
  public final static native int SeqReader_NO_TRIM_MASKED_get();
  public final static native int SeqReader_TRIM_MASKED_get();
  public final static native long new_SeqReader__SWIG_0(String jarg1, int jarg2);
  public final static native long new_SeqReader__SWIG_1(String jarg1);
  public final static native void delete_SeqReader(long jarg1);
  public final static native void SeqReader_close(long jarg1, SeqReader jarg1_);
  public final static native boolean SeqReader_flagFoldCase(long jarg1, SeqReader jarg1_);
  public final static native boolean SeqReader_flagTrimMasked(long jarg1, SeqReader jarg1_);
  public final static native int SeqReader_get_format(long jarg1, SeqReader jarg1_);
  public final static native void SeqReader_Record_num_set(long jarg1, SeqReader.Record jarg1_, long jarg2);
  public final static native long SeqReader_Record_num_get(long jarg1, SeqReader.Record jarg1_);
  public final static native void SeqReader_Record_name_set(long jarg1, SeqReader.Record jarg1_, String jarg2);
  public final static native String SeqReader_Record_name_get(long jarg1, SeqReader.Record jarg1_);
  public final static native void SeqReader_Record_comment_set(long jarg1, SeqReader.Record jarg1_, String jarg2);
  public final static native String SeqReader_Record_comment_get(long jarg1, SeqReader.Record jarg1_);
  public final static native void SeqReader_Record_seq_set(long jarg1, SeqReader.Record jarg1_, String jarg2);
  public final static native String SeqReader_Record_seq_get(long jarg1, SeqReader.Record jarg1_);
  public final static native void SeqReader_Record_qual_set(long jarg1, SeqReader.Record jarg1_, String jarg2);
  public final static native String SeqReader_Record_qual_get(long jarg1, SeqReader.Record jarg1_);
  public final static native long new_SeqReader_Record();
  public final static native void delete_SeqReader_Record(long jarg1);
  public final static native long SeqReader_read(long jarg1, SeqReader jarg1_);
  public final static native long cp_off_get();
  public final static native int multishift_get();
  public final static native long multiseed_get();
  public final static native long seedA_get();
  public final static native long seedC_get();
  public final static native long seedG_get();
  public final static native long seedT_get();
  public final static native long seedN_get();
  public final static native int ASCII_SIZE_get();
  public final static native long seed_tab_get();
  public final static native long A33r_get();
  public final static native long A31l_get();
  public final static native long C33r_get();
  public final static native long C31l_get();
  public final static native long G33r_get();
  public final static native long G31l_get();
  public final static native long T33r_get();
  public final static native long T31l_get();
  public final static native long N33r_get();
  public final static native long N31l_get();
  public final static native void ms_tab_33r_set(long jarg1);
  public final static native long ms_tab_33r_get();
  public final static native void ms_tab_31l_set(long jarg1);
  public final static native long ms_tab_31l_get();
  public final static native long rol1(long jarg1);
  public final static native long ror1(long jarg1);
  public final static native long rol31(long jarg1, long jarg2);
  public final static native long rol33(long jarg1, long jarg2);
  public final static native long swapbits033(long jarg1);
  public final static native long swapbits3263(long jarg1);
  public final static native long NTF64__SWIG_0(String jarg1, long jarg2);
  public final static native long NTR64__SWIG_0(String jarg1, long jarg2);
  public final static native long NTF64__SWIG_1(long jarg1, long jarg2, short jarg3, short jarg4);
  public final static native long NTR64__SWIG_1(long jarg1, long jarg2, short jarg3, short jarg4);
  public final static native long NTC64__SWIG_0(String jarg1, long jarg2);
  public final static native long NTC64__SWIG_1(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long NTC64__SWIG_2(short jarg1, short jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long NTF64L(long jarg1, long jarg2, short jarg3, short jarg4);
  public final static native long NTR64L(long jarg1, long jarg2, short jarg3, short jarg4);
  public final static native long NTC64L(short jarg1, short jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long NTF64__SWIG_2(String jarg1, long jarg2, long jarg3);
  public final static native long NTC64__SWIG_3(String jarg1, long jarg2, long jarg3);
  public final static native void NTM64__SWIG_0(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long NTE64(long jarg1, long jarg2, long jarg3);
  public final static native void NTM64__SWIG_1(short jarg1, short jarg2, long jarg3, long jarg4, long jarg5);
  public final static native void NTMC64__SWIG_0(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void NTMC64__SWIG_1(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6);
  public final static native void NTMC64__SWIG_2(short jarg1, short jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7);
  public final static native boolean NTC64__SWIG_4(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native boolean NTMC64__SWIG_3(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native boolean NTC64__SWIG_5(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6);
  public final static native boolean NTMC64__SWIG_4(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7);
  public final static native boolean NTMC64__SWIG_5(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7, long jarg8);
  public final static native void NTMC64__SWIG_6(short jarg1, short jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7, long jarg8);
  public final static native long maskHash(long jarg1, long jarg2, String jarg3, String jarg4, long jarg5);
  public final static native long NTS64__SWIG_0(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long NTS64__SWIG_1(String jarg1, long jarg2, short jarg3, short jarg4, long jarg5, long jarg6);
  public final static native boolean NTMS64__SWIG_0(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7, long jarg8, long jarg9);
  public final static native void NTMS64__SWIG_1(String jarg1, long jarg2, short jarg3, short jarg4, long jarg5, long jarg6, long jarg7, long jarg8, long jarg9, long jarg10);
  public final static native boolean NTMSM64__SWIG_0(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7, long jarg8, long jarg9);
  public final static native void NTMSM64__SWIG_1(String jarg1, long jarg2, short jarg3, short jarg4, long jarg5, long jarg6, long jarg7, long jarg8, long jarg9, long jarg10);
  public final static native long parse_seeds(long jarg1);
  public final static native long new_RollingHash__SWIG_0(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long new_RollingHash__SWIG_1(String jarg1, long jarg2, long jarg3);
  public final static native boolean RollingHash_roll(long jarg1, RollingHash jarg1_);
  public final static native long RollingHash_hashes(long jarg1, RollingHash jarg1_);
  public final static native long RollingHash_get_pos(long jarg1, RollingHash jarg1_);
  public final static native long RollingHash_get_k(long jarg1, RollingHash jarg1_);
  public final static native long RollingHash_get_hash_num(long jarg1, RollingHash jarg1_);
  public final static native void delete_RollingHash(long jarg1);
  public final static native long new_SeedRollingHash__SWIG_0(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long new_SeedRollingHash__SWIG_1(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long new_SeedRollingHash__SWIG_2(String jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native long new_SeedRollingHash__SWIG_3(String jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long SeedRollingHash_get_hash_num_per_seed(long jarg1, SeedRollingHash jarg1_);
  public final static native boolean SeedRollingHash_roll(long jarg1, SeedRollingHash jarg1_);
  public final static native void delete_SeedRollingHash(long jarg1);
  public final static native long split(String jarg1, String jarg2);
  public final static native void ltrim(long jarg1);
  public final static native void rtrim(long jarg1);
  public final static native void trim(long jarg1);
  public final static native boolean starts_with(String jarg1, String jarg2);
  public final static native boolean ends_with(String jarg1, String jarg2);
  public final static native long new__Pipeline__SWIG_0();
  public final static native long new__Pipeline__SWIG_1(long jarg1, long jarg2, long jarg3);
  public final static native void _Pipeline_file_set(long jarg1, _Pipeline jarg1_, long jarg2);
  public final static native long _Pipeline_file_get(long jarg1, _Pipeline jarg1_);
  public final static native void _Pipeline_pid_first_set(long jarg1, _Pipeline jarg1_, long jarg2);
  public final static native long _Pipeline_pid_first_get(long jarg1, _Pipeline jarg1_);
  public final static native void _Pipeline_pid_last_set(long jarg1, _Pipeline jarg1_, long jarg2);
  public final static native long _Pipeline_pid_last_get(long jarg1, _Pipeline jarg1_);
  public final static native void delete__Pipeline(long jarg1);
  public final static native String get_saveload_cmd(String jarg1, int jarg2);
  public final static native long run_saveload_cmd(String jarg1, int jarg2);
  public final static native long new_DataSource(String jarg1);
  public final static native void delete_DataSource(long jarg1);
  public final static native void DataSource_close(long jarg1, DataSource jarg1_);
  public final static native long DataSource___ref__(long jarg1, DataSource jarg1_);
  public final static native long DataSource___deref__(long jarg1, DataSource jarg1_);
  public final static native void DataSource_pipeline_set(long jarg1, DataSource jarg1_, long jarg2, _Pipeline jarg2_);
  public final static native long DataSource_pipeline_get(long jarg1, DataSource jarg1_);
  public final static native void DataSource_closed_set(long jarg1, DataSource jarg1_, boolean jarg2);
  public final static native boolean DataSource_closed_get(long jarg1, DataSource jarg1_);
  public final static native long new_DataSink(String jarg1, boolean jarg2);
  public final static native void delete_DataSink(long jarg1);
  public final static native void DataSink_close(long jarg1, DataSink jarg1_);
  public final static native long DataSink___ref__(long jarg1, DataSink jarg1_);
  public final static native long DataSink___deref__(long jarg1, DataSink jarg1_);
  public final static native void DataSink_pipeline_set(long jarg1, DataSink jarg1_, long jarg2, _Pipeline jarg2_);
  public final static native long DataSink_pipeline_get(long jarg1, DataSink jarg1_);
  public final static native void DataSink_closed_set(long jarg1, DataSink jarg1_, boolean jarg2);
  public final static native boolean DataSink_closed_get(long jarg1, DataSink jarg1_);
  public final static native void sigchld_handler(int jarg1);
  public final static native boolean data_saveload_init();
  public final static native boolean data_saveload_initialized_get();
  public final static native String get_time();
  public final static native void log_info(String jarg1);
  public final static native void log_warning(String jarg1);
  public final static native void log_error(String jarg1);
  public final static native void check_error(boolean jarg1, String jarg2);
  public final static native void check_warning(boolean jarg1, String jarg2);
  public final static native void check_stream(long jarg1, String jarg2);
  public final static native long new_SeqWriter__SWIG_0(String jarg1, int jarg2, boolean jarg3);
  public final static native long new_SeqWriter__SWIG_1(String jarg1, int jarg2);
  public final static native long new_SeqWriter__SWIG_2(String jarg1);
  public final static native void SeqWriter_close(long jarg1, SeqWriter jarg1_);
  public final static native void SeqWriter_write(long jarg1, SeqWriter jarg1_, String jarg2, String jarg3, String jarg4, String jarg5);
  public final static native void delete_SeqWriter(long jarg1);
  public final static native String COMPLEMENTS_get();
  public final static native String CAPITALS_get();
  public final static native void reverse_complement(long jarg1);
  public final static native String get_reverse_complement(String jarg1);
  public final static native long new_BloomFilter__SWIG_0();
  public final static native long new_BloomFilter__SWIG_1(long jarg1, long jarg2);
  public final static native long new_BloomFilter__SWIG_2(String jarg1);
  public final static native void BloomFilter_insert__SWIG_0(long jarg1, BloomFilter jarg1_, long jarg2);
  public final static native void BloomFilter_insert__SWIG_1(long jarg1, BloomFilter jarg1_, long jarg2);
  public final static native boolean BloomFilter_contains__SWIG_0(long jarg1, BloomFilter jarg1_, long jarg2);
  public final static native boolean BloomFilter_contains__SWIG_1(long jarg1, BloomFilter jarg1_, long jarg2);
  public final static native long BloomFilter_get_bytes(long jarg1, BloomFilter jarg1_);
  public final static native long BloomFilter_get_pop_cnt(long jarg1, BloomFilter jarg1_);
  public final static native long BloomFilter_get_hash_num(long jarg1, BloomFilter jarg1_);
  public final static native double BloomFilter_get_fpr(long jarg1, BloomFilter jarg1_);
  public final static native void BloomFilter_write(long jarg1, BloomFilter jarg1_, String jarg2);
  public final static native void delete_BloomFilter(long jarg1);
  public final static native long new_KmerBloomFilter__SWIG_0(long jarg1, long jarg2, long jarg3);
  public final static native long new_KmerBloomFilter__SWIG_1(long jarg1, long jarg2);
  public final static native void KmerBloomFilter_insert__SWIG_0(long jarg1, KmerBloomFilter jarg1_, String jarg2);
  public final static native void KmerBloomFilter_insert__SWIG_1(long jarg1, KmerBloomFilter jarg1_, String jarg2, long jarg3);
  public final static native long KmerBloomFilter_contains__SWIG_0(long jarg1, KmerBloomFilter jarg1_, String jarg2);
  public final static native long KmerBloomFilter_contains__SWIG_1(long jarg1, KmerBloomFilter jarg1_, String jarg2, long jarg3);
  public final static native void delete_KmerBloomFilter(long jarg1);
  public final static native long BIT_MASKS_get();
  public final static native long pop_cnt_byte(short jarg1);
  public final static native long SeedRollingHash_SWIGUpcast(long jarg1);
}
