package com.coupang.apigateway.services.identity_api.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.052+09:00")
public class DeliveryPreferenceDTO   {
  
  private String type = null;
  private Date modifiedAt = null;
  private String message = null;
  private String label = null;
  private String deliveryPreferenceId = null;
  private Date createdAt = null;
  private String code = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public String getType() {
    return type;
  }
  
  /**
   **/
  public void setType(String type) {
    this.type = type;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("modifiedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("modifiedAt")
  public Date getModifiedAt() {
    return modifiedAt;
  }
  
  /**
   **/
  public void setModifiedAt(Date modifiedAt) {
    this.modifiedAt = modifiedAt;
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
  @org.codehaus.jackson.annotate.JsonProperty("label")
  @com.fasterxml.jackson.annotation.JsonProperty("label")
  public String getLabel() {
    return label;
  }
  
  /**
   **/
  public void setLabel(String label) {
    this.label = label;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryPreferenceId")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryPreferenceId")
  public String getDeliveryPreferenceId() {
    return deliveryPreferenceId;
  }
  
  /**
   **/
  public void setDeliveryPreferenceId(String deliveryPreferenceId) {
    this.deliveryPreferenceId = deliveryPreferenceId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("createdAt")
  @com.fasterxml.jackson.annotation.JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  
  /**
   **/
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
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
    DeliveryPreferenceDTO deliveryPreferenceDTO = (DeliveryPreferenceDTO) o;
    return Objects.equals(this.type, deliveryPreferenceDTO.type) &&
        Objects.equals(this.modifiedAt, deliveryPreferenceDTO.modifiedAt) &&
        Objects.equals(this.message, deliveryPreferenceDTO.message) &&
        Objects.equals(this.label, deliveryPreferenceDTO.label) &&
        Objects.equals(this.deliveryPreferenceId, deliveryPreferenceDTO.deliveryPreferenceId) &&
        Objects.equals(this.createdAt, deliveryPreferenceDTO.createdAt) &&
        Objects.equals(this.code, deliveryPreferenceDTO.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, modifiedAt, message, label, deliveryPreferenceId, createdAt, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryPreferenceDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    deliveryPreferenceId: ").append(toIndentedString(deliveryPreferenceId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

  public static DeliveryPreferenceDTOBuilder builder() {
    return new DeliveryPreferenceDTOBuilder();
  }

  public static class DeliveryPreferenceDTOBuilder {

    private String type = null;
    private Date modifiedAt = null;
    private String message = null;
    private String label = null;
    private String deliveryPreferenceId = null;
    private Date createdAt = null;
    private String code = null;
    

    DeliveryPreferenceDTOBuilder() {
    }

    /**
     **/
    public DeliveryPreferenceDTOBuilder type(String type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public DeliveryPreferenceDTOBuilder modifiedAt(Date modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    /**
     **/
    public DeliveryPreferenceDTOBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public DeliveryPreferenceDTOBuilder label(String label) {
      this.label = label;
      return this;
    }

    /**
     **/
    public DeliveryPreferenceDTOBuilder deliveryPreferenceId(String deliveryPreferenceId) {
      this.deliveryPreferenceId = deliveryPreferenceId;
      return this;
    }

    /**
     **/
    public DeliveryPreferenceDTOBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public DeliveryPreferenceDTOBuilder code(String code) {
      this.code = code;
      return this;
    }


    public DeliveryPreferenceDTO build() {
      DeliveryPreferenceDTO deliveryPreferenceDTO = new DeliveryPreferenceDTO();
      deliveryPreferenceDTO.setType(this.type);
      deliveryPreferenceDTO.setModifiedAt(this.modifiedAt);
      deliveryPreferenceDTO.setMessage(this.message);
      deliveryPreferenceDTO.setLabel(this.label);
      deliveryPreferenceDTO.setDeliveryPreferenceId(this.deliveryPreferenceId);
      deliveryPreferenceDTO.setCreatedAt(this.createdAt);
      deliveryPreferenceDTO.setCode(this.code);
      return deliveryPreferenceDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DeliveryPreferenceDTOBuilder {\n");
      
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
      sb.append("    label: ").append(toIndentedString(label)).append("\n");
      sb.append("    deliveryPreferenceId: ").append(toIndentedString(deliveryPreferenceId)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

