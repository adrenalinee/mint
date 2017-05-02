package com.coupang.apigateway.services.fds_api.model;

import java.util.Objects;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.579+09:00")
public class PurchaseResponseDTO   {
  


  public enum StatusTypeEnum {
    GOOD("GOOD"),
    WARNING("WARNING"),
    DETECTED("DETECTED");

    private String value;

    StatusTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusTypeEnum statusType = null;
  private String referenceId = null;
  private Map<String, String> messages = new HashMap<String, String>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("statusType")
  @com.fasterxml.jackson.annotation.JsonProperty("statusType")
  public StatusTypeEnum getStatusType() {
    return statusType;
  }
  
  /**
   **/
  public void setStatusType(StatusTypeEnum statusType) {
    this.statusType = statusType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("referenceId")
  @com.fasterxml.jackson.annotation.JsonProperty("referenceId")
  public String getReferenceId() {
    return referenceId;
  }
  
  /**
   **/
  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("messages")
  @com.fasterxml.jackson.annotation.JsonProperty("messages")
  public Map<String, String> getMessages() {
    return messages;
  }
  
  /**
   **/
  public void setMessages(Map<String, String> messages) {
    this.messages = messages;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseResponseDTO purchaseResponseDTO = (PurchaseResponseDTO) o;
    return Objects.equals(this.statusType, purchaseResponseDTO.statusType) &&
        Objects.equals(this.referenceId, purchaseResponseDTO.referenceId) &&
        Objects.equals(this.messages, purchaseResponseDTO.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusType, referenceId, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseResponseDTO {\n");
    
    sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

  public static PurchaseResponseDTOBuilder builder() {
    return new PurchaseResponseDTOBuilder();
  }

  public static class PurchaseResponseDTOBuilder {

    private StatusTypeEnum statusType = null;
    private String referenceId = null;
    private Map<String, String> messages = new HashMap<String, String>();
    

    PurchaseResponseDTOBuilder() {
    }

    /**
     **/
    public PurchaseResponseDTOBuilder statusType(StatusTypeEnum statusType) {
      this.statusType = statusType;
      return this;
    }

    /**
     **/
    public PurchaseResponseDTOBuilder referenceId(String referenceId) {
      this.referenceId = referenceId;
      return this;
    }

    /**
     **/
    public PurchaseResponseDTOBuilder messages(Map<String, String> messages) {
      this.messages = messages;
      return this;
    }


    public PurchaseResponseDTO build() {
      PurchaseResponseDTO purchaseResponseDTO = new PurchaseResponseDTO();
      purchaseResponseDTO.setStatusType(this.statusType);
      purchaseResponseDTO.setReferenceId(this.referenceId);
      purchaseResponseDTO.setMessages(this.messages);
      return purchaseResponseDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PurchaseResponseDTOBuilder {\n");
      
      sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
      sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
      sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

