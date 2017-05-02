package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class MobileAppLoginSessionDto   {
  
  private String uuid = null;
  private String userAgentHeader = null;
  private String pcid = null;
  private String password = null;


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
  private String email = null;
  private Boolean autoLogin = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("password")
  @com.fasterxml.jackson.annotation.JsonProperty("password")
  public String getPassword() {
    return password;
  }
  
  /**
   **/
  public void setPassword(String password) {
    this.password = password;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("email")
  @com.fasterxml.jackson.annotation.JsonProperty("email")
  public String getEmail() {
    return email;
  }
  
  /**
   **/
  public void setEmail(String email) {
    this.email = email;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileAppLoginSessionDto mobileAppLoginSessionDto = (MobileAppLoginSessionDto) o;
    return Objects.equals(this.uuid, mobileAppLoginSessionDto.uuid) &&
        Objects.equals(this.userAgentHeader, mobileAppLoginSessionDto.userAgentHeader) &&
        Objects.equals(this.pcid, mobileAppLoginSessionDto.pcid) &&
        Objects.equals(this.password, mobileAppLoginSessionDto.password) &&
        Objects.equals(this.mobileOsType, mobileAppLoginSessionDto.mobileOsType) &&
        Objects.equals(this.ip, mobileAppLoginSessionDto.ip) &&
        Objects.equals(this.email, mobileAppLoginSessionDto.email) &&
        Objects.equals(this.autoLogin, mobileAppLoginSessionDto.autoLogin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, userAgentHeader, pcid, password, mobileOsType, ip, email, autoLogin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileAppLoginSessionDto {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    userAgentHeader: ").append(toIndentedString(userAgentHeader)).append("\n");
    sb.append("    pcid: ").append(toIndentedString(pcid)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    mobileOsType: ").append(toIndentedString(mobileOsType)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    autoLogin: ").append(toIndentedString(autoLogin)).append("\n");
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

  public static MobileAppLoginSessionDtoBuilder builder() {
    return new MobileAppLoginSessionDtoBuilder();
  }

  public static class MobileAppLoginSessionDtoBuilder {

    private String uuid = null;
    private String userAgentHeader = null;
    private String pcid = null;
    private String password = null;
    private MobileOsTypeEnum mobileOsType = null;
    private String ip = null;
    private String email = null;
    private Boolean autoLogin = null;
    

    MobileAppLoginSessionDtoBuilder() {
    }

    /**
     **/
    public MobileAppLoginSessionDtoBuilder uuid(String uuid) {
      this.uuid = uuid;
      return this;
    }

    /**
     **/
    public MobileAppLoginSessionDtoBuilder userAgentHeader(String userAgentHeader) {
      this.userAgentHeader = userAgentHeader;
      return this;
    }

    /**
     **/
    public MobileAppLoginSessionDtoBuilder pcid(String pcid) {
      this.pcid = pcid;
      return this;
    }

    /**
     **/
    public MobileAppLoginSessionDtoBuilder password(String password) {
      this.password = password;
      return this;
    }

    /**
     **/
    public MobileAppLoginSessionDtoBuilder mobileOsType(MobileOsTypeEnum mobileOsType) {
      this.mobileOsType = mobileOsType;
      return this;
    }

    /**
     **/
    public MobileAppLoginSessionDtoBuilder ip(String ip) {
      this.ip = ip;
      return this;
    }

    /**
     **/
    public MobileAppLoginSessionDtoBuilder email(String email) {
      this.email = email;
      return this;
    }

    /**
     **/
    public MobileAppLoginSessionDtoBuilder autoLogin(Boolean autoLogin) {
      this.autoLogin = autoLogin;
      return this;
    }


    public MobileAppLoginSessionDto build() {
      MobileAppLoginSessionDto mobileAppLoginSessionDto = new MobileAppLoginSessionDto();
      mobileAppLoginSessionDto.setUuid(this.uuid);
      mobileAppLoginSessionDto.setUserAgentHeader(this.userAgentHeader);
      mobileAppLoginSessionDto.setPcid(this.pcid);
      mobileAppLoginSessionDto.setPassword(this.password);
      mobileAppLoginSessionDto.setMobileOsType(this.mobileOsType);
      mobileAppLoginSessionDto.setIp(this.ip);
      mobileAppLoginSessionDto.setEmail(this.email);
      mobileAppLoginSessionDto.setAutoLogin(this.autoLogin);
      return mobileAppLoginSessionDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MobileAppLoginSessionDtoBuilder {\n");
      
      sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
      sb.append("    userAgentHeader: ").append(toIndentedString(userAgentHeader)).append("\n");
      sb.append("    pcid: ").append(toIndentedString(pcid)).append("\n");
      sb.append("    password: ").append(toIndentedString(password)).append("\n");
      sb.append("    mobileOsType: ").append(toIndentedString(mobileOsType)).append("\n");
      sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
      sb.append("    autoLogin: ").append(toIndentedString(autoLogin)).append("\n");
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

