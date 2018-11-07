// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/product_search_service.proto

package com.google.cloud.vision.v1;

public interface UpdateProductSetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.UpdateProductSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ProductSet resource which replaces the one on the server.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ProductSet product_set = 1;</code>
   */
  boolean hasProductSet();
  /**
   * <pre>
   * The ProductSet resource which replaces the one on the server.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ProductSet product_set = 1;</code>
   */
  com.google.cloud.vision.v1.ProductSet getProductSet();
  /**
   * <pre>
   * The ProductSet resource which replaces the one on the server.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.ProductSet product_set = 1;</code>
   */
  com.google.cloud.vision.v1.ProductSetOrBuilder getProductSetOrBuilder();

  /**
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
   * update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask path is `display_name`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
   * update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask path is `display_name`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The [FieldMask][google.protobuf.FieldMask] that specifies which fields to
   * update.
   * If update_mask isn't specified, all mutable fields are to be updated.
   * Valid mask path is `display_name`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}