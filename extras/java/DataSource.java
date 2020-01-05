/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package btllib;

public class DataSource {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DataSource(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DataSource obj) {
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
        btllibJNI.delete_DataSource(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DataSource(String source) {
    this(btllibJNI.new_DataSource(source), true);
  }

  public void close() {
    btllibJNI.DataSource_close(swigCPtr, this);
  }

  public SWIGTYPE_p_FILE __ref__() {
    long cPtr = btllibJNI.DataSource___ref__(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FILE(cPtr, false);
  }

  public SWIGTYPE_p_FILE __deref__() {
    long cPtr = btllibJNI.DataSource___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FILE(cPtr, false);
  }

  public void setPipeline(_Pipeline value) {
    btllibJNI.DataSource_pipeline_set(swigCPtr, this, _Pipeline.getCPtr(value), value);
  }

  public _Pipeline getPipeline() {
    long cPtr = btllibJNI.DataSource_pipeline_get(swigCPtr, this);
    return (cPtr == 0) ? null : new _Pipeline(cPtr, false);
  }

  public void setClosed(boolean value) {
    btllibJNI.DataSource_closed_set(swigCPtr, this, value);
  }

  public boolean getClosed() {
    return btllibJNI.DataSource_closed_get(swigCPtr, this);
  }

}
