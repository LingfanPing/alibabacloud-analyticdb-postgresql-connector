// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: adbpgss.proto

package org.apache.flink.connector.jdbc.table.sink.api;

public interface TablesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.Tables)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.TableInfo Tables = 1;</code>
   */
  java.util.List<org.apache.flink.connector.jdbc.table.sink.api.TableInfo> 
      getTablesList();
  /**
   * <code>repeated .api.TableInfo Tables = 1;</code>
   */
  org.apache.flink.connector.jdbc.table.sink.api.TableInfo getTables(int index);
  /**
   * <code>repeated .api.TableInfo Tables = 1;</code>
   */
  int getTablesCount();
  /**
   * <code>repeated .api.TableInfo Tables = 1;</code>
   */
  java.util.List<? extends org.apache.flink.connector.jdbc.table.sink.api.TableInfoOrBuilder> 
      getTablesOrBuilderList();
  /**
   * <code>repeated .api.TableInfo Tables = 1;</code>
   */
  org.apache.flink.connector.jdbc.table.sink.api.TableInfoOrBuilder getTablesOrBuilder(
      int index);
}
