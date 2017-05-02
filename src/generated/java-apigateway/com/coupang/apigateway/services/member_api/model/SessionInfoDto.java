package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class SessionInfoDto   {
  
  private String userAgentHeader = null;
  private String updateToken = null;
  private String sessionKey = null;
  private Boolean rememberMe = null;
  private String pcid = null;
  private String memberId = null;
  private String loginIp = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("rememberMe")
  @com.fasterxml.jackson.annotation.JsonProperty("rememberMe")
  public Boolean getRememberMe() {
    return rememberMe;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isRememberMe() {
    return rememberMe == null ? false : rememberMe;
  }
  
  /**
   **/
  public void setRememberMe(Boolean rememberMe) {
    this.rememberMe = rememberMe;
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
  @org.codehaus.jackson.annotate.JsonProperty("loginIp")
  @com.fasterxml.jackson.annotation.JsonProperty("loginIp")
  public String getLoginIp() {
    return loginIp;
  }
  
  /**
   **/
  public void setLoginIp(String loginIp) {
    this.loginIp = loginIp;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionInfoDto sessionInfoDto = (SessionInfoDto) o;
    return Objects.equals(this.userAgentHeader, sessionInfoDto.userAgentHeader) &&
        Objects.equals(this.updateToken, sessionInfoDto.updateToken) &&
        Objects.equals(this.sessionKey, sessionInfoDto.sessionKey) &&
        Objects.equals(this.rememberMe, sessionInfoDto.rememberMe) &&
        Objects.equals(this.pcid, sessionInfoDto.pcid) &&
        Objects.equals(this.memberId, sessionInfoDto.memberId) &&
        Objects.equals(this.loginIp, sessionInfoDto.loginIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAgentHeader, updateToken, sessionKey, rememberMe, pcid, memberId, loginIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionInfoDto {\n");
    
    sb.append("    userAgentHeader: ").append(toIndentedString(userAgentHeader)).append("\n");
    sb.append("    updateToken: ").append(toIndentedString(updateToken)).append("\n");
    sb.append("    sessionKey: ").append(toIndentedString(sessionKey)).append("\n");
    sb.append("    rememberMe: ").append(toIndentedString(rememberMe)).append("\n");
    sb.append("    pcid: ").append(toIndentedString(pcid)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    loginIp: ").append(toIndentedString(loginIp)).append("\n");
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

  public static SessionInfoDtoBuilder builder() {
    return new SessionInfoDtoBuilder();
  }

  public static class SessionInfoDtoBuilder {

    private String userAgentHeader = null;
    private String updateToken = null;
    private String sessionKey = null;
    private Boolean rememberMe = null;
    private String pcid = null;
    private String memberId = null;
    private String loginIp = null;
    

    SessionInfoDtoBuilder() {
    }

    /**
     **/
    public SessionInfoDtoBuilder userAgentHeader(String userAgentHeader) {
      this.userAgentHeader = userAgentHeader;
      return this;
    }

    /**
     **/
    public SessionInfoDtoBuilder updateToken(String updateToken) {
      this.updateToken = updateToken;
      return this;
    }

    /**
     **/
    public SessionInfoDtoBuilder sessionKey(String sessionKey) {
      this.sessionKey = sessionKey;
      return this;
    }

    /**
     **/
    public SessionInfoDtoBuilder rememberMe(Boolean rememberMe) {
      this.rememberMe = rememberMe;
      return this;
    }

    /**
     **/
    public SessionInfoDtoBuilder pcid(String pcid) {
      this.pcid = pcid;
      return this;
    }

    /**
     **/
    public SessionInfoDtoBuilder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    /**
     **/
    public SessionInfoDtoBuilder loginIp(String loginIp) {
      this.loginIp = loginIp;
      return this;
    }


    public SessionInfoDto build() {
      SessionInfoDto sessionInfoDto = new SessionInfoDto();
      sessionInfoDto.setUserAgentHeader(this.userAgentHeader);
      sessionInfoDto.setUpdateToken(this.updateToken);
      sessionInfoDto.setSessionKey(this.sessionKey);
      sessionInfoDto.setRememberMe(this.rememberMe);
      sessionInfoDto.setPcid(this.pcid);
      sessionInfoDto.setMemberId(this.memberId);
      sessionInfoDto.setLoginIp(this.loginIp);
      return sessionInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SessionInfoDtoBuilder {\n");
      
      sb.append("    userAgentHeader: ").append(toIndentedString(userAgentHeader)).append("\n");
      sb.append("    updateToken: ").append(toIndentedString(updateToken)).append("\n");
      sb.append("    sessionKey: ").append(toIndentedString(sessionKey)).append("\n");
      sb.append("    rememberMe: ").append(toIndentedString(rememberMe)).append("\n");
      sb.append("    pcid: ").append(toIndentedString(pcid)).append("\n");
      sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
      sb.append("    loginIp: ").append(toIndentedString(loginIp)).append("\n");
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

