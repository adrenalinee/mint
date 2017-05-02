package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.member_api.model.StackTraceElement;
import com.coupang.apigateway.services.member_api.model.Throwable;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class Throwable   {
  
  private List<Throwable> suppressed = new ArrayList<Throwable>();
  private List<StackTraceElement> stackTrace = new ArrayList<StackTraceElement>();
  private String message = null;
  private String localizedMessage = null;
  private Throwable cause = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("suppressed")
  @com.fasterxml.jackson.annotation.JsonProperty("suppressed")
  public List<Throwable> getSuppressed() {
    return suppressed;
  }
  
  /**
   **/
  public void setSuppressed(List<Throwable> suppressed) {
    this.suppressed = suppressed;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("stackTrace")
  @com.fasterxml.jackson.annotation.JsonProperty("stackTrace")
  public List<StackTraceElement> getStackTrace() {
    return stackTrace;
  }
  
  /**
   **/
  public void setStackTrace(List<StackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("message")
  @com.fasterxml.jackson.annotation.JsonProperty("message")
  public String getMessage() {
    return message;
  }
  
  /**
   **/
  public void setMessage(String message) {
    this.message = message;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("localizedMessage")
  @com.fasterxml.jackson.annotation.JsonProperty("localizedMessage")
  public String getLocalizedMessage() {
    return localizedMessage;
  }
  
  /**
   **/
  public void setLocalizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cause")
  @com.fasterxml.jackson.annotation.JsonProperty("cause")
  public Throwable getCause() {
    return cause;
  }
  
  /**
   **/
  public void setCause(Throwable cause) {
    this.cause = cause;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Throwable throwable = (Throwable) o;
    return Objects.equals(this.suppressed, throwable.suppressed) &&
        Objects.equals(this.stackTrace, throwable.stackTrace) &&
        Objects.equals(this.message, throwable.message) &&
        Objects.equals(this.localizedMessage, throwable.localizedMessage) &&
        Objects.equals(this.cause, throwable.cause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suppressed, stackTrace, message, localizedMessage, cause);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Throwable {\n");
    
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
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

  public static ThrowableBuilder builder() {
    return new ThrowableBuilder();
  }

  public static class ThrowableBuilder {

    private List<Throwable> suppressed = new ArrayList<Throwable>();
    private List<StackTraceElement> stackTrace = new ArrayList<StackTraceElement>();
    private String message = null;
    private String localizedMessage = null;
    private Throwable cause = null;
    

    ThrowableBuilder() {
    }

    /**
     **/
    public ThrowableBuilder suppressed(List<Throwable> suppressed) {
      this.suppressed = suppressed;
      return this;
    }

    /**
     **/
    public ThrowableBuilder stackTrace(List<StackTraceElement> stackTrace) {
      this.stackTrace = stackTrace;
      return this;
    }

    /**
     **/
    public ThrowableBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public ThrowableBuilder localizedMessage(String localizedMessage) {
      this.localizedMessage = localizedMessage;
      return this;
    }

    /**
     **/
    public ThrowableBuilder cause(Throwable cause) {
      this.cause = cause;
      return this;
    }


    public Throwable build() {
      Throwable throwable = new Throwable();
      throwable.setSuppressed(this.suppressed);
      throwable.setStackTrace(this.stackTrace);
      throwable.setMessage(this.message);
      throwable.setLocalizedMessage(this.localizedMessage);
      throwable.setCause(this.cause);
      return throwable;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ThrowableBuilder {\n");
      
      sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
      sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
      sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
      sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
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

