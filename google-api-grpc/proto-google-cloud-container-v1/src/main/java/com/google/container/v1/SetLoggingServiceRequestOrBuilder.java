// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface SetLoggingServiceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.SetLoggingServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getProjectId();
  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2;</code>
   */
  java.lang.String getZone();
  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2;</code>
   */
  com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getClusterId();
  /**
   * <pre>
   * Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getClusterIdBytes();

  /**
   * <pre>
   * The logging service the cluster should use to write metrics.
   * Currently available options:
   * * "logging.googleapis.com" - the Google Cloud Logging service
   * * "none" - no metrics will be exported from the cluster
   * </pre>
   *
   * <code>string logging_service = 4;</code>
   */
  java.lang.String getLoggingService();
  /**
   * <pre>
   * The logging service the cluster should use to write metrics.
   * Currently available options:
   * * "logging.googleapis.com" - the Google Cloud Logging service
   * * "none" - no metrics will be exported from the cluster
   * </pre>
   *
   * <code>string logging_service = 4;</code>
   */
  com.google.protobuf.ByteString
      getLoggingServiceBytes();

  /**
   * <pre>
   * The name (project, location, cluster) of the cluster to set logging.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
   * </pre>
   *
   * <code>string name = 5;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name (project, location, cluster) of the cluster to set logging.
   * Specified in the format 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;'.
   * </pre>
   *
   * <code>string name = 5;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}