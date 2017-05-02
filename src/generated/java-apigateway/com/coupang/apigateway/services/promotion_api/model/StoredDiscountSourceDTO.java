package com.coupang.apigateway.services.promotion_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.975+09:00")
public class StoredDiscountSourceDTO   {
  
  private Long storedSourceId = null;
  private String storedAt = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("storedSourceId")
  @com.fasterxml.jackson.annotation.JsonProperty("storedSourceId")
  public Long getStoredSourceId() {
    return storedSourceId;
  }
  
  /**
   **/
  public void setStoredSourceId(Long storedSourceId) {
    this.storedSourceId = storedSourceId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("storedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("storedAt")
  public String getStoredAt() {
    return storedAt;
  }
  
  /**
   **/
  public void setStoredAt(String storedAt) {
    this.storedAt = storedAt;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredDiscountSourceDTO storedDiscountSourceDTO = (StoredDiscountSourceDTO) o;
    return Objects.equals(this.storedSourceId, storedDiscountSourceDTO.storedSourceId) &&
        Objects.equals(this.storedAt, storedDiscountSourceDTO.storedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storedSourceId, storedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredDiscountSourceDTO {\n");
    
    sb.append("    storedSourceId: ").append(toIndentedString(storedSourceId)).append("\n");
    sb.append("    storedAt: ").append(toIndentedString(storedAt)).append("\n");
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

  public static StoredDiscountSourceDTOBuilder builder() {
    return new StoredDiscountSourceDTOBuilder();
  }

  public static class StoredDiscountSourceDTOBuilder {

    private Long storedSourceId = null;
    private String storedAt = null;
    

    StoredDiscountSourceDTOBuilder() {
    }

    /**
     **/
    public StoredDiscountSourceDTOBuilder storedSourceId(Long storedSourceId) {
      this.storedSourceId = storedSourceId;
      return this;
    }

    /**
     **/
    public StoredDiscountSourceDTOBuilder storedAt(String storedAt) {
      this.storedAt = storedAt;
      return this;
    }


    public StoredDiscountSourceDTO build() {
      StoredDiscountSourceDTO storedDiscountSourceDTO = new StoredDiscountSourceDTO();
      storedDiscountSourceDTO.setStoredSourceId(this.storedSourceId);
      storedDiscountSourceDTO.setStoredAt(this.storedAt);
      return storedDiscountSourceDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class StoredDiscountSourceDTOBuilder {\n");
      
      sb.append("    storedSourceId: ").append(toIndentedString(storedSourceId)).append("\n");
      sb.append("    storedAt: ").append(toIndentedString(storedAt)).append("\n");
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

