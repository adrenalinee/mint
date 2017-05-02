package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.member_api.model.StackTraceElement;
import com.coupang.apigateway.services.member_api.model.Throwable;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class MemberApiException   {
  
  private List<Throwable> suppressed = new ArrayList<Throwable>();
  private List<StackTraceElement> stackTrace = new ArrayList<StackTraceElement>();
  private String message = null;
  private Boolean logSkippable = null;
  private String localizedMessage = null;
  private String code = null;
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
  @org.codehaus.jackson.annotate.JsonProperty("logSkippable")
  @com.fasterxml.jackson.annotation.JsonProperty("logSkippable")
  public Boolean getLogSkippable() {
    return logSkippable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isLogSkippable() {
    return logSkippable == null ? false : logSkippable;
  }
  
  /**
   **/
  public void setLogSkippable(Boolean logSkippable) {
    this.logSkippable = logSkippable;
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
  @org.codehaus.jackson.annotate.JsonProperty("code")
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  public String getCode() {
    return code;
  }
  
  /**
   **/
  public void setCode(String code) {
    this.code = code;
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
    MemberApiException memberApiException = (MemberApiException) o;
    return Objects.equals(this.suppressed, memberApiException.suppressed) &&
        Objects.equals(this.stackTrace, memberApiException.stackTrace) &&
        Objects.equals(this.message, memberApiException.message) &&
        Objects.equals(this.logSkippable, memberApiException.logSkippable) &&
        Objects.equals(this.localizedMessage, memberApiException.localizedMessage) &&
        Objects.equals(this.code, memberApiException.code) &&
        Objects.equals(this.cause, memberApiException.cause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suppressed, stackTrace, message, logSkippable, localizedMessage, code, cause);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberApiException {\n");
    
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    logSkippable: ").append(toIndentedString(logSkippable)).append("\n");
    sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

  public static MemberApiExceptionBuilder builder() {
    return new MemberApiExceptionBuilder();
  }

  public static class MemberApiExceptionBuilder {

    private List<Throwable> suppressed = new ArrayList<Throwable>();
    private List<StackTraceElement> stackTrace = new ArrayList<StackTraceElement>();
    private String message = null;
    private Boolean logSkippable = null;
    private String localizedMessage = null;
    private String code = null;
    private Throwable cause = null;
    

    MemberApiExceptionBuilder() {
    }

    /**
     **/
    public MemberApiExceptionBuilder suppressed(List<Throwable> suppressed) {
      this.suppressed = suppressed;
      return this;
    }

    /**
     **/
    public MemberApiExceptionBuilder stackTrace(List<StackTraceElement> stackTrace) {
      this.stackTrace = stackTrace;
      return this;
    }

    /**
     **/
    public MemberApiExceptionBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public MemberApiExceptionBuilder logSkippable(Boolean logSkippable) {
      this.logSkippable = logSkippable;
      return this;
    }

    /**
     **/
    public MemberApiExceptionBuilder localizedMessage(String localizedMessage) {
      this.localizedMessage = localizedMessage;
      return this;
    }

    /**
     **/
    public MemberApiExceptionBuilder code(String code) {
      this.code = code;
      return this;
    }

    /**
     **/
    public MemberApiExceptionBuilder cause(Throwable cause) {
      this.cause = cause;
      return this;
    }


    public MemberApiException build() {
      MemberApiException memberApiException = new MemberApiException();
      memberApiException.setSuppressed(this.suppressed);
      memberApiException.setStackTrace(this.stackTrace);
      memberApiException.setMessage(this.message);
      memberApiException.setLogSkippable(this.logSkippable);
      memberApiException.setLocalizedMessage(this.localizedMessage);
      memberApiException.setCode(this.code);
      memberApiException.setCause(this.cause);
      return memberApiException;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MemberApiExceptionBuilder {\n");
      
      sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
      sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
      sb.append("    logSkippable: ").append(toIndentedString(logSkippable)).append("\n");
      sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
      sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

