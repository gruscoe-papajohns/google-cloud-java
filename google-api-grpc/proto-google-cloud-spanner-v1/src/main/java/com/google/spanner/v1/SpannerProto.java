// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

public final class SpannerProto {
  private SpannerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_CreateSessionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_CreateSessionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_Session_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_Session_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_Session_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_Session_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_GetSessionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_GetSessionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_ListSessionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ListSessionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_ListSessionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ListSessionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_DeleteSessionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_DeleteSessionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_ExecuteSqlRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ExecuteSqlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_ExecuteSqlRequest_ParamTypesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ExecuteSqlRequest_ParamTypesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_PartitionOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_PartitionOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_PartitionQueryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_PartitionQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_PartitionQueryRequest_ParamTypesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_PartitionQueryRequest_ParamTypesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_PartitionReadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_PartitionReadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_Partition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_Partition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_PartitionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_PartitionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_ReadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ReadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_BeginTransactionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_BeginTransactionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_CommitRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_CommitRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_CommitResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_CommitResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_spanner_v1_RollbackRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_RollbackRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037google/spanner/v1/spanner.proto\022\021googl" +
      "e.spanner.v1\032\034google/api/annotations.pro" +
      "to\032\033google/protobuf/empty.proto\032\034google/" +
      "protobuf/struct.proto\032\037google/protobuf/t" +
      "imestamp.proto\032\034google/spanner/v1/keys.p" +
      "roto\032 google/spanner/v1/mutation.proto\032\"" +
      "google/spanner/v1/result_set.proto\032#goog" +
      "le/spanner/v1/transaction.proto\032\034google/" +
      "spanner/v1/type.proto\"U\n\024CreateSessionRe" +
      "quest\022\020\n\010database\030\001 \001(\t\022+\n\007session\030\002 \001(\013" +
      "2\032.google.spanner.v1.Session\"\356\001\n\007Session" +
      "\022\014\n\004name\030\001 \001(\t\0226\n\006labels\030\002 \003(\0132&.google." +
      "spanner.v1.Session.LabelsEntry\022/\n\013create" +
      "_time\030\003 \001(\0132\032.google.protobuf.Timestamp\022" +
      "=\n\031approximate_last_use_time\030\004 \001(\0132\032.goo" +
      "gle.protobuf.Timestamp\032-\n\013LabelsEntry\022\013\n" +
      "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"!\n\021GetSess" +
      "ionRequest\022\014\n\004name\030\001 \001(\t\"^\n\023ListSessions" +
      "Request\022\020\n\010database\030\001 \001(\t\022\021\n\tpage_size\030\002" +
      " \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t" +
      "\"]\n\024ListSessionsResponse\022,\n\010sessions\030\001 \003" +
      "(\0132\032.google.spanner.v1.Session\022\027\n\017next_p" +
      "age_token\030\002 \001(\t\"$\n\024DeleteSessionRequest\022" +
      "\014\n\004name\030\001 \001(\t\"\340\003\n\021ExecuteSqlRequest\022\017\n\007s" +
      "ession\030\001 \001(\t\022;\n\013transaction\030\002 \001(\0132&.goog" +
      "le.spanner.v1.TransactionSelector\022\013\n\003sql" +
      "\030\003 \001(\t\022\'\n\006params\030\004 \001(\0132\027.google.protobuf" +
      ".Struct\022I\n\013param_types\030\005 \003(\01324.google.sp" +
      "anner.v1.ExecuteSqlRequest.ParamTypesEnt" +
      "ry\022\024\n\014resume_token\030\006 \001(\014\022B\n\nquery_mode\030\007" +
      " \001(\0162..google.spanner.v1.ExecuteSqlReque" +
      "st.QueryMode\022\027\n\017partition_token\030\010 \001(\014\022\r\n" +
      "\005seqno\030\t \001(\003\032J\n\017ParamTypesEntry\022\013\n\003key\030\001" +
      " \001(\t\022&\n\005value\030\002 \001(\0132\027.google.spanner.v1." +
      "Type:\0028\001\".\n\tQueryMode\022\n\n\006NORMAL\020\000\022\010\n\004PLA" +
      "N\020\001\022\013\n\007PROFILE\020\002\"H\n\020PartitionOptions\022\034\n\024" +
      "partition_size_bytes\030\001 \001(\003\022\026\n\016max_partit" +
      "ions\030\002 \001(\003\"\366\002\n\025PartitionQueryRequest\022\017\n\007" +
      "session\030\001 \001(\t\022;\n\013transaction\030\002 \001(\0132&.goo" +
      "gle.spanner.v1.TransactionSelector\022\013\n\003sq" +
      "l\030\003 \001(\t\022\'\n\006params\030\004 \001(\0132\027.google.protobu" +
      "f.Struct\022M\n\013param_types\030\005 \003(\01328.google.s" +
      "panner.v1.PartitionQueryRequest.ParamTyp" +
      "esEntry\022>\n\021partition_options\030\006 \001(\0132#.goo" +
      "gle.spanner.v1.PartitionOptions\032J\n\017Param" +
      "TypesEntry\022\013\n\003key\030\001 \001(\t\022&\n\005value\030\002 \001(\0132\027" +
      ".google.spanner.v1.Type:\0028\001\"\377\001\n\024Partitio" +
      "nReadRequest\022\017\n\007session\030\001 \001(\t\022;\n\013transac" +
      "tion\030\002 \001(\0132&.google.spanner.v1.Transacti" +
      "onSelector\022\r\n\005table\030\003 \001(\t\022\r\n\005index\030\004 \001(\t" +
      "\022\017\n\007columns\030\005 \003(\t\022*\n\007key_set\030\006 \001(\0132\031.goo" +
      "gle.spanner.v1.KeySet\022>\n\021partition_optio" +
      "ns\030\t \001(\0132#.google.spanner.v1.PartitionOp" +
      "tions\"$\n\tPartition\022\027\n\017partition_token\030\001 " +
      "\001(\014\"z\n\021PartitionResponse\0220\n\npartitions\030\001" +
      " \003(\0132\034.google.spanner.v1.Partition\0223\n\013tr" +
      "ansaction\030\002 \001(\0132\036.google.spanner.v1.Tran" +
      "saction\"\364\001\n\013ReadRequest\022\017\n\007session\030\001 \001(\t" +
      "\022;\n\013transaction\030\002 \001(\0132&.google.spanner.v" +
      "1.TransactionSelector\022\r\n\005table\030\003 \001(\t\022\r\n\005" +
      "index\030\004 \001(\t\022\017\n\007columns\030\005 \003(\t\022*\n\007key_set\030" +
      "\006 \001(\0132\031.google.spanner.v1.KeySet\022\r\n\005limi" +
      "t\030\010 \001(\003\022\024\n\014resume_token\030\t \001(\014\022\027\n\017partiti" +
      "on_token\030\n \001(\014\"b\n\027BeginTransactionReques" +
      "t\022\017\n\007session\030\001 \001(\t\0226\n\007options\030\002 \001(\0132%.go" +
      "ogle.spanner.v1.TransactionOptions\"\302\001\n\rC" +
      "ommitRequest\022\017\n\007session\030\001 \001(\t\022\030\n\016transac" +
      "tion_id\030\002 \001(\014H\000\022G\n\026single_use_transactio" +
      "n\030\003 \001(\0132%.google.spanner.v1.TransactionO" +
      "ptionsH\000\022.\n\tmutations\030\004 \003(\0132\033.google.spa" +
      "nner.v1.MutationB\r\n\013transaction\"F\n\016Commi" +
      "tResponse\0224\n\020commit_timestamp\030\001 \001(\0132\032.go" +
      "ogle.protobuf.Timestamp\":\n\017RollbackReque" +
      "st\022\017\n\007session\030\001 \001(\t\022\026\n\016transaction_id\030\002 " +
      "\001(\0142\203\021\n\007Spanner\022\233\001\n\rCreateSession\022\'.goog" +
      "le.spanner.v1.CreateSessionRequest\032\032.goo" +
      "gle.spanner.v1.Session\"E\202\323\344\223\002?\":/v1/{dat" +
      "abase=projects/*/instances/*/databases/*" +
      "}/sessions:\001*\022\220\001\n\nGetSession\022$.google.sp" +
      "anner.v1.GetSessionRequest\032\032.google.span" +
      "ner.v1.Session\"@\202\323\344\223\002:\0228/v1/{name=projec" +
      "ts/*/instances/*/databases/*/sessions/*}" +
      "\022\243\001\n\014ListSessions\022&.google.spanner.v1.Li" +
      "stSessionsRequest\032\'.google.spanner.v1.Li" +
      "stSessionsResponse\"B\202\323\344\223\002<\022:/v1/{databas" +
      "e=projects/*/instances/*/databases/*}/se" +
      "ssions\022\222\001\n\rDeleteSession\022\'.google.spanne" +
      "r.v1.DeleteSessionRequest\032\026.google.proto" +
      "buf.Empty\"@\202\323\344\223\002:*8/v1/{name=projects/*/" +
      "instances/*/databases/*/sessions/*}\022\243\001\n\n" +
      "ExecuteSql\022$.google.spanner.v1.ExecuteSq" +
      "lRequest\032\034.google.spanner.v1.ResultSet\"Q" +
      "\202\323\344\223\002K\"F/v1/{session=projects/*/instance" +
      "s/*/databases/*/sessions/*}:executeSql:\001" +
      "*\022\276\001\n\023ExecuteStreamingSql\022$.google.spann" +
      "er.v1.ExecuteSqlRequest\032#.google.spanner" +
      ".v1.PartialResultSet\"Z\202\323\344\223\002T\"O/v1/{sessi" +
      "on=projects/*/instances/*/databases/*/se" +
      "ssions/*}:executeStreamingSql:\001*0\001\022\221\001\n\004R" +
      "ead\022\036.google.spanner.v1.ReadRequest\032\034.go" +
      "ogle.spanner.v1.ResultSet\"K\202\323\344\223\002E\"@/v1/{" +
      "session=projects/*/instances/*/databases" +
      "/*/sessions/*}:read:\001*\022\254\001\n\rStreamingRead" +
      "\022\036.google.spanner.v1.ReadRequest\032#.googl" +
      "e.spanner.v1.PartialResultSet\"T\202\323\344\223\002N\"I/" +
      "v1/{session=projects/*/instances/*/datab" +
      "ases/*/sessions/*}:streamingRead:\001*0\001\022\267\001" +
      "\n\020BeginTransaction\022*.google.spanner.v1.B" +
      "eginTransactionRequest\032\036.google.spanner." +
      "v1.Transaction\"W\202\323\344\223\002Q\"L/v1/{session=pro" +
      "jects/*/instances/*/databases/*/sessions" +
      "/*}:beginTransaction:\001*\022\234\001\n\006Commit\022 .goo" +
      "gle.spanner.v1.CommitRequest\032!.google.sp" +
      "anner.v1.CommitResponse\"M\202\323\344\223\002G\"B/v1/{se" +
      "ssion=projects/*/instances/*/databases/*" +
      "/sessions/*}:commit:\001*\022\227\001\n\010Rollback\022\".go" +
      "ogle.spanner.v1.RollbackRequest\032\026.google" +
      ".protobuf.Empty\"O\202\323\344\223\002I\"D/v1/{session=pr" +
      "ojects/*/instances/*/databases/*/session" +
      "s/*}:rollback:\001*\022\267\001\n\016PartitionQuery\022(.go" +
      "ogle.spanner.v1.PartitionQueryRequest\032$." +
      "google.spanner.v1.PartitionResponse\"U\202\323\344" +
      "\223\002O\"J/v1/{session=projects/*/instances/*" +
      "/databases/*/sessions/*}:partitionQuery:" +
      "\001*\022\264\001\n\rPartitionRead\022\'.google.spanner.v1" +
      ".PartitionReadRequest\032$.google.spanner.v" +
      "1.PartitionResponse\"T\202\323\344\223\002N\"I/v1/{sessio" +
      "n=projects/*/instances/*/databases/*/ses" +
      "sions/*}:partitionRead:\001*B\225\001\n\025com.google" +
      ".spanner.v1B\014SpannerProtoP\001Z8google.gola" +
      "ng.org/genproto/googleapis/spanner/v1;sp" +
      "anner\252\002\027Google.Cloud.Spanner.V1\312\002\027Google" +
      "\\Cloud\\Spanner\\V1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.spanner.v1.KeysProto.getDescriptor(),
          com.google.spanner.v1.MutationProto.getDescriptor(),
          com.google.spanner.v1.ResultSetProto.getDescriptor(),
          com.google.spanner.v1.TransactionProto.getDescriptor(),
          com.google.spanner.v1.TypeProto.getDescriptor(),
        }, assigner);
    internal_static_google_spanner_v1_CreateSessionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_spanner_v1_CreateSessionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_CreateSessionRequest_descriptor,
        new java.lang.String[] { "Database", "Session", });
    internal_static_google_spanner_v1_Session_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_spanner_v1_Session_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_Session_descriptor,
        new java.lang.String[] { "Name", "Labels", "CreateTime", "ApproximateLastUseTime", });
    internal_static_google_spanner_v1_Session_LabelsEntry_descriptor =
      internal_static_google_spanner_v1_Session_descriptor.getNestedTypes().get(0);
    internal_static_google_spanner_v1_Session_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_Session_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_spanner_v1_GetSessionRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_spanner_v1_GetSessionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_GetSessionRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_spanner_v1_ListSessionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_spanner_v1_ListSessionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_ListSessionsRequest_descriptor,
        new java.lang.String[] { "Database", "PageSize", "PageToken", "Filter", });
    internal_static_google_spanner_v1_ListSessionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_spanner_v1_ListSessionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_ListSessionsResponse_descriptor,
        new java.lang.String[] { "Sessions", "NextPageToken", });
    internal_static_google_spanner_v1_DeleteSessionRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_spanner_v1_DeleteSessionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_DeleteSessionRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_spanner_v1_ExecuteSqlRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_spanner_v1_ExecuteSqlRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_ExecuteSqlRequest_descriptor,
        new java.lang.String[] { "Session", "Transaction", "Sql", "Params", "ParamTypes", "ResumeToken", "QueryMode", "PartitionToken", "Seqno", });
    internal_static_google_spanner_v1_ExecuteSqlRequest_ParamTypesEntry_descriptor =
      internal_static_google_spanner_v1_ExecuteSqlRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_spanner_v1_ExecuteSqlRequest_ParamTypesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_ExecuteSqlRequest_ParamTypesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_spanner_v1_PartitionOptions_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_spanner_v1_PartitionOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_PartitionOptions_descriptor,
        new java.lang.String[] { "PartitionSizeBytes", "MaxPartitions", });
    internal_static_google_spanner_v1_PartitionQueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_spanner_v1_PartitionQueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_PartitionQueryRequest_descriptor,
        new java.lang.String[] { "Session", "Transaction", "Sql", "Params", "ParamTypes", "PartitionOptions", });
    internal_static_google_spanner_v1_PartitionQueryRequest_ParamTypesEntry_descriptor =
      internal_static_google_spanner_v1_PartitionQueryRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_spanner_v1_PartitionQueryRequest_ParamTypesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_PartitionQueryRequest_ParamTypesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_spanner_v1_PartitionReadRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_spanner_v1_PartitionReadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_PartitionReadRequest_descriptor,
        new java.lang.String[] { "Session", "Transaction", "Table", "Index", "Columns", "KeySet", "PartitionOptions", });
    internal_static_google_spanner_v1_Partition_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_spanner_v1_Partition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_Partition_descriptor,
        new java.lang.String[] { "PartitionToken", });
    internal_static_google_spanner_v1_PartitionResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_spanner_v1_PartitionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_PartitionResponse_descriptor,
        new java.lang.String[] { "Partitions", "Transaction", });
    internal_static_google_spanner_v1_ReadRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_spanner_v1_ReadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_ReadRequest_descriptor,
        new java.lang.String[] { "Session", "Transaction", "Table", "Index", "Columns", "KeySet", "Limit", "ResumeToken", "PartitionToken", });
    internal_static_google_spanner_v1_BeginTransactionRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_spanner_v1_BeginTransactionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_BeginTransactionRequest_descriptor,
        new java.lang.String[] { "Session", "Options", });
    internal_static_google_spanner_v1_CommitRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_spanner_v1_CommitRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_CommitRequest_descriptor,
        new java.lang.String[] { "Session", "TransactionId", "SingleUseTransaction", "Mutations", "Transaction", });
    internal_static_google_spanner_v1_CommitResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_google_spanner_v1_CommitResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_CommitResponse_descriptor,
        new java.lang.String[] { "CommitTimestamp", });
    internal_static_google_spanner_v1_RollbackRequest_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_google_spanner_v1_RollbackRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_spanner_v1_RollbackRequest_descriptor,
        new java.lang.String[] { "Session", "TransactionId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.spanner.v1.KeysProto.getDescriptor();
    com.google.spanner.v1.MutationProto.getDescriptor();
    com.google.spanner.v1.ResultSetProto.getDescriptor();
    com.google.spanner.v1.TransactionProto.getDescriptor();
    com.google.spanner.v1.TypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}