package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class NotificationAgreementDto   {
  


  public enum NotificationTypeEnum {
    SMS("SMS"),
    EMAIL("EMAIL"),
    PUSH("PUSH");

    private String value;

    NotificationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private NotificationTypeEnum notificationType = null;
  private String notificationPurpose = null;
  private Date modifiedAt = null;
  private String memberId = null;
  private Date createdAt = null;
  private Boolean agreement = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("notificationType")
  @com.fasterxml.jackson.annotation.JsonProperty("notificationType")
  public NotificationTypeEnum getNotificationType() {
    return notificationType;
  }
  
  /**
   **/
  public void setNotificationType(NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("notificationPurpose")
  @com.fasterxml.jackson.annotation.JsonProperty("notificationPurpose")
  public String getNotificationPurpose() {
    return notificationPurpose;
  }
  
  /**
   **/
  public void setNotificationPurpose(String notificationPurpose) {
    this.notificationPurpose = notificationPurpose;
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
  @org.codehaus.jackson.annotate.JsonProperty("agreement")
  @com.fasterxml.jackson.annotation.JsonProperty("agreement")
  public Boolean getAgreement() {
    return agreement;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAgreement() {
    return agreement == null ? false : agreement;
  }
  
  /**
   **/
  public void setAgreement(Boolean agreement) {
    this.agreement = agreement;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationAgreementDto notificationAgreementDto = (NotificationAgreementDto) o;
    return Objects.equals(this.notificationType, notificationAgreementDto.notificationType) &&
        Objects.equals(this.notificationPurpose, notificationAgreementDto.notificationPurpose) &&
        Objects.equals(this.modifiedAt, notificationAgreementDto.modifiedAt) &&
        Objects.equals(this.memberId, notificationAgreementDto.memberId) &&
        Objects.equals(this.createdAt, notificationAgreementDto.createdAt) &&
        Objects.equals(this.agreement, notificationAgreementDto.agreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationType, notificationPurpose, modifiedAt, memberId, createdAt, agreement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationAgreementDto {\n");
    
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    notificationPurpose: ").append(toIndentedString(notificationPurpose)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
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

  public static NotificationAgreementDtoBuilder builder() {
    return new NotificationAgreementDtoBuilder();
  }

  public static class NotificationAgreementDtoBuilder {

    private NotificationTypeEnum notificationType = null;
    private String notificationPurpose = null;
    private Date modifiedAt = null;
    private String memberId = null;
    private Date createdAt = null;
    private Boolean agreement = null;
    

    NotificationAgreementDtoBuilder() {
    }

    /**
     **/
    public NotificationAgreementDtoBuilder notificationType(NotificationTypeEnum notificationType) {
      this.notificationType = notificationType;
      return this;
    }

    /**
     **/
    public NotificationAgreementDtoBuilder notificationPurpose(String notificationPurpose) {
      this.notificationPurpose = notificationPurpose;
      return this;
    }

    /**
     **/
    public NotificationAgreementDtoBuilder modifiedAt(Date modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    /**
     **/
    public NotificationAgreementDtoBuilder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    /**
     **/
    public NotificationAgreementDtoBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public NotificationAgreementDtoBuilder agreement(Boolean agreement) {
      this.agreement = agreement;
      return this;
    }


    public NotificationAgreementDto build() {
      NotificationAgreementDto notificationAgreementDto = new NotificationAgreementDto();
      notificationAgreementDto.setNotificationType(this.notificationType);
      notificationAgreementDto.setNotificationPurpose(this.notificationPurpose);
      notificationAgreementDto.setModifiedAt(this.modifiedAt);
      notificationAgreementDto.setMemberId(this.memberId);
      notificationAgreementDto.setCreatedAt(this.createdAt);
      notificationAgreementDto.setAgreement(this.agreement);
      return notificationAgreementDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class NotificationAgreementDtoBuilder {\n");
      
      sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
      sb.append("    notificationPurpose: ").append(toIndentedString(notificationPurpose)).append("\n");
      sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
      sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
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

