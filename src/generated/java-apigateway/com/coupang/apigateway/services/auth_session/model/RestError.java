package com.coupang.apigateway.services.auth_session.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.932+09:00")
public class RestError   {
  
  private String message = null;
  private String code = null;

  
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestError restError = (RestError) o;
    return Objects.equals(this.message, restError.message) &&
        Objects.equals(this.code, restError.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestError {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

  public static RestErrorBuilder builder() {
    return new RestErrorBuilder();
  }

  public static class RestErrorBuilder {

    private String message = null;
    private String code = null;
    

    RestErrorBuilder() {
    }

    /**
     **/
    public RestErrorBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public RestErrorBuilder code(String code) {
      this.code = code;
      return this;
    }


    public RestError build() {
      RestError restError = new RestError();
      restError.setMessage(this.message);
      restError.setCode(this.code);
      return restError;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RestErrorBuilder {\n");
      
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
      sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

