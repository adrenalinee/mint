package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.member_api.model.ReceiverDTO;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class DeliveryDetailDTO   {
  
  private Date updDttm = null;
  private String remoteIp = null;
  private Date regDttm = null;
  private ReceiverDTO receiver = null;
  private String memberId = null;
  private String deliveryTitle = null;
  private Boolean deliveryMain = null;
  private String deliveryDetailSeq = null;
  private String boUserId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("updDttm")
  @com.fasterxml.jackson.annotation.JsonProperty("updDttm")
  public Date getUpdDttm() {
    return updDttm;
  }
  
  /**
   **/
  public void setUpdDttm(Date updDttm) {
    this.updDttm = updDttm;
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
  @org.codehaus.jackson.annotate.JsonProperty("regDttm")
  @com.fasterxml.jackson.annotation.JsonProperty("regDttm")
  public Date getRegDttm() {
    return regDttm;
  }
  
  /**
   **/
  public void setRegDttm(Date regDttm) {
    this.regDttm = regDttm;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("receiver")
  @com.fasterxml.jackson.annotation.JsonProperty("receiver")
  public ReceiverDTO getReceiver() {
    return receiver;
  }
  
  /**
   **/
  public void setReceiver(ReceiverDTO receiver) {
    this.receiver = receiver;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryDetailDTO deliveryDetailDTO = (DeliveryDetailDTO) o;
    return Objects.equals(this.updDttm, deliveryDetailDTO.updDttm) &&
        Objects.equals(this.remoteIp, deliveryDetailDTO.remoteIp) &&
        Objects.equals(this.regDttm, deliveryDetailDTO.regDttm) &&
        Objects.equals(this.receiver, deliveryDetailDTO.receiver) &&
        Objects.equals(this.memberId, deliveryDetailDTO.memberId) &&
        Objects.equals(this.deliveryTitle, deliveryDetailDTO.deliveryTitle) &&
        Objects.equals(this.deliveryMain, deliveryDetailDTO.deliveryMain) &&
        Objects.equals(this.deliveryDetailSeq, deliveryDetailDTO.deliveryDetailSeq) &&
        Objects.equals(this.boUserId, deliveryDetailDTO.boUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updDttm, remoteIp, regDttm, receiver, memberId, deliveryTitle, deliveryMain, deliveryDetailSeq, boUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryDetailDTO {\n");
    
    sb.append("    updDttm: ").append(toIndentedString(updDttm)).append("\n");
    sb.append("    remoteIp: ").append(toIndentedString(remoteIp)).append("\n");
    sb.append("    regDttm: ").append(toIndentedString(regDttm)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    deliveryTitle: ").append(toIndentedString(deliveryTitle)).append("\n");
    sb.append("    deliveryMain: ").append(toIndentedString(deliveryMain)).append("\n");
    sb.append("    deliveryDetailSeq: ").append(toIndentedString(deliveryDetailSeq)).append("\n");
    sb.append("    boUserId: ").append(toIndentedString(boUserId)).append("\n");
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

  public static DeliveryDetailDTOBuilder builder() {
    return new DeliveryDetailDTOBuilder();
  }

  public static class DeliveryDetailDTOBuilder {

    private Date updDttm = null;
    private String remoteIp = null;
    private Date regDttm = null;
    private ReceiverDTO receiver = null;
    private String memberId = null;
    private String deliveryTitle = null;
    private Boolean deliveryMain = null;
    private String deliveryDetailSeq = null;
    private String boUserId = null;
    

    DeliveryDetailDTOBuilder() {
    }

    /**
     **/
    public DeliveryDetailDTOBuilder updDttm(Date updDttm) {
      this.updDttm = updDttm;
      return this;
    }

    /**
     **/
    public DeliveryDetailDTOBuilder remoteIp(String remoteIp) {
      this.remoteIp = remoteIp;
      return this;
    }

    /**
     **/
    public DeliveryDetailDTOBuilder regDttm(Date regDttm) {
      this.regDttm = regDttm;
      return this;
    }

    /**
     **/
    public DeliveryDetailDTOBuilder receiver(ReceiverDTO receiver) {
      this.receiver = receiver;
      return this;
    }

    /**
     **/
    public DeliveryDetailDTOBuilder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    /**
     **/
    public DeliveryDetailDTOBuilder deliveryTitle(String deliveryTitle) {
      this.deliveryTitle = deliveryTitle;
      return this;
    }

    /**
     **/
    public DeliveryDetailDTOBuilder deliveryMain(Boolean deliveryMain) {
      this.deliveryMain = deliveryMain;
      return this;
    }

    /**
     **/
    public DeliveryDetailDTOBuilder deliveryDetailSeq(String deliveryDetailSeq) {
      this.deliveryDetailSeq = deliveryDetailSeq;
      return this;
    }

    /**
     **/
    public DeliveryDetailDTOBuilder boUserId(String boUserId) {
      this.boUserId = boUserId;
      return this;
    }


    public DeliveryDetailDTO build() {
      DeliveryDetailDTO deliveryDetailDTO = new DeliveryDetailDTO();
      deliveryDetailDTO.setUpdDttm(this.updDttm);
      deliveryDetailDTO.setRemoteIp(this.remoteIp);
      deliveryDetailDTO.setRegDttm(this.regDttm);
      deliveryDetailDTO.setReceiver(this.receiver);
      deliveryDetailDTO.setMemberId(this.memberId);
      deliveryDetailDTO.setDeliveryTitle(this.deliveryTitle);
      deliveryDetailDTO.setDeliveryMain(this.deliveryMain);
      deliveryDetailDTO.setDeliveryDetailSeq(this.deliveryDetailSeq);
      deliveryDetailDTO.setBoUserId(this.boUserId);
      return deliveryDetailDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DeliveryDetailDTOBuilder {\n");
      
      sb.append("    updDttm: ").append(toIndentedString(updDttm)).append("\n");
      sb.append("    remoteIp: ").append(toIndentedString(remoteIp)).append("\n");
      sb.append("    regDttm: ").append(toIndentedString(regDttm)).append("\n");
      sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
      sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
      sb.append("    deliveryTitle: ").append(toIndentedString(deliveryTitle)).append("\n");
      sb.append("    deliveryMain: ").append(toIndentedString(deliveryMain)).append("\n");
      sb.append("    deliveryDetailSeq: ").append(toIndentedString(deliveryDetailSeq)).append("\n");
      sb.append("    boUserId: ").append(toIndentedString(boUserId)).append("\n");
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

