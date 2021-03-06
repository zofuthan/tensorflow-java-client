// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensor_description.proto

package org.tensorflow.framework;

public interface TensorDescriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.TensorDescription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Data type of tensor elements
   * </pre>
   *
   * <code>optional .tensorflow.DataType dtype = 1;</code>
   */
  int getDtypeValue();
  /**
   * <pre>
   * Data type of tensor elements
   * </pre>
   *
   * <code>optional .tensorflow.DataType dtype = 1;</code>
   */
  DataType getDtype();

  /**
   * <pre>
   * Shape of the tensor.
   * </pre>
   *
   * <code>optional .tensorflow.TensorShapeProto shape = 2;</code>
   */
  boolean hasShape();
  /**
   * <pre>
   * Shape of the tensor.
   * </pre>
   *
   * <code>optional .tensorflow.TensorShapeProto shape = 2;</code>
   */
  org.tensorflow.framework.TensorShapeProto getShape();
  /**
   * <pre>
   * Shape of the tensor.
   * </pre>
   *
   * <code>optional .tensorflow.TensorShapeProto shape = 2;</code>
   */
  org.tensorflow.framework.TensorShapeProtoOrBuilder getShapeOrBuilder();

  /**
   * <pre>
   * Information about the size and allocator used for the data
   * </pre>
   *
   * <code>optional .tensorflow.AllocationDescription allocation_description = 4;</code>
   */
  boolean hasAllocationDescription();
  /**
   * <pre>
   * Information about the size and allocator used for the data
   * </pre>
   *
   * <code>optional .tensorflow.AllocationDescription allocation_description = 4;</code>
   */
  AllocationDescription getAllocationDescription();
  /**
   * <pre>
   * Information about the size and allocator used for the data
   * </pre>
   *
   * <code>optional .tensorflow.AllocationDescription allocation_description = 4;</code>
   */
  AllocationDescriptionOrBuilder getAllocationDescriptionOrBuilder();
}
