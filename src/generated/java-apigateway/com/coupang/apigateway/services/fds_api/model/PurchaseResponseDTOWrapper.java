package com.coupang.apigateway.services.fds_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.fds_api.model.PurchaseResponseDTO;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.579+09:00")
public class PurchaseResponseDTOWrapper   {
  


  public enum StatusEnum {
    SUCCESS("SUCCESS"),
    GENERIC_ERROR("GENERIC_ERROR");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;
  private PurchaseResponseDTO result = null;
  private Boolean ok = null;
  private String message = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("status")
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  
  /**
   **/
  public void setStatus(StatusEnum status) {
    this.status = status;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("result")
  @com.fasterxml.jackson.annotation.JsonProperty("result")
  public PurchaseResponseDTO getResult() {
    return result;
  }
  
  /**
   **/
  public void setResult(PurchaseResponseDTO result) {
    this.result = result;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ok")
  @com.fasterxml.jackson.annotation.JsonProperty("ok")
  public Boolean getOk() {
    return ok;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isOk() {
    return ok == null ? false : ok;
  }
  
  /**
   **/
  public void setOk(Boolean ok) {
    this.ok = ok;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseResponseDTOWrapper purchaseResponseDTOWrapper = (PurchaseResponseDTOWrapper) o;
    return Objects.equals(this.status, purchaseResponseDTOWrapper.status) &&
        Objects.equals(this.result, purchaseResponseDTOWrapper.result) &&
        Objects.equals(this.ok, purchaseResponseDTOWrapper.ok) &&
        Objects.equals(this.message, purchaseResponseDTOWrapper.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, result, ok, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseResponseDTOWrapper {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

  public static PurchaseResponseDTOWrapperBuilder builder() {
    return new PurchaseResponseDTOWrapperBuilder();
  }

  public static class PurchaseResponseDTOWrapperBuilder {

    private StatusEnum status = null;
    private PurchaseResponseDTO result = null;
    private Boolean ok = null;
    private String message = null;
    

    PurchaseResponseDTOWrapperBuilder() {
    }

    /**
     **/
    public PurchaseResponseDTOWrapperBuilder status(StatusEnum status) {
      this.status = status;
      return this;
    }

    /**
     **/
    public PurchaseResponseDTOWrapperBuilder result(PurchaseResponseDTO result) {
      this.result = result;
      return this;
    }

    /**
     **/
    public PurchaseResponseDTOWrapperBuilder ok(Boolean ok) {
      this.ok = ok;
      return this;
    }

    /**
     **/
    public PurchaseResponseDTOWrapperBuilder message(String message) {
      this.message = message;
      return this;
    }


    public PurchaseResponseDTOWrapper build() {
      PurchaseResponseDTOWrapper purchaseResponseDTOWrapper = new PurchaseResponseDTOWrapper();
      purchaseResponseDTOWrapper.setStatus(this.status);
      purchaseResponseDTOWrapper.setResult(this.result);
      purchaseResponseDTOWrapper.setOk(this.ok);
      purchaseResponseDTOWrapper.setMessage(this.message);
      return purchaseResponseDTOWrapper;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PurchaseResponseDTOWrapperBuilder {\n");
      
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
      sb.append("    result: ").append(toIndentedString(result)).append("\n");
      sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

