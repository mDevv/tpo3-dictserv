// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Communication.proto

package com.mdevv.tpo3.common.protobuf;

public interface TranslationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TranslationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string source_word = 1;</code>
   * @return The sourceWord.
   */
  java.lang.String getSourceWord();
  /**
   * <code>string source_word = 1;</code>
   * @return The bytes for sourceWord.
   */
  com.google.protobuf.ByteString
      getSourceWordBytes();

  /**
   * <code>string translation_language = 2;</code>
   * @return The translationLanguage.
   */
  java.lang.String getTranslationLanguage();
  /**
   * <code>string translation_language = 2;</code>
   * @return The bytes for translationLanguage.
   */
  com.google.protobuf.ByteString
      getTranslationLanguageBytes();

  /**
   * <code>uint32 client_port = 3;</code>
   * @return The clientPort.
   */
  int getClientPort();
}
