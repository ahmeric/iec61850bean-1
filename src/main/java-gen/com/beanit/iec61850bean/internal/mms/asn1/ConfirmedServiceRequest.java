/*
 * This class file was automatically generated by ASN1bean (http://www.beanit.com)
 */

package com.beanit.iec61850bean.internal.mms.asn1;

import com.beanit.asn1bean.ber.BerLength;
import com.beanit.asn1bean.ber.BerTag;
import com.beanit.asn1bean.ber.ReverseByteArrayOutputStream;
import com.beanit.asn1bean.ber.types.BerType;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class ConfirmedServiceRequest implements BerType, Serializable {

  private static final long serialVersionUID = 1L;

  private byte[] code = null;
  private GetNameListRequest getNameList = null;
  private ReadRequest read = null;
  private WriteRequest write = null;
  private GetVariableAccessAttributesRequest getVariableAccessAttributes = null;
  private DefineNamedVariableListRequest defineNamedVariableList = null;
  private GetNamedVariableListAttributesRequest getNamedVariableListAttributes = null;
  private DeleteNamedVariableListRequest deleteNamedVariableList = null;
  private FileOpenRequest fileOpen = null;
  private FileReadRequest fileRead = null;
  private FileCloseRequest fileClose = null;
  private FileDeleteRequest fileDelete = null;
  private FileDirectoryRequest fileDirectory = null;

  public ConfirmedServiceRequest() {}

  public ConfirmedServiceRequest(byte[] code) {
    this.code = code;
  }

  public GetNameListRequest getGetNameList() {
    return getNameList;
  }

  public void setGetNameList(GetNameListRequest getNameList) {
    this.getNameList = getNameList;
  }

  public ReadRequest getRead() {
    return read;
  }

  public void setRead(ReadRequest read) {
    this.read = read;
  }

  public WriteRequest getWrite() {
    return write;
  }

  public void setWrite(WriteRequest write) {
    this.write = write;
  }

  public GetVariableAccessAttributesRequest getGetVariableAccessAttributes() {
    return getVariableAccessAttributes;
  }

  public void setGetVariableAccessAttributes(
      GetVariableAccessAttributesRequest getVariableAccessAttributes) {
    this.getVariableAccessAttributes = getVariableAccessAttributes;
  }

  public DefineNamedVariableListRequest getDefineNamedVariableList() {
    return defineNamedVariableList;
  }

  public void setDefineNamedVariableList(DefineNamedVariableListRequest defineNamedVariableList) {
    this.defineNamedVariableList = defineNamedVariableList;
  }

  public GetNamedVariableListAttributesRequest getGetNamedVariableListAttributes() {
    return getNamedVariableListAttributes;
  }

  public void setGetNamedVariableListAttributes(
      GetNamedVariableListAttributesRequest getNamedVariableListAttributes) {
    this.getNamedVariableListAttributes = getNamedVariableListAttributes;
  }

  public DeleteNamedVariableListRequest getDeleteNamedVariableList() {
    return deleteNamedVariableList;
  }

  public void setDeleteNamedVariableList(DeleteNamedVariableListRequest deleteNamedVariableList) {
    this.deleteNamedVariableList = deleteNamedVariableList;
  }

  public FileOpenRequest getFileOpen() {
    return fileOpen;
  }

  public void setFileOpen(FileOpenRequest fileOpen) {
    this.fileOpen = fileOpen;
  }

  public FileReadRequest getFileRead() {
    return fileRead;
  }

  public void setFileRead(FileReadRequest fileRead) {
    this.fileRead = fileRead;
  }

  public FileCloseRequest getFileClose() {
    return fileClose;
  }

  public void setFileClose(FileCloseRequest fileClose) {
    this.fileClose = fileClose;
  }

  public FileDeleteRequest getFileDelete() {
    return fileDelete;
  }

  public void setFileDelete(FileDeleteRequest fileDelete) {
    this.fileDelete = fileDelete;
  }

  public FileDirectoryRequest getFileDirectory() {
    return fileDirectory;
  }

  public void setFileDirectory(FileDirectoryRequest fileDirectory) {
    this.fileDirectory = fileDirectory;
  }

  @Override
  public int encode(OutputStream reverseOS) throws IOException {

    if (code != null) {
      reverseOS.write(code);
      return code.length;
    }

    int codeLength = 0;
    int sublength;

    if (fileDirectory != null) {
      codeLength += fileDirectory.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 77
      reverseOS.write(0x4D);
      reverseOS.write(0xBF);
      codeLength += 2;
      return codeLength;
    }

    if (fileDelete != null) {
      codeLength += fileDelete.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 76
      reverseOS.write(0x4C);
      reverseOS.write(0xBF);
      codeLength += 2;
      return codeLength;
    }

    if (fileClose != null) {
      codeLength += fileClose.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, PRIMITIVE, 74
      reverseOS.write(0x4A);
      reverseOS.write(0x9F);
      codeLength += 2;
      return codeLength;
    }

    if (fileRead != null) {
      codeLength += fileRead.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, PRIMITIVE, 73
      reverseOS.write(0x49);
      reverseOS.write(0x9F);
      codeLength += 2;
      return codeLength;
    }

    if (fileOpen != null) {
      codeLength += fileOpen.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 72
      reverseOS.write(0x48);
      reverseOS.write(0xBF);
      codeLength += 2;
      return codeLength;
    }

    if (deleteNamedVariableList != null) {
      codeLength += deleteNamedVariableList.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 13
      reverseOS.write(0xAD);
      codeLength += 1;
      return codeLength;
    }

    if (getNamedVariableListAttributes != null) {
      sublength = getNamedVariableListAttributes.encode(reverseOS);
      codeLength += sublength;
      codeLength += BerLength.encodeLength(reverseOS, sublength);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 12
      reverseOS.write(0xAC);
      codeLength += 1;
      return codeLength;
    }

    if (defineNamedVariableList != null) {
      codeLength += defineNamedVariableList.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 11
      reverseOS.write(0xAB);
      codeLength += 1;
      return codeLength;
    }

    if (getVariableAccessAttributes != null) {
      sublength = getVariableAccessAttributes.encode(reverseOS);
      codeLength += sublength;
      codeLength += BerLength.encodeLength(reverseOS, sublength);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 6
      reverseOS.write(0xA6);
      codeLength += 1;
      return codeLength;
    }

    if (write != null) {
      codeLength += write.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 5
      reverseOS.write(0xA5);
      codeLength += 1;
      return codeLength;
    }

    if (read != null) {
      codeLength += read.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 4
      reverseOS.write(0xA4);
      codeLength += 1;
      return codeLength;
    }

    if (getNameList != null) {
      codeLength += getNameList.encode(reverseOS, false);
      // write tag: CONTEXT_CLASS, CONSTRUCTED, 1
      reverseOS.write(0xA1);
      codeLength += 1;
      return codeLength;
    }

    throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
  }

  @Override
  public int decode(InputStream is) throws IOException {
    return decode(is, null);
  }

  public int decode(InputStream is, BerTag berTag) throws IOException {

    int tlvByteCount = 0;
    boolean tagWasPassed = (berTag != null);

    if (berTag == null) {
      berTag = new BerTag();
      tlvByteCount += berTag.decode(is);
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
      getNameList = new GetNameListRequest();
      tlvByteCount += getNameList.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
      read = new ReadRequest();
      tlvByteCount += read.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
      write = new WriteRequest();
      tlvByteCount += write.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
      BerLength length = new BerLength();
      tlvByteCount += length.decode(is);
      getVariableAccessAttributes = new GetVariableAccessAttributesRequest();
      tlvByteCount += getVariableAccessAttributes.decode(is, null);
      tlvByteCount += length.readEocIfIndefinite(is);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 11)) {
      defineNamedVariableList = new DefineNamedVariableListRequest();
      tlvByteCount += defineNamedVariableList.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 12)) {
      BerLength length = new BerLength();
      tlvByteCount += length.decode(is);
      getNamedVariableListAttributes = new GetNamedVariableListAttributesRequest();
      tlvByteCount += getNamedVariableListAttributes.decode(is, null);
      tlvByteCount += length.readEocIfIndefinite(is);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 13)) {
      deleteNamedVariableList = new DeleteNamedVariableListRequest();
      tlvByteCount += deleteNamedVariableList.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 72)) {
      fileOpen = new FileOpenRequest();
      tlvByteCount += fileOpen.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 73)) {
      fileRead = new FileReadRequest();
      tlvByteCount += fileRead.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 74)) {
      fileClose = new FileCloseRequest();
      tlvByteCount += fileClose.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 76)) {
      fileDelete = new FileDeleteRequest();
      tlvByteCount += fileDelete.decode(is, false);
      return tlvByteCount;
    }

    if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 77)) {
      fileDirectory = new FileDirectoryRequest();
      tlvByteCount += fileDirectory.decode(is, false);
      return tlvByteCount;
    }

    if (tagWasPassed) {
      return 0;
    }

    throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
  }

  public void encodeAndSave(int encodingSizeGuess) throws IOException {
    ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
    encode(reverseOS);
    code = reverseOS.getArray();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    appendAsString(sb, 0);
    return sb.toString();
  }

  public void appendAsString(StringBuilder sb, int indentLevel) {

    if (getNameList != null) {
      sb.append("getNameList: ");
      getNameList.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (read != null) {
      sb.append("read: ");
      read.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (write != null) {
      sb.append("write: ");
      write.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (getVariableAccessAttributes != null) {
      sb.append("getVariableAccessAttributes: ");
      getVariableAccessAttributes.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (defineNamedVariableList != null) {
      sb.append("defineNamedVariableList: ");
      defineNamedVariableList.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (getNamedVariableListAttributes != null) {
      sb.append("getNamedVariableListAttributes: ");
      getNamedVariableListAttributes.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (deleteNamedVariableList != null) {
      sb.append("deleteNamedVariableList: ");
      deleteNamedVariableList.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (fileOpen != null) {
      sb.append("fileOpen: ");
      fileOpen.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (fileRead != null) {
      sb.append("fileRead: ").append(fileRead);
      return;
    }

    if (fileClose != null) {
      sb.append("fileClose: ").append(fileClose);
      return;
    }

    if (fileDelete != null) {
      sb.append("fileDelete: ");
      fileDelete.appendAsString(sb, indentLevel + 1);
      return;
    }

    if (fileDirectory != null) {
      sb.append("fileDirectory: ");
      fileDirectory.appendAsString(sb, indentLevel + 1);
      return;
    }

    sb.append("<none>");
  }
}
