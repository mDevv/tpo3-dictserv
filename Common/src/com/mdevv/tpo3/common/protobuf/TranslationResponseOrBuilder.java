// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Communication.proto

package com.mdevv.tpo3.common.protobuf;

public interface TranslationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TranslationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.Status status = 1;</code>
   * @return The status.
   */
  com.mdevv.tpo3.common.protobuf.Status getStatus();

  /**
   * <code>string source_word = 2;</code>
   * @return The sourceWord.
   */
  java.lang.String getSourceWord();
  /**
   * <code>string source_word = 2;</code>
   * @return The bytes for sourceWord.
   */
  com.google.protobuf.ByteString
      getSourceWordBytes();

  /**
   * <code>string translated_word = 3;</code>
   * @return The translatedWord.
   */
  java.lang.String getTranslatedWord();
  /**
   * <code>string translated_word = 3;</code>
   * @return The bytes for translatedWord.
   */
  com.google.protobuf.ByteString
      getTranslatedWordBytes();

  /**
   * <code>string translation_language = 4;</code>
   * @return The translationLanguage.
   */
  java.lang.String getTranslationLanguage();
  /**
   * <code>string translation_language = 4;</code>
   * @return The bytes for translationLanguage.
   */
  com.google.protobuf.ByteString
      getTranslationLanguageBytes();
}
