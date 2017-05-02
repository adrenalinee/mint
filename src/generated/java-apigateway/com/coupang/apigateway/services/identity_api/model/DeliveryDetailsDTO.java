package com.coupang.apigateway.services.identity_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.identity_api.model.DeliveryPreferenceInfoDTO;
import com.coupang.apigateway.services.identity_api.model.LandAddressDTO;
import com.coupang.apigateway.services.identity_api.model.RoadAddressDTO;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.052+09:00")
public class DeliveryDetailsDTO   {
  
  private String zipcode = null;
  private Boolean subscription = null;
  private RoadAddressDTO roadAddressDTO = null;
  private String remoteIp = null;
  private String receiverPhone = null;
  private String receiverName = null;
  private String receiverMobile = null;
  private Date modifiedAt = null;
  private String memberId = null;
  private LandAddressDTO landAddressDTO = null;
  private String deliveryTitle = null;
  private DeliveryPreferenceInfoDTO deliveryPreferenceInfoDTO = null;
  private Boolean deliveryMain = null;
  private String deliveryDetailSeq = null;
  private Date createdAt = null;
  private String countryCallingCode = null;
  private String boUserId = null;
  private String addrType = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("zipcode")
  @com.fasterxml.jackson.annotation.JsonProperty("zipcode")
  public String getZipcode() {
    return zipcode;
  }
  
