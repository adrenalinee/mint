package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class StackTraceElement   {
  
  private Boolean nativeMethod = null;
  private String methodName = null;
  private Integer lineNumber = null;
  private String fileName = null;
  private String className = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("nativeMethod")
  @com.fasterxml.jackson.annotation.JsonProperty("nativeMethod")
  public Boolean getNativeMethod() {
    return nativeMethod;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isNativeMethod() {
    return nativeMethod == null ? false : nativeMethod;
  }
  
  /**
   **/
  public void setNativeMethod(Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("methodName")
  @com.fasterxml.jackson.annotation.JsonProperty("methodName")
  public String getMethodName() {
    return methodName;
  }
  
  /**
   **/
  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lineNumber")
  @com.fasterxml.jackson.annotation.JsonProperty("lineNumber")
  public Integer getLineNumber() {
    return lineNumber;
  }
  
  /**
   **/
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("fileName")
  @com.fasterxml.jackson.annotation.JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  
  /**
   **/
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("className")
  @com.fasterxml.jackson.annotation.JsonProperty("className")
  public String getClassName() {
    return className;
  }
  
  /**
   **/
  public void setClassName(String className) {
    this.className = className;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StackTraceElement stackTraceElement = (StackTraceElement) o;
    return Objects.equals(this.nativeMethod, stackTraceElement.nativeMethod) &&
        Objects.equals(this.methodName, stackTraceElement.methodName) &&
        Objects.equals(this.lineNumber, stackTraceElement.lineNumber) &&
        Objects.equals(this.fileName, stackTraceElement.fileName) &&
        Objects.equals(this.className, stackTraceElement.className);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nativeMethod, methodName, lineNumber, fileName, className);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StackTraceElement {\n");
    
    sb.append("    nativeMethod: ").append(toIndentedString(nativeMethod)).append("\n");
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static StackTraceElementBuilder builder() {
    return new StackTraceElementBuilder();
  }

  public static class StackTraceElementBuilder {

    private Boolean nativeMethod = null;
    private String methodName = null;
    private Integer lineNumber = null;
    private String fileName = null;
    private String className = null;
    

    StackTraceElementBuilder() {
    }

    /**
     **/
    public StackTraceElementBuilder nativeMethod(Boolean nativeMethod) {
      this.nativeMethod = nativeMethod;
      return this;
    }

    /**
     **/
    public StackTraceElementBuilder methodName(String methodName) {
      this.methodName = methodName;
      return this;
    }

    /**
     **/
    public StackTraceElementBuilder lineNumber(Integer lineNumber) {
      this.lineNumber = lineNumber;
      return this;
    }

    /**
     **/
    public StackTraceElementBuilder fileName(String fileName) {
      this.fileName = fileName;
      return this;
    }

    /**
     **/
    public StackTraceElementBuilder className(String className) {
      this.className = className;
      return this;
    }


    public StackTraceElement build() {
      StackTraceElement stackTraceElement = new StackTraceElement();
      stackTraceElement.setNativeMethod(this.nativeMethod);
      stackTraceElement.setMethodName(this.methodName);
      stackTraceElement.setLineNumber(this.lineNumber);
      stackTraceElement.setFileName(this.fileName);
      stackTraceElement.setClassName(this.className);
      return stackTraceElement;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class StackTraceElementBuilder {\n");
      
      sb.append("    nativeMethod: ").append(toIndentedString(nativeMethod)).append("\n");
      sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
      sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
      sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
      sb.append("    className: ").append(toIndentedString(className)).append("\n");
      sb.append("}");
      return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
      if (o == null) {
        return "null";
      }
      return o.toString().replace("\n", "\n    ");
    }
  }
}

