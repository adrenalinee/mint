package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class ModifyMobileAppInfoDto   {
  
  private String pushToken = null;
  private String otherUuid = null;
  private String osVersion = null;
  private Date lastExecution = null;
  private Boolean isAllowPush = null;
  private Boolean isAllowMarketingPush = null;
  private String deviceModel = null;
  private String deviceId = null;
  private Boolean autoLogin = null;
  private String appVersion = null;

  
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
    ModifyMobileAppInfoDto modifyMobileAppInfoDto = (ModifyMobileAppInfoDto) o;
    return Objects.equals(this.pushToken, modifyMobileAppInfoDto.pushToken) &&
        Objects.equals(this.otherUuid, modifyMobileAppInfoDto.otherUuid) &&
        Objects.equals(this.osVersion, modifyMobileAppInfoDto.osVersion) &&
        Objects.equals(this.lastExecution, modifyMobileAppInfoDto.lastExecution) &&
        Objects.equals(this.isAllowPush, modifyMobileAppInfoDto.isAllowPush) &&
        Objects.equals(this.isAllowMarketingPush, modifyMobileAppInfoDto.isAllowMarketingPush) &&
        Objects.equals(this.deviceModel, modifyMobileAppInfoDto.deviceModel) &&
        Objects.equals(this.deviceId, modifyMobileAppInfoDto.deviceId) &&
        Objects.equals(this.autoLogin, modifyMobileAppInfoDto.autoLogin) &&
        Objects.equals(this.appVersion, modifyMobileAppInfoDto.appVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushToken, otherUuid, osVersion, lastExecution, isAllowPush, isAllowMarketingPush, deviceModel, deviceId, autoLogin, appVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyMobileAppInfoDto {\n");
    
    sb.append("    pushToken: ").append(toIndentedString(pushToken)).append("\n");
    sb.append("    otherUuid: ").append(toIndentedString(otherUuid)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    lastExecution: ").append(toIndentedString(lastExecution)).append("\n");
    sb.append("    isAllowPush: ").append(toIndentedString(isAllowPush)).append("\n");
    sb.append("    isAllowMarketingPush: ").append(toIndentedString(isAllowMarketingPush)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    autoLogin: ").append(toIndentedString(autoLogin)).append("\n");
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

  public static ModifyMobileAppInfoDtoBuilder builder() {
    return new ModifyMobileAppInfoDtoBuilder();
  }

  public static class ModifyMobileAppInfoDtoBuilder {

    private String pushToken = null;
    private String otherUuid = null;
    private String osVersion = null;
    private Date lastExecution = null;
    private Boolean isAllowPush = null;
    private Boolean isAllowMarketingPush = null;
    private String deviceModel = null;
    private String deviceId = null;
    private Boolean autoLogin = null;
    private String appVersion = null;
    

    ModifyMobileAppInfoDtoBuilder() {
    }

    /**
     **/
    public ModifyMobileAppInfoDtoBuilder pushToken(String pushToken) {
      this.pushToken = pushToken;
      return this;
    }

    /**
     **/
    public ModifyMobileAppInfoDtoBuilder otherUuid(String otherUuid) {
      this.otherUuid = otherUuid;
      return this;
    }

    /**
     **/
    public ModifyMobileAppInfoDtoBuilder osVersion(String osVersion) {
      this.osVersion = osVersion;
      return this;
    }

    /**
     **/
    public ModifyMobileAppInfoDtoBuilder lastExecution(Date lastExecution) {
      this.lastExecution = lastExecution;
      return this;
    }

    /**
     **/
    public ModifyMobileAppInfoDtoBuilder isAllowPush(Boolean isAllowPush) {
      this.isAllowPush = isAllowPush;
      return this;
    }

    /**
     **/
    public ModifyMobileAppInfoDtoBuilder isAllowMarketingPush(Boolean isAllowMarketingPush) {
      this.isAllowMarketingPush = isAllowMarketingPush;
      return this;
    }

    /**
     **/
    public ModifyMobileAppInfoDtoBuilder deviceModel(String deviceModel) {
      this.deviceModel = deviceModel;
      return this;
    }

    /**
     **/
    public ModifyMobileAppInfoDtoBuilder deviceId(String deviceId) {
      this.deviceId = deviceId;
      return this;
    }

    /**
     **/
    public ModifyMobileAppInfoDtoBuilder autoLogin(Boolean autoLogin) {
      this.autoLogin = autoLogin;
      return this;
    }

    /**
     **/
    public ModifyMobileAppInfoDtoBuilder appVersion(String appVersion) {
      this.appVersion = appVersion;
      return this;
    }


    public ModifyMobileAppInfoDto build() {
      ModifyMobileAppInfoDto modifyMobileAppInfoDto = new ModifyMobileAppInfoDto();
      modifyMobileAppInfoDto.setPushToken(this.pushToken);
      modifyMobileAppInfoDto.setOtherUuid(this.otherUuid);
      modifyMobileAppInfoDto.setOsVersion(this.osVersion);
      modifyMobileAppInfoDto.setLastExecution(this.lastExecution);
      modifyMobileAppInfoDto.setIsAllowPush(this.isAllowPush);
      modifyMobileAppInfoDto.setIsAllowMarketingPush(this.isAllowMarketingPush);
      modifyMobileAppInfoDto.setDeviceModel(this.deviceModel);
      modifyMobileAppInfoDto.setDeviceId(this.deviceId);
      modifyMobileAppInfoDto.setAutoLogin(this.autoLogin);
      modifyMobileAppInfoDto.setAppVersion(this.appVersion);
      return modifyMobileAppInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ModifyMobileAppInfoDtoBuilder {\n");
      
      sb.append("    pushToken: ").append(toIndentedString(pushToken)).append("\n");
      sb.append("    otherUuid: ").append(toIndentedString(otherUuid)).append("\n");
      sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
      sb.append("    lastExecution: ").append(toIndentedString(lastExecution)).append("\n");
      sb.append("    isAllowPush: ").append(toIndentedString(isAllowPush)).append("\n");
      sb.append("    isAllowMarketingPush: ").append(toIndentedString(isAllowMarketingPush)).append("\n");
      sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
      sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
      sb.append("    autoLogin: ").append(toIndentedString(autoLogin)).append("\n");
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

