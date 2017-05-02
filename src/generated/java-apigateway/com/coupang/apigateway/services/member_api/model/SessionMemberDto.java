package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class SessionMemberDto   {
  
  private String name = null;
  private String memberId = null;
  private String email = null;
  private Boolean adultVerified = null;

  
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
    SessionMemberDto sessionMemberDto = (SessionMemberDto) o;
    return Objects.equals(this.name, sessionMemberDto.name) &&
        Objects.equals(this.memberId, sessionMemberDto.memberId) &&
        Objects.equals(this.email, sessionMemberDto.email) &&
        Objects.equals(this.adultVerified, sessionMemberDto.adultVerified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, memberId, email, adultVerified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionMemberDto {\n");
    
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

  public static SessionMemberDtoBuilder builder() {
    return new SessionMemberDtoBuilder();
  }

  public static class SessionMemberDtoBuilder {

    private String name = null;
    private String memberId = null;
    private String email = null;
    private Boolean adultVerified = null;
    

    SessionMemberDtoBuilder() {
    }

    /**
     **/
    public SessionMemberDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public SessionMemberDtoBuilder memberId(String memberId) {
      this.memberId = memberId;
      return this;
    }

    /**
     **/
    public SessionMemberDtoBuilder email(String email) {
      this.email = email;
      return this;
    }

    /**
     **/
    public SessionMemberDtoBuilder adultVerified(Boolean adultVerified) {
      this.adultVerified = adultVerified;
      return this;
    }


    public SessionMemberDto build() {
      SessionMemberDto sessionMemberDto = new SessionMemberDto();
      sessionMemberDto.setName(this.name);
      sessionMemberDto.setMemberId(this.memberId);
      sessionMemberDto.setEmail(this.email);
      sessionMemberDto.setAdultVerified(this.adultVerified);
      return sessionMemberDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SessionMemberDtoBuilder {\n");
      
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

