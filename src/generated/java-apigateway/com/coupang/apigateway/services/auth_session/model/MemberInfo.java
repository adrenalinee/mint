package com.coupang.apigateway.services.auth_session.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.932+09:00")
public class MemberInfo   {
  
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
    MemberInfo memberInfo = (MemberInfo) o;
    return Objects.equals(this.version, memberInfo.version) &&
        Objects.equals(this.name, memberInfo.name) &&
        Objects.equals(this.memberId, memberInfo.memberId) &&
        Objects.equals(this.email, memberInfo.email) &&
        Objects.equals(this.adultVerified, memberInfo.adultVerified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, name, memberId, email, adultVerified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberInfo {\n");
    
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

  public static MemberInfoBuilder builder() {
    return new MemberInfoBuilder();
  }

  public static class MemberInfoBuilder {

    private String version = null;
    private String name = null;
    private String memberId = null;
    private String email = null;
    private Boolean adultVerified = null;
    

    MemberInfoBuilder() {
    }

    /**
     **/
    public MemberInfoBuilder version(String version) {
      this.version = version;
      return this;
    }

    /**
     **/
    public MemberInfoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public MemberInfoBuilder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    /**
     **/
    public MemberInfoBuilder email(String email) {
      this.email = email;
      return this;
    }

    /**
     **/
    public MemberInfoBuilder adultVerified(Boolean adultVerified) {
      this.adultVerified = adultVerified;
      return this;
    }


    public MemberInfo build() {
      MemberInfo memberInfo = new MemberInfo();
      memberInfo.setVersion(this.version);
      memberInfo.setName(this.name);
      memberInfo.setMemberId(this.memberId);
      memberInfo.setEmail(this.email);
      memberInfo.setAdultVerified(this.adultVerified);
      return memberInfo;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MemberInfoBuilder {\n");
      
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

