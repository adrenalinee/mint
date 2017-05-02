package com.coupang.apigateway.services.mapi.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.625+09:00")
public class ResponseBase   {
  
  private String rMessage = null;
  private Object rData = null;
  private String rCode = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rMessage")
  @com.fasterxml.jackson.annotation.JsonProperty("rMessage")
  public String getRMessage() {
    return rMessage;
  }
  
  /**
   **/
  public void setRMessage(String rMessage) {
    this.rMessage = rMessage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rData")
  @com.fasterxml.jackson.annotation.JsonProperty("rData")
  public Object getRData() {
    return rData;
  }
  
  /**
   **/
  public void setRData(Object rData) {
    this.rData = rData;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rCode")
  @com.fasterxml.jackson.annotation.JsonProperty("rCode")
  public String getRCode() {
    return rCode;
  }
  
  /**
   **/
  public void setRCode(String rCode) {
    this.rCode = rCode;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBase responseBase = (ResponseBase) o;
    return Objects.equals(this.rMessage, responseBase.rMessage) &&
        Objects.equals(this.rData, responseBase.rData) &&
        Objects.equals(this.rCode, responseBase.rCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rMessage, rData, rCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBase {\n");
    
    sb.append("    rMessage: ").append(toIndentedString(rMessage)).append("\n");
    sb.append("    rData: ").append(toIndentedString(rData)).append("\n");
    sb.append("    rCode: ").append(toIndentedString(rCode)).append("\n");
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

  public static ResponseBaseBuilder builder() {
    return new ResponseBaseBuilder();
  }

  public static class ResponseBaseBuilder {

    private String rMessage = null;
    private Object rData = null;
    private String rCode = null;
    

    ResponseBaseBuilder() {
    }

    /**
     **/
    public ResponseBaseBuilder rMessage(String rMessage) {
      this.rMessage = rMessage;
      return this;
    }

    /**
     **/
    public ResponseBaseBuilder rData(Object rData) {
      this.rData = rData;
      return this;
    }

    /**
     **/
    public ResponseBaseBuilder rCode(String rCode) {
      this.rCode = rCode;
      return this;
    }


    public ResponseBase build() {
      ResponseBase responseBase = new ResponseBase();
      responseBase.setRMessage(this.rMessage);
      responseBase.setRData(this.rData);
      responseBase.setRCode(this.rCode);
      return responseBase;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ResponseBaseBuilder {\n");
      
      sb.append("    rMessage: ").append(toIndentedString(rMessage)).append("\n");
      sb.append("    rData: ").append(toIndentedString(rData)).append("\n");
      sb.append("    rCode: ").append(toIndentedString(rCode)).append("\n");
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

