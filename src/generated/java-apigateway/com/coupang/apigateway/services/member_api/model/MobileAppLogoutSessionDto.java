package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class MobileAppLogoutSessionDto   {
  
  private String uuid = null;
  private String userAgentHeader = null;
  private String updateToken = null;
  private String sessionKey = null;
  private String pcid = null;


  public enum MobileOsTypeEnum {
    ANDROID("ANDROID"),
    IOS("IOS");

    private String value;

    MobileOsTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private MobileOsTypeEnum mobileOsType = null;
  private String ip = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("userAgentHeader")
  @com.fasterxml.jackson.annotation.JsonProperty("userAgentHeader")
  public String getUserAgentHeader() {
    return userAgentHeader;
  }
  
  /**
   **/
  public void setUserAgentHeader(String userAgentHeader) {
    this.userAgentHeader = userAgentHeader;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("updateToken")
  @com.fasterxml.jackson.annotation.JsonProperty("updateToken")
  public String getUpdateToken() {
    return updateToken;
  }
  
  /**
   **/
  public void setUpdateToken(String updateToken) {
    this.updateToken = updateToken;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sessionKey")
  @com.fasterxml.jackson.annotation.JsonProperty("sessionKey")
  public String getSessionKey() {
    return sessionKey;
  }
  
  /**
   **/
  public void setSessionKey(String sessionKey) {
    this.sessionKey = sessionKey;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("pcid")
  @com.fasterxml.jackson.annotation.JsonProperty("pcid")
  public String getPcid() {
    return pcid;
  }
  
  /**
   **/
  public void setPcid(String pcid) {
    this.pcid = pcid;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mobileOsType")
  @com.fasterxml.jackson.annotation.JsonProperty("mobileOsType")
  public MobileOsTypeEnum getMobileOsType() {
    return mobileOsType;
  }
  
  /**
   **/
  public void setMobileOsType(MobileOsTypeEnum mobileOsType) {
    this.mobileOsType = mobileOsType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ip")
  @com.fasterxml.jackson.annotation.JsonProperty("ip")
  public String getIp() {
    return ip;
  }
  
  /**
   **/
  public void setIp(String ip) {
    this.ip = ip;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileAppLogoutSessionDto mobileAppLogoutSessionDto = (MobileAppLogoutSessionDto) o;
    return Objects.equals(this.uuid, mobileAppLogoutSessionDto.uuid) &&
        Objects.equals(this.userAgentHeader, mobileAppLogoutSessionDto.userAgentHeader) &&
        Objects.equals(this.updateToken, mobileAppLogoutSessionDto.updateToken) &&
        Objects.equals(this.sessionKey, mobileAppLogoutSessionDto.sessionKey) &&
        Objects.equals(this.pcid, mobileAppLogoutSessionDto.pcid) &&
        Objects.equals(this.mobileOsType, mobileAppLogoutSessionDto.mobileOsType) &&
        Objects.equals(this.ip, mobileAppLogoutSessionDto.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, userAgentHeader, updateToken, sessionKey, pcid, mobileOsType, ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileAppLogoutSessionDto {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    userAgentHeader: ").append(toIndentedString(userAgentHeader)).append("\n");
    sb.append("    updateToken: ").append(toIndentedString(updateToken)).append("\n");
    sb.append("    sessionKey: ").append(toIndentedString(sessionKey)).append("\n");
    sb.append("    pcid: ").append(toIndentedString(pcid)).append("\n");
    sb.append("    mobileOsType: ").append(toIndentedString(mobileOsType)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

  public static MobileAppLogoutSessionDtoBuilder builder() {
    return new MobileAppLogoutSessionDtoBuilder();
  }

  public static class MobileAppLogoutSessionDtoBuilder {

    private String uuid = null;
    private String userAgentHeader = null;
    private String updateToken = null;
    private String sessionKey = null;
    private String pcid = null;
    private MobileOsTypeEnum mobileOsType = null;
    private String ip = null;
    

    MobileAppLogoutSessionDtoBuilder() {
    }

    /**
     **/
    public MobileAppLogoutSessionDtoBuilder uuid(String uuid) {
      this.uuid = uuid;
      return this;
    }

    /**
     **/
    public MobileAppLogoutSessionDtoBuilder userAgentHeader(String userAgentHeader) {
      this.userAgentHeader = userAgentHeader;
      return this;
    }

    /**
     **/
    public MobileAppLogoutSessionDtoBuilder updateToken(String updateToken) {
      this.updateToken = updateToken;
      return this;
    }

    /**
     **/
    public MobileAppLogoutSessionDtoBuilder sessionKey(String sessionKey) {
      this.sessionKey = sessionKey;
      return this;
    }

    /**
     **/
    public MobileAppLogoutSessionDtoBuilder pcid(String pcid) {
      this.pcid = pcid;
      return this;
    }

    /**
     **/
    public MobileAppLogoutSessionDtoBuilder mobileOsType(MobileOsTypeEnum mobileOsType) {
      this.mobileOsType = mobileOsType;
      return this;
    }

    /**
     **/
    public MobileAppLogoutSessionDtoBuilder ip(String ip) {
      this.ip = ip;
      return this;
    }


    public MobileAppLogoutSessionDto build() {
      MobileAppLogoutSessionDto mobileAppLogoutSessionDto = new MobileAppLogoutSessionDto();
      mobileAppLogoutSessionDto.setUuid(this.uuid);
      mobileAppLogoutSessionDto.setUserAgentHeader(this.userAgentHeader);
      mobileAppLogoutSessionDto.setUpdateToken(this.updateToken);
      mobileAppLogoutSessionDto.setSessionKey(this.sessionKey);
      mobileAppLogoutSessionDto.setPcid(this.pcid);
      mobileAppLogoutSessionDto.setMobileOsType(this.mobileOsType);
      mobileAppLogoutSessionDto.setIp(this.ip);
      return mobileAppLogoutSessionDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MobileAppLogoutSessionDtoBuilder {\n");
      
      sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
      sb.append("    userAgentHeader: ").append(toIndentedString(userAgentHeader)).append("\n");
      sb.append("    updateToken: ").append(toIndentedString(updateToken)).append("\n");
      sb.append("    sessionKey: ").append(toIndentedString(sessionKey)).append("\n");
      sb.append("    pcid: ").append(toIndentedString(pcid)).append("\n");
      sb.append("    mobileOsType: ").append(toIndentedString(mobileOsType)).append("\n");
      sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

