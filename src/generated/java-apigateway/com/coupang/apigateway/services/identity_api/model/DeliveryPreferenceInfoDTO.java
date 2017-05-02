package com.coupang.apigateway.services.identity_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.identity_api.model.DeliveryPreferenceDTO;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.052+09:00")
public class DeliveryPreferenceInfoDTO   {
  
  private String summary = null;
  private String placeExtra = null;
  private String place = null;
  private String memberId = null;
  private List<DeliveryPreferenceDTO> deliveryPreferenceDTOs = new ArrayList<DeliveryPreferenceDTO>();
  private String deliveryDetailSeq = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("summary")
  @com.fasterxml.jackson.annotation.JsonProperty("summary")
  public String getSummary() {
    return summary;
  }
  
  /**
   **/
  public void setSummary(String summary) {
    this.summary = summary;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("placeExtra")
  @com.fasterxml.jackson.annotation.JsonProperty("placeExtra")
  public String getPlaceExtra() {
    return placeExtra;
  }
  
  /**
   **/
  public void setPlaceExtra(String placeExtra) {
    this.placeExtra = placeExtra;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("place")
  @com.fasterxml.jackson.annotation.JsonProperty("place")
  public String getPlace() {
    return place;
  }
  
  /**
   **/
  public void setPlace(String place) {
    this.place = place;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("memberId")
  @com.fasterxml.jackson.annotation.JsonProperty("memberId")
  public String getMemberId() {
    return memberId;
  }
  
  /**
   **/
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryPreferenceDTOs")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryPreferenceDTOs")
  public List<DeliveryPreferenceDTO> getDeliveryPreferenceDTOs() {
    return deliveryPreferenceDTOs;
  }
  
  /**
   **/
  public void setDeliveryPreferenceDTOs(List<DeliveryPreferenceDTO> deliveryPreferenceDTOs) {
    this.deliveryPreferenceDTOs = deliveryPreferenceDTOs;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryDetailSeq")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryDetailSeq")
  public String getDeliveryDetailSeq() {
    return deliveryDetailSeq;
  }
  
  /**
   **/
  public void setDeliveryDetailSeq(String deliveryDetailSeq) {
    this.deliveryDetailSeq = deliveryDetailSeq;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryPreferenceInfoDTO deliveryPreferenceInfoDTO = (DeliveryPreferenceInfoDTO) o;
    return Objects.equals(this.summary, deliveryPreferenceInfoDTO.summary) &&
        Objects.equals(this.placeExtra, deliveryPreferenceInfoDTO.placeExtra) &&
        Objects.equals(this.place, deliveryPreferenceInfoDTO.place) &&
        Objects.equals(this.memberId, deliveryPreferenceInfoDTO.memberId) &&
        Objects.equals(this.deliveryPreferenceDTOs, deliveryPreferenceInfoDTO.deliveryPreferenceDTOs) &&
        Objects.equals(this.deliveryDetailSeq, deliveryPreferenceInfoDTO.deliveryDetailSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, placeExtra, place, memberId, deliveryPreferenceDTOs, deliveryDetailSeq);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryPreferenceInfoDTO {\n");
    
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    placeExtra: ").append(toIndentedString(placeExtra)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    deliveryPreferenceDTOs: ").append(toIndentedString(deliveryPreferenceDTOs)).append("\n");
    sb.append("    deliveryDetailSeq: ").append(toIndentedString(deliveryDetailSeq)).append("\n");
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

  public static DeliveryPreferenceInfoDTOBuilder builder() {
    return new DeliveryPreferenceInfoDTOBuilder();
  }

  public static class DeliveryPreferenceInfoDTOBuilder {

    private String summary = null;
    private String placeExtra = null;
    private String place = null;
    private String memberId = null;
    private List<DeliveryPreferenceDTO> deliveryPreferenceDTOs = new ArrayList<DeliveryPreferenceDTO>();
    private String deliveryDetailSeq = null;
    

    DeliveryPreferenceInfoDTOBuilder() {
    }

    /**
     **/
    public DeliveryPreferenceInfoDTOBuilder summary(String summary) {
      this.summary = summary;
      return this;
    }

    /**
     **/
    public DeliveryPreferenceInfoDTOBuilder placeExtra(String placeExtra) {
      this.placeExtra = placeExtra;
      return this;
    }

    /**
     **/
    public DeliveryPreferenceInfoDTOBuilder place(String place) {
      this.place = place;
      return this;
    }

    /**
     **/
    public DeliveryPreferenceInfoDTOBuilder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    /**
     **/
    public DeliveryPreferenceInfoDTOBuilder deliveryPreferenceDTOs(List<DeliveryPreferenceDTO> deliveryPreferenceDTOs) {
      this.deliveryPreferenceDTOs = deliveryPreferenceDTOs;
      return this;
    }

    /**
     **/
    public DeliveryPreferenceInfoDTOBuilder deliveryDetailSeq(String deliveryDetailSeq) {
      this.deliveryDetailSeq = deliveryDetailSeq;
      return this;
    }


    public DeliveryPreferenceInfoDTO build() {
      DeliveryPreferenceInfoDTO deliveryPreferenceInfoDTO = new DeliveryPreferenceInfoDTO();
      deliveryPreferenceInfoDTO.setSummary(this.summary);
      deliveryPreferenceInfoDTO.setPlaceExtra(this.placeExtra);
      deliveryPreferenceInfoDTO.setPlace(this.place);
      deliveryPreferenceInfoDTO.setMemberId(this.memberId);
      deliveryPreferenceInfoDTO.setDeliveryPreferenceDTOs(this.deliveryPreferenceDTOs);
      deliveryPreferenceInfoDTO.setDeliveryDetailSeq(this.deliveryDetailSeq);
      return deliveryPreferenceInfoDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DeliveryPreferenceInfoDTOBuilder {\n");
      
      sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
      sb.append("    placeExtra: ").append(toIndentedString(placeExtra)).append("\n");
      sb.append("    place: ").append(toIndentedString(place)).append("\n");
      sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
      sb.append("    deliveryPreferenceDTOs: ").append(toIndentedString(deliveryPreferenceDTOs)).append("\n");
      sb.append("    deliveryDetailSeq: ").append(toIndentedString(deliveryDetailSeq)).append("\n");
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

