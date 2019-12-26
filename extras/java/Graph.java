/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package btllib;

public class Graph {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Graph(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Graph obj) {
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
        btllibJNI.delete_Graph(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Graph() {
    this(btllibJNI.new_Graph(), true);
  }

  public Vertex add_vertex() {
    return new Vertex(btllibJNI.Graph_add_vertex(swigCPtr, this), true);
  }

  public void remove_vertex(Vertex v) {
    btllibJNI.Graph_remove_vertex(swigCPtr, this, Vertex.getCPtr(v), v);
  }

  public Edge add_edge(Vertex u, Vertex v) {
    return new Edge(btllibJNI.Graph_add_edge(swigCPtr, this, Vertex.getCPtr(u), u, Vertex.getCPtr(v), v), true);
  }

  public void remove_edge(Edge e) {
    btllibJNI.Graph_remove_edge(swigCPtr, this, Edge.getCPtr(e), e);
  }

  public String to_string() {
    return btllibJNI.Graph_to_string(swigCPtr, this);
  }

}
