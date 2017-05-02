package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class MobileAppInfoDto   {
  
  private String uuid = null;
  private Boolean useable = null;
  private Date updDttm = null;
  private Long tokenSeq = null;
  private Date regDttm = null;
  private String pushToken = null;
  private String otherUuid = null;
  private String osVersion = null;
  private Date modifiedAt = null;


  public enum MobileIdEnum {
    ANDROID("ANDROID"),
    IOS("IOS");

    private String value;

    MobileIdEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private MobileIdEnum mobileId = null;
  private String memberId = null;
  private Date lastLogin = null;
  private Date lastExecution = null;
  private Boolean isAllowPush = null;
  private Boolean isAllowMarketingPush = null;
  private String deviceModel = null;
  private String deviceId = null;
  private Boolean autoLogin = null;
  private String authToken = null;
  private String appVersion = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("uuid")
  @com.fasterxml.jackson.annotation.JsonProperty("uuid")
  public String getUuid() {
    return uuid;
  }
  
  /**
   **/
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("useable")
  @com.fasterxml.jackson.annotation.JsonProperty("useable")
  public Boolean getUseable() {
    return useable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isUseable() {
    return useable == null ? false : useable;
  }
  
  /**
   **/
  public void setUseable(Boolean useable) {
    this.useable = useable;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("tokenSeq")
  @com.fasterxml.jackson.annotation.JsonProperty("tokenSeq")
  public Long getTokenSeq() {
    return tokenSeq;
  }
  
  /**
   **/
  public void setTokenSeq(Long tokenSeq) {
    this.tokenSeq = tokenSeq;
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
  @org.codehaus.jackson.annotate.JsonProperty("pushToken")
  @com.fasterxml.jackson.annotation.JsonProperty("pushToken")
  public String getPushToken() {
    return pushToken;
  }
  
  /**
   **/
  public void setPushToken(String pushToken) {
    this.pushToken = pushToken;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("otherUuid")
  @com.fasterxml.jackson.annotation.JsonProperty("otherUuid")
  public String getOtherUuid() {
    return otherUuid;
  }
  
  /**
   **/
  public void setOtherUuid(String otherUuid) {
    this.otherUuid = otherUuid;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("osVersion")
  @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
  public String getOsVersion() {
    return osVersion;
  }
  
  /**
   **/
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
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
  @org.codehaus.jackson.annotate.JsonProperty("mobileId")
  @com.fasterxml.jackson.annotation.JsonProperty("mobileId")
  public MobileIdEnum getMobileId() {
    return mobileId;
  }
  
  /**
   **/
  public void setMobileId(MobileIdEnum mobileId) {
    this.mobileId = mobileId;
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
  @org.codehaus.jackson.annotate.JsonProperty("lastLogin")
  @com.fasterxml.jackson.annotation.JsonProperty("lastLogin")
  public Date getLastLogin() {
    return lastLogin;
  }
  
  /**
   **/
  public void setLastLogin(Date lastLogin) {
    this.lastLogin = lastLogin;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lastExecution")
  @com.fasterxml.jackson.annotation.JsonProperty("lastExecution")
  public Date getLastExecution() {
    return lastExecution;
  }
  
  /**
   **/
  public void setLastExecution(Date lastExecution) {
    this.lastExecution = lastExecution;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isAllowPush")
  @com.fasterxml.jackson.annotation.JsonProperty("isAllowPush")
  public Boolean getIsAllowPush() {
    return isAllowPush;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsAllowPush() {
    return isAllowPush == null ? false : isAllowPush;
  }
  
  /**
   **/
  public void setIsAllowPush(Boolean isAllowPush) {
    this.isAllowPush = isAllowPush;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isAllowMarketingPush")
  @com.fasterxml.jackson.annotation.JsonProperty("isAllowMarketingPush")
  public Boolean getIsAllowMarketingPush() {
    return isAllowMarketingPush;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsAllowMarketingPush() {
    return isAllowMarketingPush == null ? false : isAllowMarketingPush;
  }
  
  /**
   **/
  public void setIsAllowMarketingPush(Boolean isAllowMarketingPush) {
    this.isAllowMarketingPush = isAllowMarketingPush;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deviceModel")
  @com.fasterxml.jackson.annotation.JsonProperty("deviceModel")
  public String getDeviceModel() {
    return deviceModel;
  }
  
  /**
   **/
  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deviceId")
  @com.fasterxml.jackson.annotation.JsonProperty("deviceId")
  public String getDeviceId() {
    return deviceId;
  }
  
  /**
   **/
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("autoLogin")
  @com.fasterxml.jackson.annotation.JsonProperty("autoLogin")
  public Boolean getAutoLogin() {
    return autoLogin;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAutoLogin() {
    return autoLogin == null ? false : autoLogin;
  }
  
  /**
   **/
  public void setAutoLogin(Boolean autoLogin) {
    this.autoLogin = autoLogin;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("authToken")
  @com.fasterxml.jackson.annotation.JsonProperty("authToken")
  public String getAuthToken() {
    return authToken;
  }
  
  /**
   **/
  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("appVersion")
  @com.fasterxml.jackson.annotation.JsonProperty("appVersion")
  public String getAppVersion() {
    return appVersion;
  }
  
  /**
   **/
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileAppInfoDto mobileAppInfoDto = (MobileAppInfoDto) o;
    return Objects.equals(this.uuid, mobileAppInfoDto.uuid) &&
        Objects.equals(this.useable, mobileAppInfoDto.useable) &&
        Objects.equals(this.updDttm, mobileAppInfoDto.updDttm) &&
        Objects.equals(this.tokenSeq, mobileAppInfoDto.tokenSeq) &&
        Objects.equals(this.regDttm, mobileAppInfoDto.regDttm) &&
        Objects.equals(this.pushToken, mobileAppInfoDto.pushToken) &&
        Objects.equals(this.otherUuid, mobileAppInfoDto.otherUuid) &&
        Objects.equals(this.osVersion, mobileAppInfoDto.osVersion) &&
        Objects.equals(this.modifiedAt, mobileAppInfoDto.modifiedAt) &&
        Objects.equals(this.mobileId, mobileAppInfoDto.mobileId) &&
        Objects.equals(this.memberId, mobileAppInfoDto.memberId) &&
        Objects.equals(this.lastLogin, mobileAppInfoDto.lastLogin) &&
        Objects.equals(this.lastExecution, mobileAppInfoDto.lastExecution) &&
        Objects.equals(this.isAllowPush, mobileAppInfoDto.isAllowPush) &&
        Objects.equals(this.isAllowMarketingPush, mobileAppInfoDto.isAllowMarketingPush) &&
        Objects.equals(this.deviceModel, mobileAppInfoDto.deviceModel) &&
        Objects.equals(this.deviceId, mobileAppInfoDto.deviceId) &&
        Objects.equals(this.autoLogin, mobileAppInfoDto.autoLogin) &&
        Objects.equals(this.authToken, mobileAppInfoDto.authToken) &&
        Objects.equals(this.appVersion, mobileAppInfoDto.appVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, useable, updDttm, tokenSeq, regDttm, pushToken, otherUuid, osVersion, modifiedAt, mobileId, memberId, lastLogin, lastExecution, isAllowPush, isAllowMarketingPush, deviceModel, deviceId, autoLogin, authToken, appVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileAppInfoDto {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    useable: ").append(toIndentedString(useable)).append("\n");
    sb.append("    updDttm: ").append(toIndentedString(updDttm)).append("\n");
    sb.append("    tokenSeq: ").append(toIndentedString(tokenSeq)).append("\n");
    sb.append("    regDttm: ").append(toIndentedString(regDttm)).append("\n");
    sb.append("    pushToken: ").append(toIndentedString(pushToken)).append("\n");
    sb.append("    otherUuid: ").append(toIndentedString(otherUuid)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    mobileId: ").append(toIndentedString(mobileId)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    lastExecution: ").append(toIndentedString(lastExecution)).append("\n");
    sb.append("    isAllowPush: ").append(toIndentedString(isAllowPush)).append("\n");
    sb.append("    isAllowMarketingPush: ").append(toIndentedString(isAllowMarketingPush)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    autoLogin: ").append(toIndentedString(autoLogin)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
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

  public static MobileAppInfoDtoBuilder builder() {
    return new MobileAppInfoDtoBuilder();
  }

  public static class MobileAppInfoDtoBuilder {

    private String uuid = null;
    private Boolean useable = null;
    private Date updDttm = null;
    private Long tokenSeq = null;
    private Date regDttm = null;
    private String pushToken = null;
    private String otherUuid = null;
    private String osVersion = null;
    private Date modifiedAt = null;
    private MobileIdEnum mobileId = null;
    private String memberId = null;
    private Date lastLogin = null;
    private Date lastExecution = null;
    private Boolean isAllowPush = null;
    private Boolean isAllowMarketingPush = null;
    private String deviceModel = null;
    private String deviceId = null;
    private Boolean autoLogin = null;
    private String authToken = null;
    private String appVersion = null;
    

    MobileAppInfoDtoBuilder() {
    }

    /**
     **/
    public MobileAppInfoDtoBuilder uuid(String uuid) {
      this.uuid = uuid;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder useable(Boolean useable) {
      this.useable = useable;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder updDttm(Date updDttm) {
      this.updDttm = updDttm;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder tokenSeq(Long tokenSeq) {
      this.tokenSeq = tokenSeq;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder regDttm(Date regDttm) {
      this.regDttm = regDttm;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder pushToken(String pushToken) {
      this.pushToken = pushToken;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder otherUuid(String otherUuid) {
      this.otherUuid = otherUuid;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder osVersion(String osVersion) {
      this.osVersion = osVersion;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder modifiedAt(Date modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder mobileId(MobileIdEnum mobileId) {
      this.mobileId = mobileId;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder lastLogin(Date lastLogin) {
      this.lastLogin = lastLogin;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder lastExecution(Date lastExecution) {
      this.lastExecution = lastExecution;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder isAllowPush(Boolean isAllowPush) {
      this.isAllowPush = isAllowPush;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder isAllowMarketingPush(Boolean isAllowMarketingPush) {
      this.isAllowMarketingPush = isAllowMarketingPush;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder deviceModel(String deviceModel) {
      this.deviceModel = deviceModel;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder deviceId(String deviceId) {
      this.deviceId = deviceId;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder autoLogin(Boolean autoLogin) {
      this.autoLogin = autoLogin;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder authToken(String authToken) {
      this.authToken = authToken;
      return this;
    }

    /**
     **/
    public MobileAppInfoDtoBuilder appVersion(String appVersion) {
      this.appVersion = appVersion;
      return this;
    }


    public MobileAppInfoDto build() {
      MobileAppInfoDto mobileAppInfoDto = new MobileAppInfoDto();
      mobileAppInfoDto.setUuid(this.uuid);
      mobileAppInfoDto.setUseable(this.useable);
      mobileAppInfoDto.setUpdDttm(this.updDttm);
      mobileAppInfoDto.setTokenSeq(this.tokenSeq);
      mobileAppInfoDto.setRegDttm(this.regDttm);
      mobileAppInfoDto.setPushToken(this.pushToken);
      mobileAppInfoDto.setOtherUuid(this.otherUuid);
      mobileAppInfoDto.setOsVersion(this.osVersion);
      mobileAppInfoDto.setModifiedAt(this.modifiedAt);
      mobileAppInfoDto.setMobileId(this.mobileId);
      mobileAppInfoDto.setMemberId(this.memberId);
      mobileAppInfoDto.setLastLogin(this.lastLogin);
      mobileAppInfoDto.setLastExecution(this.lastExecution);
      mobileAppInfoDto.setIsAllowPush(this.isAllowPush);
      mobileAppInfoDto.setIsAllowMarketingPush(this.isAllowMarketingPush);
      mobileAppInfoDto.setDeviceModel(this.deviceModel);
      mobileAppInfoDto.setDeviceId(this.deviceId);
      mobileAppInfoDto.setAutoLogin(this.autoLogin);
      mobileAppInfoDto.setAuthToken(this.authToken);
      mobileAppInfoDto.setAppVersion(this.appVersion);
      return mobileAppInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MobileAppInfoDtoBuilder {\n");
      
      sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
      sb.append("    useable: ").append(toIndentedString(useable)).append("\n");
      sb.append("    updDttm: ").append(toIndentedString(updDttm)).append("\n");
      sb.append("    tokenSeq: ").append(toIndentedString(tokenSeq)).append("\n");
      sb.append("    regDttm: ").append(toIndentedString(regDttm)).append("\n");
      sb.append("    pushToken: ").append(toIndentedString(pushToken)).append("\n");
      sb.append("    otherUuid: ").append(toIndentedString(otherUuid)).append("\n");
      sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
      sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
      sb.append("    mobileId: ").append(toIndentedString(mobileId)).append("\n");
      sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
      sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
      sb.append("    lastExecution: ").append(toIndentedString(lastExecution)).append("\n");
      sb.append("    isAllowPush: ").append(toIndentedString(isAllowPush)).append("\n");
      sb.append("    isAllowMarketingPush: ").append(toIndentedString(isAllowMarketingPush)).append("\n");
      sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
      sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
      sb.append("    autoLogin: ").append(toIndentedString(autoLogin)).append("\n");
      sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
      sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
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

