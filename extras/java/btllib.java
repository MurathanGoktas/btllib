/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package btllib;

public class btllib {
  public static SWIGTYPE_p_unsigned_char getBIT_MASKS() {
    long cPtr = btllibJNI.BIT_MASKS_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public static String getBLOOM_FILTER_SIGNATURE() {
    return btllibJNI.BLOOM_FILTER_SIGNATURE_get();
  }

  public static String getKMER_BLOOM_FILTER_SIGNATURE() {
    return btllibJNI.KMER_BLOOM_FILTER_SIGNATURE_get();
  }

  public static String getSEED_BLOOM_FILTER_SIGNATURE() {
    return btllibJNI.SEED_BLOOM_FILTER_SIGNATURE_get();
  }

  public static String getHASH_FN() {
    return btllibJNI.HASH_FN_get();
  }

  public static long getMAX_HASH_VALUES() {
    return btllibJNI.MAX_HASH_VALUES_get();
  }

  public static long getPLACEHOLDER_NEWLINES() {
    return btllibJNI.PLACEHOLDER_NEWLINES_get();
  }

  public static long pop_cnt_byte(short x) {
    return btllibJNI.pop_cnt_byte(x);
  }

  public static String getCOUNTING_BLOOM_FILTER_SIGNATURE() {
    return btllibJNI.COUNTING_BLOOM_FILTER_SIGNATURE_get();
  }

  public static String getKMER_COUNTING_BLOOM_FILTER_SIGNATURE() {
    return btllibJNI.KMER_COUNTING_BLOOM_FILTER_SIGNATURE_get();
  }

  public static VectorString split(String s, String delim) {
    return new VectorString(btllibJNI.split(s, delim), true);
  }

  public static String join(VectorString s, String delim) {
    return btllibJNI.join(VectorString.getCPtr(s), s, delim);
  }

  public static void ltrim(SWIGTYPE_p_std__string s) {
    btllibJNI.ltrim__SWIG_0(SWIGTYPE_p_std__string.getCPtr(s));
  }

  public static void ltrim(SWIGTYPE_p_btllib__CString s) {
    btllibJNI.ltrim__SWIG_1(SWIGTYPE_p_btllib__CString.getCPtr(s));
  }

  public static void rtrim(SWIGTYPE_p_std__string s) {
    btllibJNI.rtrim__SWIG_0(SWIGTYPE_p_std__string.getCPtr(s));
  }

  public static void rtrim(SWIGTYPE_p_btllib__CString s) {
    btllibJNI.rtrim__SWIG_1(SWIGTYPE_p_btllib__CString.getCPtr(s));
  }

  public static void trim(SWIGTYPE_p_std__string s) {
    btllibJNI.trim__SWIG_0(SWIGTYPE_p_std__string.getCPtr(s));
  }

  public static void trim(SWIGTYPE_p_btllib__CString s) {
    btllibJNI.trim__SWIG_1(SWIGTYPE_p_btllib__CString.getCPtr(s));
  }

  public static boolean startswith(String s, String prefix) {
    return btllibJNI.startswith(s, prefix);
  }

  public static boolean endswith(String s, String suffix) {
    return btllibJNI.endswith(s, suffix);
  }

  public static String get_dirname(String path) {
    return btllibJNI.get_dirname(path);
  }

  public static String getCOMPLEMENTS() {
    return btllibJNI.COMPLEMENTS_get();
  }

  public static String getCAPITALS() {
    return btllibJNI.CAPITALS_get();
  }

  public static void reverse_complement(SWIGTYPE_p_std__string seq) {
    btllibJNI.reverse_complement(SWIGTYPE_p_std__string.getCPtr(seq));
  }

  public static String get_reverse_complement(String seq) {
    return btllibJNI.get_reverse_complement(seq);
  }

  public static Datatype getDATATYPES() {
    long cPtr = btllibJNI.DATATYPES_get();
    return (cPtr == 0) ? null : new Datatype(cPtr, false);
  }

  public static String get_pipeline_cmd(String path, Operation op) {
    return btllibJNI.get_pipeline_cmd(path, op.swigValue());
  }

  public static String get_datatype_cmd(String path, Datatype datatype, Operation op) {
    return btllibJNI.get_datatype_cmd(path, Datatype.getCPtr(datatype), datatype, op.swigValue());
  }

  public static VectorString peel_datatype(String path, Operation op) {
    return new VectorString(btllibJNI.peel_datatype(path, op.swigValue()), true);
  }

  public static String form_string_cmd(VectorString cmd_layers, Operation op, String path) {
    return btllibJNI.form_string_cmd(VectorString.getCPtr(cmd_layers), cmd_layers, op.swigValue(), path);
  }

  public static int getPIPE_READ_END() {
    return btllibJNI.PIPE_READ_END_get();
  }

  public static int getPIPE_WRITE_END() {
    return btllibJNI.PIPE_WRITE_END_get();
  }

  public static int getCOMM_BUFFER_SIZE() {
    return btllibJNI.COMM_BUFFER_SIZE_get();
  }

  public static SWIGTYPE_p_mode_t getOPEN_MODE() {
    return new SWIGTYPE_p_mode_t(btllibJNI.OPEN_MODE_get(), true);
  }

  public static void run_cmd() {
    btllibJNI.run_cmd();
  }

  public static void end_cmd() {
    btllibJNI.end_cmd();
  }

  public static void process_spawner_operation() {
    btllibJNI.process_spawner_operation();
  }

  public static SWIGTYPE_p_bool process_spawner_initialized() {
    return new SWIGTYPE_p_bool(btllibJNI.process_spawner_initialized(), false);
  }

  public static SWIGTYPE_p_int process_spawner_user2spawner_fd() {
    long cPtr = btllibJNI.process_spawner_user2spawner_fd();
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public static SWIGTYPE_p_int process_spawner_spawner2user_fd() {
    long cPtr = btllibJNI.process_spawner_spawner2user_fd();
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public static SWIGTYPE_p_std__mutex process_spawner_comm_mutex() {
    return new SWIGTYPE_p_std__mutex(btllibJNI.process_spawner_comm_mutex(), false);
  }

  public static long new_pipe_id() {
    return btllibJNI.new_pipe_id();
  }

  public static SWIGTYPE_p_std__string pipepath_prefix() {
    return new SWIGTYPE_p_std__string(btllibJNI.pipepath_prefix(), false);
  }

  public static long new_pipeline_id() {
    return btllibJNI.new_pipeline_id();
  }

  public static SWIGTYPE_p_std__mapT_unsigned_long_btllib__ProcessPipelineInternal_std__lessT_unsigned_long_t_t pipeline_map() {
    return new SWIGTYPE_p_std__mapT_unsigned_long_btllib__ProcessPipelineInternal_std__lessT_unsigned_long_t_t(btllibJNI.pipeline_map(), false);
  }

  public static boolean process_spawner_init() {
    return btllibJNI.process_spawner_init();
  }

  public static boolean getPROCESS_PIPELINE_INITIALIZER() {
    return btllibJNI.PROCESS_PIPELINE_INITIALIZER_get();
  }

  public static String get_pipepath(long id) {
    return btllibJNI.get_pipepath(id);
  }

  public static SWIGTYPE_p_btllib__IORedirection extract_io_redirection(SWIGTYPE_p_std__string cmd) {
    return new SWIGTYPE_p_btllib__IORedirection(btllibJNI.extract_io_redirection(SWIGTYPE_p_std__string.getCPtr(cmd)), true);
  }

  public static void open_comm_pipes(SWIGTYPE_p_std__string io_filepaths, SWIGTYPE_p_int comm_pipe_fd) {
    btllibJNI.open_comm_pipes(SWIGTYPE_p_std__string.getCPtr(io_filepaths), SWIGTYPE_p_int.getCPtr(comm_pipe_fd));
  }

  public static void redirect_io(int in_fd, int out_fd, int err_fd) {
    btllibJNI.redirect_io(in_fd, out_fd, err_fd);
  }

  public static void assign_process_cmd(VectorString args) {
    btllibJNI.assign_process_cmd(VectorString.getCPtr(args), args);
  }

  public static void rm_pipes() {
    btllibJNI.rm_pipes();
  }

  public static boolean check_child_failure(int status, SWIGTYPE_p_pid_t pid, String cmd) {
    return btllibJNI.check_child_failure__SWIG_0(status, SWIGTYPE_p_pid_t.getCPtr(pid), cmd);
  }

  public static boolean check_child_failure(int status, SWIGTYPE_p_pid_t pid) {
    return btllibJNI.check_child_failure__SWIG_1(status, SWIGTYPE_p_pid_t.getCPtr(pid));
  }

  public static boolean check_children_failures() {
    return btllibJNI.check_children_failures();
  }

  public static void install_signal_handlers_spawner() {
    btllibJNI.install_signal_handlers_spawner();
  }

  public static void set_comm_pipes(SWIGTYPE_p_std__vectorT_btllib__IORedirection_t redirections, long idx, long last_idx, SWIGTYPE_p_int comm_pipe_fd, SWIGTYPE_p_int in_fd, SWIGTYPE_p_int out_fd) {
    btllibJNI.set_comm_pipes(SWIGTYPE_p_std__vectorT_btllib__IORedirection_t.getCPtr(redirections), idx, last_idx, SWIGTYPE_p_int.getCPtr(comm_pipe_fd), SWIGTYPE_p_int.getCPtr(in_fd), SWIGTYPE_p_int.getCPtr(out_fd));
  }

  public static void open_redirection_files(SWIGTYPE_p_btllib__IORedirection redirection, SWIGTYPE_p_int in_fd, SWIGTYPE_p_int out_fd, SWIGTYPE_p_int err_fd) {
    btllibJNI.open_redirection_files(SWIGTYPE_p_btllib__IORedirection.getCPtr(redirection), SWIGTYPE_p_int.getCPtr(in_fd), SWIGTYPE_p_int.getCPtr(out_fd), SWIGTYPE_p_int.getCPtr(err_fd));
  }

  public static void set_pipepath_prefix() {
    btllibJNI.set_pipepath_prefix();
  }

  public static SWIGTYPE_p_std__arrayT_int_2_t start_watchdog() {
    return new SWIGTYPE_p_std__arrayT_int_2_t(btllibJNI.start_watchdog(), true);
  }

  public static void closefile(SWIGTYPE_p_p_FILE f) {
    btllibJNI.closefile(SWIGTYPE_p_p_FILE.getCPtr(f));
  }

  public static String getPRINT_COLOR_INFO() {
    return btllibJNI.PRINT_COLOR_INFO_get();
  }

  public static String getPRINT_COLOR_WARNING() {
    return btllibJNI.PRINT_COLOR_WARNING_get();
  }

  public static String getPRINT_COLOR_ERROR() {
    return btllibJNI.PRINT_COLOR_ERROR_get();
  }

  public static String getPRINT_COLOR_END() {
    return btllibJNI.PRINT_COLOR_END_get();
  }

  public static String get_time() {
    return btllibJNI.get_time();
  }

  public static void log_info(String msg) {
    btllibJNI.log_info(msg);
  }

  public static void log_warning(String msg) {
    btllibJNI.log_warning(msg);
  }

  public static void log_error(String msg) {
    btllibJNI.log_error(msg);
  }

  public static void check_info(boolean condition, String msg) {
    btllibJNI.check_info(condition, msg);
  }

  public static void check_warning(boolean condition, String msg) {
    btllibJNI.check_warning(condition, msg);
  }

  public static void check_error(boolean condition, String msg) {
    btllibJNI.check_error(condition, msg);
  }

  public static void check_stream(SWIGTYPE_p_std__ios stream, String name) {
    btllibJNI.check_stream(SWIGTYPE_p_std__ios.getCPtr(stream), name);
  }

  public static String get_strerror() {
    return btllibJNI.get_strerror();
  }

  public static String getNTHASH_FN_NAME() {
    return btllibJNI.NTHASH_FN_NAME_get();
  }

  public static int getNTHASH_HASH_NUM_MAX() {
    return btllibJNI.NTHASH_HASH_NUM_MAX_get();
  }

  public static int getNTHASH_K_MAX() {
    return btllibJNI.NTHASH_K_MAX_get();
  }

  public static short getCP_OFF() {
    return btllibJNI.CP_OFF_get();
  }

  public static int getMULTISHIFT() {
    return btllibJNI.MULTISHIFT_get();
  }

  public static java.math.BigInteger getMULTISEED() {
    return btllibJNI.MULTISEED_get();
  }

  public static java.math.BigInteger getSEED_A() {
    return btllibJNI.SEED_A_get();
  }

  public static java.math.BigInteger getSEED_C() {
    return btllibJNI.SEED_C_get();
  }

  public static java.math.BigInteger getSEED_G() {
    return btllibJNI.SEED_G_get();
  }

  public static java.math.BigInteger getSEED_T() {
    return btllibJNI.SEED_T_get();
  }

  public static java.math.BigInteger getSEED_N() {
    return btllibJNI.SEED_N_get();
  }

  public static int getASCII_SIZE() {
    return btllibJNI.ASCII_SIZE_get();
  }

  public static SWIGTYPE_p_unsigned_long_long getSEED_TAB() {
    long cPtr = btllibJNI.SEED_TAB_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_long_long getA33R() {
    long cPtr = btllibJNI.A33R_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_long_long getA31L() {
    long cPtr = btllibJNI.A31L_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_long_long getC33R() {
    long cPtr = btllibJNI.C33R_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_long_long getC31L() {
    long cPtr = btllibJNI.C31L_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_long_long getG33R() {
    long cPtr = btllibJNI.G33R_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_long_long getG31L() {
    long cPtr = btllibJNI.G31L_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_long_long getT33R() {
    long cPtr = btllibJNI.T33R_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_long_long getT31L() {
    long cPtr = btllibJNI.T31L_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_long_long getN33R() {
    long cPtr = btllibJNI.N33R_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_long_long getN31L() {
    long cPtr = btllibJNI.N31L_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public static SWIGTYPE_p_p_unsigned_long_long getMS_TAB_33R() {
    long cPtr = btllibJNI.MS_TAB_33R_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_unsigned_long_long(cPtr, false);
  }

  public static SWIGTYPE_p_p_unsigned_long_long getMS_TAB_31L() {
    long cPtr = btllibJNI.MS_TAB_31L_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_unsigned_long_long(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_char getRC_CONVERT_TAB() {
    long cPtr = btllibJNI.RC_CONVERT_TAB_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_char getCONVERT_TAB() {
    long cPtr = btllibJNI.CONVERT_TAB_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_long_long getDIMER_TAB() {
    long cPtr = btllibJNI.DIMER_TAB_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_long_long getTRIMER_TAB() {
    long cPtr = btllibJNI.TRIMER_TAB_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public static SWIGTYPE_p_unsigned_long_long getTETRAMER_TAB() {
    long cPtr = btllibJNI.TETRAMER_TAB_get();
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long_long(cPtr, false);
  }

  public static java.math.BigInteger rol1(java.math.BigInteger v) {
    return btllibJNI.rol1(v);
  }

  public static java.math.BigInteger rolx(java.math.BigInteger v, long x) {
    return btllibJNI.rolx(v, x);
  }

  public static java.math.BigInteger ror1(java.math.BigInteger v) {
    return btllibJNI.ror1(v);
  }

  public static java.math.BigInteger rol31(java.math.BigInteger v, long s) {
    return btllibJNI.rol31(v, s);
  }

  public static java.math.BigInteger rol33(java.math.BigInteger v, long s) {
    return btllibJNI.rol33(v, s);
  }

  public static java.math.BigInteger swapbits033(java.math.BigInteger v) {
    return btllibJNI.swapbits033(v);
  }

  public static java.math.BigInteger swapbits3263(java.math.BigInteger v) {
    return btllibJNI.swapbits3263(v);
  }

  public static java.math.BigInteger swapxbits033(java.math.BigInteger v, long x) {
    return btllibJNI.swapxbits033(v, x);
  }

  public static java.math.BigInteger ntf64(String kmer_seq, long k) {
    return btllibJNI.ntf64__SWIG_0(kmer_seq, k);
  }

  public static java.math.BigInteger ntr64(String kmer_seq, long k) {
    return btllibJNI.ntr64__SWIG_0(kmer_seq, k);
  }

  public static java.math.BigInteger ntf64(java.math.BigInteger fh_val, long k, short char_out, short char_in) {
    return btllibJNI.ntf64__SWIG_1(fh_val, k, char_out, char_in);
  }

  public static java.math.BigInteger ntr64(java.math.BigInteger rh_val, long k, short char_out, short char_in) {
    return btllibJNI.ntr64__SWIG_1(rh_val, k, char_out, char_in);
  }

  public static java.math.BigInteger ntc64(String kmer_seq, long k) {
    return btllibJNI.ntc64__SWIG_0(kmer_seq, k);
  }

  public static java.math.BigInteger ntc64(String kmer_seq, long k, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val) {
    return btllibJNI.ntc64__SWIG_1(kmer_seq, k, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val));
  }

  public static java.math.BigInteger ntc64(short char_out, short char_in, long k, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val) {
    return btllibJNI.ntc64__SWIG_2(char_out, char_in, k, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val));
  }

  public static java.math.BigInteger ntf64l(java.math.BigInteger rh_val, long k, short char_out, short char_in) {
    return btllibJNI.ntf64l(rh_val, k, char_out, char_in);
  }

  public static java.math.BigInteger ntr64l(java.math.BigInteger fh_val, long k, short char_out, short char_in) {
    return btllibJNI.ntr64l(fh_val, k, char_out, char_in);
  }

  public static java.math.BigInteger ntc64l(short char_out, short char_in, long k, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val) {
    return btllibJNI.ntc64l(char_out, char_in, k, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val));
  }

  public static java.math.BigInteger ntf64(String kmer_seq, long k, long seed) {
    return btllibJNI.ntf64__SWIG_2(kmer_seq, k, seed);
  }

  public static java.math.BigInteger ntc64(String kmer_seq, long k, long seed) {
    return btllibJNI.ntc64__SWIG_3(kmer_seq, k, seed);
  }

  public static void ntm64(String kmer_seq, long k, long m, SWIGTYPE_p_unsigned_long_long h_val) {
    btllibJNI.ntm64__SWIG_0(kmer_seq, k, m, SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static java.math.BigInteger nte64(java.math.BigInteger h_val, long k, long i) {
    return btllibJNI.nte64(h_val, k, i);
  }

  public static void ntm64(short char_out, short char_in, long k, long m, SWIGTYPE_p_unsigned_long_long h_val) {
    btllibJNI.ntm64__SWIG_1(char_out, char_in, k, m, SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static void ntmc64(String kmer_seq, long k, long m, SWIGTYPE_p_unsigned_long_long h_val) {
    btllibJNI.ntmc64__SWIG_0(kmer_seq, k, m, SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static void ntmc64(String kmer_seq, long k, long m, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val, SWIGTYPE_p_unsigned_long_long h_val) {
    btllibJNI.ntmc64__SWIG_1(kmer_seq, k, m, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static void ntmc64(short char_out, short char_in, long k, long m, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val, SWIGTYPE_p_unsigned_long_long h_val) {
    btllibJNI.ntmc64__SWIG_2(char_out, char_in, k, m, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static void ntmc64l(short char_out, short char_in, long k, long m, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val, SWIGTYPE_p_unsigned_long_long h_val) {
    btllibJNI.ntmc64l(char_out, char_in, k, m, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static boolean ntc64(String kmer_seq, long k, SWIGTYPE_p_unsigned_long_long h_val, SWIGTYPE_p_unsigned_int loc_n) {
    return btllibJNI.ntc64__SWIG_4(kmer_seq, k, SWIGTYPE_p_unsigned_long_long.getCPtr(h_val), SWIGTYPE_p_unsigned_int.getCPtr(loc_n));
  }

  public static boolean ntmc64(String kmer_seq, long k, long m, SWIGTYPE_p_unsigned_int loc_n, SWIGTYPE_p_unsigned_long_long h_val) {
    return btllibJNI.ntmc64__SWIG_3(kmer_seq, k, m, SWIGTYPE_p_unsigned_int.getCPtr(loc_n), SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static boolean ntc64(String kmer_seq, long k, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val, SWIGTYPE_p_unsigned_long_long h_val, SWIGTYPE_p_unsigned_int loc_n) {
    return btllibJNI.ntc64__SWIG_5(kmer_seq, k, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(h_val), SWIGTYPE_p_unsigned_int.getCPtr(loc_n));
  }

  public static boolean ntmc64(String kmer_seq, long k, long m, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val, SWIGTYPE_p_unsigned_int loc_n, SWIGTYPE_p_unsigned_long_long h_val) {
    return btllibJNI.ntmc64__SWIG_4(kmer_seq, k, m, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val), SWIGTYPE_p_unsigned_int.getCPtr(loc_n), SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static boolean ntmc64(String kmer_seq, long k, long m, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val, SWIGTYPE_p_unsigned_int loc_n, SWIGTYPE_p_unsigned_long_long h_val, SWIGTYPE_p_bool h_stn) {
    return btllibJNI.ntmc64__SWIG_5(kmer_seq, k, m, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val), SWIGTYPE_p_unsigned_int.getCPtr(loc_n), SWIGTYPE_p_unsigned_long_long.getCPtr(h_val), SWIGTYPE_p_bool.getCPtr(h_stn));
  }

  public static void ntmc64(short char_out, short char_in, long k, long m, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val, SWIGTYPE_p_unsigned_long_long h_val, SWIGTYPE_p_bool h_stn) {
    btllibJNI.ntmc64__SWIG_6(char_out, char_in, k, m, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(h_val), SWIGTYPE_p_bool.getCPtr(h_stn));
  }

  public static java.math.BigInteger mask_hash(SWIGTYPE_p_unsigned_long_long fk_val, SWIGTYPE_p_unsigned_long_long rk_val, String seed_seq, String kmer_seq, long k) {
    return btllibJNI.mask_hash(SWIGTYPE_p_unsigned_long_long.getCPtr(fk_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rk_val), seed_seq, kmer_seq, k);
  }

  public static void sub_hash(java.math.BigInteger fh_val, java.math.BigInteger rh_val, String kmer_seq, VectorUnsigned positions, SWIGTYPE_p_std__vectorT_unsigned_char_t new_bases, long k, long m, SWIGTYPE_p_unsigned_long_long h_val) {
    btllibJNI.sub_hash(fh_val, rh_val, kmer_seq, VectorUnsigned.getCPtr(positions), positions, SWIGTYPE_p_std__vectorT_unsigned_char_t.getCPtr(new_bases), k, m, SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static java.math.BigInteger nts64(String kmer_seq, SWIGTYPE_p_std__vectorT_bool_t seed, long k, SWIGTYPE_p_unsigned_long_long h_val) {
    return btllibJNI.nts64__SWIG_0(kmer_seq, SWIGTYPE_p_std__vectorT_bool_t.getCPtr(seed), k, SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static java.math.BigInteger nts64(String kmer_seq, SWIGTYPE_p_std__vectorT_bool_t seed, short char_out, short char_in, long k, SWIGTYPE_p_unsigned_long_long h_val) {
    return btllibJNI.nts64__SWIG_1(kmer_seq, SWIGTYPE_p_std__vectorT_bool_t.getCPtr(seed), char_out, char_in, k, SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static boolean ntms64(String kmer_seq, VectorSpacedSeed seed_seq, long k, long m, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val, SWIGTYPE_p_unsigned_int loc_n, SWIGTYPE_p_unsigned_long_long h_val, SWIGTYPE_p_bool h_stn) {
    return btllibJNI.ntms64__SWIG_0(kmer_seq, VectorSpacedSeed.getCPtr(seed_seq), seed_seq, k, m, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val), SWIGTYPE_p_unsigned_int.getCPtr(loc_n), SWIGTYPE_p_unsigned_long_long.getCPtr(h_val), SWIGTYPE_p_bool.getCPtr(h_stn));
  }

  public static void ntms64(String kmer_seq, VectorSpacedSeed seed_seq, short char_out, short char_in, long k, long m, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val, SWIGTYPE_p_unsigned_long_long h_val, SWIGTYPE_p_bool h_stn) {
    btllibJNI.ntms64__SWIG_1(kmer_seq, VectorSpacedSeed.getCPtr(seed_seq), seed_seq, char_out, char_in, k, m, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(h_val), SWIGTYPE_p_bool.getCPtr(h_stn));
  }

  public static boolean ntmsm64(String kmer_seq, VectorSpacedSeed seed_seq, long k, long m, long m2, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val, SWIGTYPE_p_unsigned_int loc_n, SWIGTYPE_p_unsigned_long_long h_val) {
    return btllibJNI.ntmsm64__SWIG_0(kmer_seq, VectorSpacedSeed.getCPtr(seed_seq), seed_seq, k, m, m2, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val), SWIGTYPE_p_unsigned_int.getCPtr(loc_n), SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static void ntmsm64(String kmer_seq, VectorSpacedSeed seed_seq, long k, long m, long m2, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val, SWIGTYPE_p_unsigned_long_long h_val) {
    btllibJNI.ntmsm64__SWIG_1(kmer_seq, VectorSpacedSeed.getCPtr(seed_seq), seed_seq, k, m, m2, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static void ntmsm64l(String kmer_seq, VectorSpacedSeed seed_seq, long k, long m, long m2, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val, SWIGTYPE_p_unsigned_long_long h_val) {
    btllibJNI.ntmsm64l__SWIG_0(kmer_seq, VectorSpacedSeed.getCPtr(seed_seq), seed_seq, k, m, m2, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static void ntmsm64(String kmer_seq, char in, VectorSpacedSeed seed_seq, long k, long m, long m2, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val, SWIGTYPE_p_unsigned_long_long h_val) {
    btllibJNI.ntmsm64__SWIG_2(kmer_seq, in, VectorSpacedSeed.getCPtr(seed_seq), seed_seq, k, m, m2, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static void ntmsm64l(String kmer_seq, char in, VectorSpacedSeed seed_seq, long k, long m, long m2, SWIGTYPE_p_unsigned_long_long fh_val, SWIGTYPE_p_unsigned_long_long rh_val, SWIGTYPE_p_unsigned_long_long h_val) {
    btllibJNI.ntmsm64l__SWIG_1(kmer_seq, in, VectorSpacedSeed.getCPtr(seed_seq), seed_seq, k, m, m2, SWIGTYPE_p_unsigned_long_long.getCPtr(fh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(rh_val), SWIGTYPE_p_unsigned_long_long.getCPtr(h_val));
  }

  public static VectorSpacedSeed parse_seeds(VectorString seed_strings) {
    return new VectorSpacedSeed(btllibJNI.parse_seeds(VectorString.getCPtr(seed_strings), seed_strings), true);
  }

  public static VectorSpacedSeed parse_blocks(VectorString seed_strings) {
    return new VectorSpacedSeed(btllibJNI.parse_blocks__SWIG_0(VectorString.getCPtr(seed_strings), seed_strings), true);
  }

  public static VectorSpacedSeed parse_blocks(VectorSpacedSeed seeds, long k) {
    return new VectorSpacedSeed(btllibJNI.parse_blocks__SWIG_1(VectorSpacedSeed.getCPtr(seeds), seeds, k), true);
  }

}