  /**
   **/
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("subscription")
  @com.fasterxml.jackson.annotation.JsonProperty("subscription")
  public Boolean getSubscription() {
    return subscription;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isSubscription() {
    return subscription == null ? false : subscription;
  }
  
  /**
   **/
  public void setSubscription(Boolean subscription) {
    this.subscription = subscription;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("roadAddressDTO")
  @com.fasterxml.jackson.annotation.JsonProperty("roadAddressDTO")
  public RoadAddressDTO getRoadAddressDTO() {
    return roadAddressDTO;
  }
  
  /**
   **/
  public void setRoadAddressDTO(RoadAddressDTO roadAddressDTO) {
    this.roadAddressDTO = roadAddressDTO;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("remoteIp")
  @com.fasterxml.jackson.annotation.JsonProperty("remoteIp")
  public String getRemoteIp() {
    return remoteIp;
  }
  
  /**
   **/
  public void setRemoteIp(String remoteIp) {
    this.remoteIp = remoteIp;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("receiverPhone")
  @com.fasterxml.jackson.annotation.JsonProperty("receiverPhone")
  public String getReceiverPhone() {
    return receiverPhone;
  }
  
  /**
   **/
  public void setReceiverPhone(String receiverPhone) {
    this.receiverPhone = receiverPhone;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("receiverName")
  @com.fasterxml.jackson.annotation.JsonProperty("receiverName")
  public String getReceiverName() {
    return receiverName;
  }
  
  /**
   **/
  public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("receiverMobile")
  @com.fasterxml.jackson.annotation.JsonProperty("receiverMobile")
  public String getReceiverMobile() {
    return receiverMobile;
  }
  
  /**
   **/
  public void setReceiverMobile(String receiverMobile) {
    this.receiverMobile = receiverMobile;
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
  @org.codehaus.jackson.annotate.JsonProperty("landAddressDTO")
  @com.fasterxml.jackson.annotation.JsonProperty("landAddressDTO")
  public LandAddressDTO getLandAddressDTO() {
    return landAddressDTO;
  }
  
  /**
   **/
  public void setLandAddressDTO(LandAddressDTO landAddressDTO) {
    this.landAddressDTO = landAddressDTO;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryTitle")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryTitle")
  public String getDeliveryTitle() {
    return deliveryTitle;
  }
  
  /**
   **/
  public void setDeliveryTitle(String deliveryTitle) {
    this.deliveryTitle = deliveryTitle;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryPreferenceInfoDTO")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryPreferenceInfoDTO")
  public DeliveryPreferenceInfoDTO getDeliveryPreferenceInfoDTO() {
    return deliveryPreferenceInfoDTO;
  }
  
  /**
   **/
  public void setDeliveryPreferenceInfoDTO(DeliveryPreferenceInfoDTO deliveryPreferenceInfoDTO) {
    this.deliveryPreferenceInfoDTO = deliveryPreferenceInfoDTO;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryMain")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryMain")
  public Boolean getDeliveryMain() {
    return deliveryMain;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isDeliveryMain() {
    return deliveryMain == null ? false : deliveryMain;
  }
  
  /**
   **/
  public void setDeliveryMain(Boolean deliveryMain) {
    this.deliveryMain = deliveryMain;
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
  @org.codehaus.jackson.annotate.JsonProperty("countryCallingCode")
  @com.fasterxml.jackson.annotation.JsonProperty("countryCallingCode")
  public String getCountryCallingCode() {
    return countryCallingCode;
  }
  
  /**
   **/
  public void setCountryCallingCode(String countryCallingCode) {
    this.countryCallingCode = countryCallingCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("boUserId")
  @com.fasterxml.jackson.annotation.JsonProperty("boUserId")
  public String getBoUserId() {
    return boUserId;
  }
  
  /**
   **/
  public void setBoUserId(String boUserId) {
    this.boUserId = boUserId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("addrType")
  @com.fasterxml.jackson.annotation.JsonProperty("addrType")
  public String getAddrType() {
    return addrType;
  }
  
  /**
   **/
  public void setAddrType(String addrType) {
    this.addrType = addrType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryDetailsDTO deliveryDetailsDTO = (DeliveryDetailsDTO) o;
    return Objects.equals(this.zipcode, deliveryDetailsDTO.zipcode) &&
        Objects.equals(this.subscription, deliveryDetailsDTO.subscription) &&
        Objects.equals(this.roadAddressDTO, deliveryDetailsDTO.roadAddressDTO) &&
        Objects.equals(this.remoteIp, deliveryDetailsDTO.remoteIp) &&
        Objects.equals(this.receiverPhone, deliveryDetailsDTO.receiverPhone) &&
        Objects.equals(this.receiverName, deliveryDetailsDTO.receiverName) &&
        Objects.equals(this.receiverMobile, deliveryDetailsDTO.receiverMobile) &&
        Objects.equals(this.modifiedAt, deliveryDetailsDTO.modifiedAt) &&
        Objects.equals(this.memberId, deliveryDetailsDTO.memberId) &&
        Objects.equals(this.landAddressDTO, deliveryDetailsDTO.landAddressDTO) &&
        Objects.equals(this.deliveryTitle, deliveryDetailsDTO.deliveryTitle) &&
        Objects.equals(this.deliveryPreferenceInfoDTO, deliveryDetailsDTO.deliveryPreferenceInfoDTO) &&
        Objects.equals(this.deliveryMain, deliveryDetailsDTO.deliveryMain) &&
        Objects.equals(this.deliveryDetailSeq, deliveryDetailsDTO.deliveryDetailSeq) &&
        Objects.equals(this.createdAt, deliveryDetailsDTO.createdAt) &&
        Objects.equals(this.countryCallingCode, deliveryDetailsDTO.countryCallingCode) &&
        Objects.equals(this.boUserId, deliveryDetailsDTO.boUserId) &&
        Objects.equals(this.addrType, deliveryDetailsDTO.addrType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipcode, subscription, roadAddressDTO, remoteIp, receiverPhone, receiverName, receiverMobile, modifiedAt, memberId, landAddressDTO, deliveryTitle, deliveryPreferenceInfoDTO, deliveryMain, deliveryDetailSeq, createdAt, countryCallingCode, boUserId, addrType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryDetailsDTO {\n");
    
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    roadAddressDTO: ").append(toIndentedString(roadAddressDTO)).append("\n");
    sb.append("    remoteIp: ").append(toIndentedString(remoteIp)).append("\n");
    sb.append("    receiverPhone: ").append(toIndentedString(receiverPhone)).append("\n");
    sb.append("    receiverName: ").append(toIndentedString(receiverName)).append("\n");
    sb.append("    receiverMobile: ").append(toIndentedString(receiverMobile)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    landAddressDTO: ").append(toIndentedString(landAddressDTO)).append("\n");
    sb.append("    deliveryTitle: ").append(toIndentedString(deliveryTitle)).append("\n");
    sb.append("    deliveryPreferenceInfoDTO: ").append(toIndentedString(deliveryPreferenceInfoDTO)).append("\n");
    sb.append("    deliveryMain: ").append(toIndentedString(deliveryMain)).append("\n");
    sb.append("    deliveryDetailSeq: ").append(toIndentedString(deliveryDetailSeq)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    countryCallingCode: ").append(toIndentedString(countryCallingCode)).append("\n");
    sb.append("    boUserId: ").append(toIndentedString(boUserId)).append("\n");
    sb.append("    addrType: ").append(toIndentedString(addrType)).append("\n");
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

  public static DeliveryDetailsDTOBuilder builder() {
    return new DeliveryDetailsDTOBuilder();
  }

  public static class DeliveryDetailsDTOBuilder {

    private String zipcode = null;
    private Boolean subscription = null;
    private RoadAddressDTO roadAddressDTO = null;
    private String remoteIp = null;
    private String receiverPhone = null;
    private String receiverName = null;
    private String receiverMobile = null;
    private Date modifiedAt = null;
    private String memberId = null;
    private LandAddressDTO landAddressDTO = null;
    private String deliveryTitle = null;
    private DeliveryPreferenceInfoDTO deliveryPreferenceInfoDTO = null;
    private Boolean deliveryMain = null;
    private String deliveryDetailSeq = null;
    private Date createdAt = null;
    private String countryCallingCode = null;
    private String boUserId = null;
    private String addrType = null;
    

    DeliveryDetailsDTOBuilder() {
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder zipcode(String zipcode) {
      this.zipcode = zipcode;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder subscription(Boolean subscription) {
      this.subscription = subscription;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder roadAddressDTO(RoadAddressDTO roadAddressDTO) {
      this.roadAddressDTO = roadAddressDTO;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder remoteIp(String remoteIp) {
      this.remoteIp = remoteIp;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder receiverPhone(String receiverPhone) {
      this.receiverPhone = receiverPhone;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder receiverName(String receiverName) {
      this.receiverName = receiverName;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder receiverMobile(String receiverMobile) {
      this.receiverMobile = receiverMobile;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder modifiedAt(Date modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder landAddressDTO(LandAddressDTO landAddressDTO) {
      this.landAddressDTO = landAddressDTO;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder deliveryTitle(String deliveryTitle) {
      this.deliveryTitle = deliveryTitle;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder deliveryPreferenceInfoDTO(DeliveryPreferenceInfoDTO deliveryPreferenceInfoDTO) {
      this.deliveryPreferenceInfoDTO = deliveryPreferenceInfoDTO;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder deliveryMain(Boolean deliveryMain) {
      this.deliveryMain = deliveryMain;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder deliveryDetailSeq(String deliveryDetailSeq) {
      this.deliveryDetailSeq = deliveryDetailSeq;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder countryCallingCode(String countryCallingCode) {
      this.countryCallingCode = countryCallingCode;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder boUserId(String boUserId) {
      this.boUserId = boUserId;
      return this;
    }

    /**
     **/
    public DeliveryDetailsDTOBuilder addrType(String addrType) {
      this.addrType = addrType;
      return this;
    }


    public DeliveryDetailsDTO build() {
      DeliveryDetailsDTO deliveryDetailsDTO = new DeliveryDetailsDTO();
      deliveryDetailsDTO.setZipcode(this.zipcode);
      deliveryDetailsDTO.setSubscription(this.subscription);
      deliveryDetailsDTO.setRoadAddressDTO(this.roadAddressDTO);
      deliveryDetailsDTO.setRemoteIp(this.remoteIp);
      deliveryDetailsDTO.setReceiverPhone(this.receiverPhone);
      deliveryDetailsDTO.setReceiverName(this.receiverName);
      deliveryDetailsDTO.setReceiverMobile(this.receiverMobile);
      deliveryDetailsDTO.setModifiedAt(this.modifiedAt);
      deliveryDetailsDTO.setMemberId(this.memberId);
      deliveryDetailsDTO.setLandAddressDTO(this.landAddressDTO);
      deliveryDetailsDTO.setDeliveryTitle(this.deliveryTitle);
      deliveryDetailsDTO.setDeliveryPreferenceInfoDTO(this.deliveryPreferenceInfoDTO);
      deliveryDetailsDTO.setDeliveryMain(this.deliveryMain);
      deliveryDetailsDTO.setDeliveryDetailSeq(this.deliveryDetailSeq);
      deliveryDetailsDTO.setCreatedAt(this.createdAt);
      deliveryDetailsDTO.setCountryCallingCode(this.countryCallingCode);
      deliveryDetailsDTO.setBoUserId(this.boUserId);
      deliveryDetailsDTO.setAddrType(this.addrType);
      return deliveryDetailsDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DeliveryDetailsDTOBuilder {\n");
      
      sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
      sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
      sb.append("    roadAddressDTO: ").append(toIndentedString(roadAddressDTO)).append("\n");
      sb.append("    remoteIp: ").append(toIndentedString(remoteIp)).append("\n");
      sb.append("    receiverPhone: ").append(toIndentedString(receiverPhone)).append("\n");
      sb.append("    receiverName: ").append(toIndentedString(receiverName)).append("\n");
      sb.append("    receiverMobile: ").append(toIndentedString(receiverMobile)).append("\n");
      sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
      sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
      sb.append("    landAddressDTO: ").append(toIndentedString(landAddressDTO)).append("\n");
      sb.append("    deliveryTitle: ").append(toIndentedString(deliveryTitle)).append("\n");
      sb.append("    deliveryPreferenceInfoDTO: ").append(toIndentedString(deliveryPreferenceInfoDTO)).append("\n");
      sb.append("    deliveryMain: ").append(toIndentedString(deliveryMain)).append("\n");
      sb.append("    deliveryDetailSeq: ").append(toIndentedString(deliveryDetailSeq)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    countryCallingCode: ").append(toIndentedString(countryCallingCode)).append("\n");
      sb.append("    boUserId: ").append(toIndentedString(boUserId)).append("\n");
      sb.append("    addrType: ").append(toIndentedString(addrType)).append("\n");
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

