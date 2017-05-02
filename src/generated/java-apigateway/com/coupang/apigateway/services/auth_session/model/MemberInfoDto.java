package com.coupang.apigateway.services.auth_session.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.932+09:00")
public class MemberInfoDto   {
  
  private String version = null;
  private String name = null;
  private String memberId = null;
  private String email = null;
  private Boolean adultVerified = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("version")
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  public String getVersion() {
    return version;
  }
  
  /**
   **/
  public void setVersion(String version) {
    this.version = version;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public String getName() {
    return name;
  }
  
  /**
   **/
  public void setName(String name) {
    this.name = name;
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
  @org.codehaus.jackson.annotate.JsonProperty("adultVerified")
  @com.fasterxml.jackson.annotation.JsonProperty("adultVerified")
  public Boolean getAdultVerified() {
    return adultVerified;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAdultVerified() {
    return adultVerified == null ? false : adultVerified;
  }
  
  /**
   **/
  public void setAdultVerified(Boolean adultVerified) {
    this.adultVerified = adultVerified;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberInfoDto memberInfoDto = (MemberInfoDto) o;
    return Objects.equals(this.version, memberInfoDto.version) &&
        Objects.equals(this.name, memberInfoDto.name) &&
        Objects.equals(this.memberId, memberInfoDto.memberId) &&
        Objects.equals(this.email, memberInfoDto.email) &&
        Objects.equals(this.adultVerified, memberInfoDto.adultVerified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, name, memberId, email, adultVerified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberInfoDto {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    adultVerified: ").append(toIndentedString(adultVerified)).append("\n");
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

  public static MemberInfoDtoBuilder builder() {
    return new MemberInfoDtoBuilder();
  }

  public static class MemberInfoDtoBuilder {

    private String version = null;
    private String name = null;
    private String memberId = null;
    private String email = null;
    private Boolean adultVerified = null;
    

    MemberInfoDtoBuilder() {
    }

    /**
     **/
    public MemberInfoDtoBuilder version(String version) {
      this.version = version;
      return this;
    }

    /**
     **/
    public MemberInfoDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public MemberInfoDtoBuilder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    /**
     **/
    public MemberInfoDtoBuilder email(String email) {
      this.email = email;
      return this;
    }

    /**
     **/
    public MemberInfoDtoBuilder adultVerified(Boolean adultVerified) {
      this.adultVerified = adultVerified;
      return this;
    }


    public MemberInfoDto build() {
      MemberInfoDto memberInfoDto = new MemberInfoDto();
      memberInfoDto.setVersion(this.version);
      memberInfoDto.setName(this.name);
      memberInfoDto.setMemberId(this.memberId);
      memberInfoDto.setEmail(this.email);
      memberInfoDto.setAdultVerified(this.adultVerified);
      return memberInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MemberInfoDtoBuilder {\n");
      
      sb.append("    version: ").append(toIndentedString(version)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
      sb.append("    email: ").append(toIndentedString(email)).append("\n");
      sb.append("    adultVerified: ").append(toIndentedString(adultVerified)).append("\n");
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

