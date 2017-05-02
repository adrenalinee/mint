package com.coupang.apigateway.services.auth_session.model;

import java.util.Objects;
import com.coupang.apigateway.services.auth_session.model.MemberInfoDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.932+09:00")
public class MemberSessionInfoDto   {
  
  private Integer version = null;
  private String uuid = null;
  private String updateToken = null;
  private String type = null;
  private String sessionKey = null;
  private Boolean rememberMe = null;
  private String pcid = null;
  private String mobileOsType = null;
  private MemberInfoDto memberInfoDto = null;
  private String memberId = null;
  private String loginIp = null;
  private Long lastAccessTime = null;
  private Boolean explicitExpired = null;
  private Long createdAt = null;
  private String clientInfo = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("version")
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  
  /**
   **/
  public void setVersion(Integer version) {
    this.version = version;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public String getType() {
    return type;
  }
  
  /**
   **/
  public void setType(String type) {
    this.type = type;
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
  @org.codehaus.jackson.annotate.JsonProperty("mobileOsType")
  @com.fasterxml.jackson.annotation.JsonProperty("mobileOsType")
  public String getMobileOsType() {
    return mobileOsType;
  }
  
  /**
   **/
  public void setMobileOsType(String mobileOsType) {
    this.mobileOsType = mobileOsType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("memberInfoDto")
  @com.fasterxml.jackson.annotation.JsonProperty("memberInfoDto")
  public MemberInfoDto getMemberInfoDto() {
    return memberInfoDto;
  }
  
  /**
   **/
  public void setMemberInfoDto(MemberInfoDto memberInfoDto) {
    this.memberInfoDto = memberInfoDto;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lastAccessTime")
  @com.fasterxml.jackson.annotation.JsonProperty("lastAccessTime")
  public Long getLastAccessTime() {
    return lastAccessTime;
  }
  
  /**
   **/
  public void setLastAccessTime(Long lastAccessTime) {
    this.lastAccessTime = lastAccessTime;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("explicitExpired")
  @com.fasterxml.jackson.annotation.JsonProperty("explicitExpired")
  public Boolean getExplicitExpired() {
    return explicitExpired;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isExplicitExpired() {
    return explicitExpired == null ? false : explicitExpired;
  }
  
  /**
   **/
  public void setExplicitExpired(Boolean explicitExpired) {
    this.explicitExpired = explicitExpired;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("createdAt")
  @com.fasterxml.jackson.annotation.JsonProperty("createdAt")
  public Long getCreatedAt() {
    return createdAt;
  }
  
  /**
   **/
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("clientInfo")
  @com.fasterxml.jackson.annotation.JsonProperty("clientInfo")
  public String getClientInfo() {
    return clientInfo;
  }
  
  /**
   **/
  public void setClientInfo(String clientInfo) {
    this.clientInfo = clientInfo;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberSessionInfoDto memberSessionInfoDto = (MemberSessionInfoDto) o;
    return Objects.equals(this.version, memberSessionInfoDto.version) &&
        Objects.equals(this.uuid, memberSessionInfoDto.uuid) &&
        Objects.equals(this.updateToken, memberSessionInfoDto.updateToken) &&
        Objects.equals(this.type, memberSessionInfoDto.type) &&
        Objects.equals(this.sessionKey, memberSessionInfoDto.sessionKey) &&
        Objects.equals(this.rememberMe, memberSessionInfoDto.rememberMe) &&
        Objects.equals(this.pcid, memberSessionInfoDto.pcid) &&
        Objects.equals(this.mobileOsType, memberSessionInfoDto.mobileOsType) &&
        Objects.equals(this.memberInfoDto, memberSessionInfoDto.memberInfoDto) &&
        Objects.equals(this.memberId, memberSessionInfoDto.memberId) &&
        Objects.equals(this.loginIp, memberSessionInfoDto.loginIp) &&
        Objects.equals(this.lastAccessTime, memberSessionInfoDto.lastAccessTime) &&
        Objects.equals(this.explicitExpired, memberSessionInfoDto.explicitExpired) &&
        Objects.equals(this.createdAt, memberSessionInfoDto.createdAt) &&
        Objects.equals(this.clientInfo, memberSessionInfoDto.clientInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, uuid, updateToken, type, sessionKey, rememberMe, pcid, mobileOsType, memberInfoDto, memberId, loginIp, lastAccessTime, explicitExpired, createdAt, clientInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberSessionInfoDto {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    updateToken: ").append(toIndentedString(updateToken)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sessionKey: ").append(toIndentedString(sessionKey)).append("\n");
    sb.append("    rememberMe: ").append(toIndentedString(rememberMe)).append("\n");
    sb.append("    pcid: ").append(toIndentedString(pcid)).append("\n");
    sb.append("    mobileOsType: ").append(toIndentedString(mobileOsType)).append("\n");
    sb.append("    memberInfoDto: ").append(toIndentedString(memberInfoDto)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    loginIp: ").append(toIndentedString(loginIp)).append("\n");
    sb.append("    lastAccessTime: ").append(toIndentedString(lastAccessTime)).append("\n");
    sb.append("    explicitExpired: ").append(toIndentedString(explicitExpired)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    clientInfo: ").append(toIndentedString(clientInfo)).append("\n");
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

  public static MemberSessionInfoDtoBuilder builder() {
    return new MemberSessionInfoDtoBuilder();
  }

  public static class MemberSessionInfoDtoBuilder {

    private Integer version = null;
    private String uuid = null;
    private String updateToken = null;
    private String type = null;
    private String sessionKey = null;
    private Boolean rememberMe = null;
    private String pcid = null;
    private String mobileOsType = null;
    private MemberInfoDto memberInfoDto = null;
    private String memberId = null;
    private String loginIp = null;
    private Long lastAccessTime = null;
    private Boolean explicitExpired = null;
    private Long createdAt = null;
    private String clientInfo = null;
    

    MemberSessionInfoDtoBuilder() {
    }

    /**
     **/
    public MemberSessionInfoDtoBuilder version(Integer version) {
      this.version = version;
      return this;
    }

    /**
     **/
    public MemberSessionInfoDtoBuilder uuid(String uuid) {
      this.uuid = uuid;
      return this;
    }

    /**
     **/
    public MemberSessionInfoDtoBuilder updateToken(String updateToken) {
      this.updateToken = updateToken;
      return this;
    }

    /**
     **/
    public MemberSessionInfoDtoBuilder type(String type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public MemberSessionInfoDtoBuilder sessionKey(String sessionKey) {
      this.sessionKey = sessionKey;
      return this;
    }

    /**
     **/
    public MemberSessionInfoDtoBuilder rememberMe(Boolean rememberMe) {
      this.rememberMe = rememberMe;
      return this;
    }

    /**
     **/
    public MemberSessionInfoDtoBuilder pcid(String pcid) {
      this.pcid = pcid;
      return this;
    }

    /**
     **/
    public MemberSessionInfoDtoBuilder mobileOsType(String mobileOsType) {
      this.mobileOsType = mobileOsType;
      return this;
    }

    /**
     **/
    public MemberSessionInfoDtoBuilder memberInfoDto(MemberInfoDto memberInfoDto) {
      this.memberInfoDto = memberInfoDto;
      return this;
    }

    /**
     **/
    public MemberSessionInfoDtoBuilder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    /**
     **/
    public MemberSessionInfoDtoBuilder loginIp(String loginIp) {
      this.loginIp = loginIp;
      return this;
    }

    /**
     **/
    public MemberSessionInfoDtoBuilder lastAccessTime(Long lastAccessTime) {
      this.lastAccessTime = lastAccessTime;
      return this;
    }

    /**
     **/
    public MemberSessionInfoDtoBuilder explicitExpired(Boolean explicitExpired) {
      this.explicitExpired = explicitExpired;
      return this;
    }

    /**
     **/
    public MemberSessionInfoDtoBuilder createdAt(Long createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public MemberSessionInfoDtoBuilder clientInfo(String clientInfo) {
      this.clientInfo = clientInfo;
      return this;
    }


    public MemberSessionInfoDto build() {
      MemberSessionInfoDto memberSessionInfoDto = new MemberSessionInfoDto();
      memberSessionInfoDto.setVersion(this.version);
      memberSessionInfoDto.setUuid(this.uuid);
      memberSessionInfoDto.setUpdateToken(this.updateToken);
      memberSessionInfoDto.setType(this.type);
      memberSessionInfoDto.setSessionKey(this.sessionKey);
      memberSessionInfoDto.setRememberMe(this.rememberMe);
      memberSessionInfoDto.setPcid(this.pcid);
      memberSessionInfoDto.setMobileOsType(this.mobileOsType);
      memberSessionInfoDto.setMemberInfoDto(this.memberInfoDto);
      memberSessionInfoDto.setMemberId(this.memberId);
      memberSessionInfoDto.setLoginIp(this.loginIp);
      memberSessionInfoDto.setLastAccessTime(this.lastAccessTime);
      memberSessionInfoDto.setExplicitExpired(this.explicitExpired);
      memberSessionInfoDto.setCreatedAt(this.createdAt);
      memberSessionInfoDto.setClientInfo(this.clientInfo);
      return memberSessionInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MemberSessionInfoDtoBuilder {\n");
      
      sb.append("    version: ").append(toIndentedString(version)).append("\n");
      sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
      sb.append("    updateToken: ").append(toIndentedString(updateToken)).append("\n");
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    sessionKey: ").append(toIndentedString(sessionKey)).append("\n");
      sb.append("    rememberMe: ").append(toIndentedString(rememberMe)).append("\n");
      sb.append("    pcid: ").append(toIndentedString(pcid)).append("\n");
      sb.append("    mobileOsType: ").append(toIndentedString(mobileOsType)).append("\n");
      sb.append("    memberInfoDto: ").append(toIndentedString(memberInfoDto)).append("\n");
      sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
      sb.append("    loginIp: ").append(toIndentedString(loginIp)).append("\n");
      sb.append("    lastAccessTime: ").append(toIndentedString(lastAccessTime)).append("\n");
      sb.append("    explicitExpired: ").append(toIndentedString(explicitExpired)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    clientInfo: ").append(toIndentedString(clientInfo)).append("\n");
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

