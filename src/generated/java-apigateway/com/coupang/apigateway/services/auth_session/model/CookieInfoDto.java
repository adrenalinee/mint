package com.coupang.apigateway.services.auth_session.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.932+09:00")
public class CookieInfoDto   {
  
  private String userAgent = null;
  private Integer cookieSize = null;
  private List<String> cookieNames = new ArrayList<String>();
  private Integer cookieMaxLength = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("userAgent")
  @com.fasterxml.jackson.annotation.JsonProperty("userAgent")
  public String getUserAgent() {
    return userAgent;
  }
  
  /**
   **/
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cookieSize")
  @com.fasterxml.jackson.annotation.JsonProperty("cookieSize")
  public Integer getCookieSize() {
    return cookieSize;
  }
  
  /**
   **/
  public void setCookieSize(Integer cookieSize) {
    this.cookieSize = cookieSize;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cookieNames")
  @com.fasterxml.jackson.annotation.JsonProperty("cookieNames")
  public List<String> getCookieNames() {
    return cookieNames;
  }
  
  /**
   **/
  public void setCookieNames(List<String> cookieNames) {
    this.cookieNames = cookieNames;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cookieMaxLength")
  @com.fasterxml.jackson.annotation.JsonProperty("cookieMaxLength")
  public Integer getCookieMaxLength() {
    return cookieMaxLength;
  }
  
  /**
   **/
  public void setCookieMaxLength(Integer cookieMaxLength) {
    this.cookieMaxLength = cookieMaxLength;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CookieInfoDto cookieInfoDto = (CookieInfoDto) o;
    return Objects.equals(this.userAgent, cookieInfoDto.userAgent) &&
        Objects.equals(this.cookieSize, cookieInfoDto.cookieSize) &&
        Objects.equals(this.cookieNames, cookieInfoDto.cookieNames) &&
        Objects.equals(this.cookieMaxLength, cookieInfoDto.cookieMaxLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userAgent, cookieSize, cookieNames, cookieMaxLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CookieInfoDto {\n");
    
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    cookieSize: ").append(toIndentedString(cookieSize)).append("\n");
    sb.append("    cookieNames: ").append(toIndentedString(cookieNames)).append("\n");
    sb.append("    cookieMaxLength: ").append(toIndentedString(cookieMaxLength)).append("\n");
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

  public static CookieInfoDtoBuilder builder() {
    return new CookieInfoDtoBuilder();
  }

  public static class CookieInfoDtoBuilder {

    private String userAgent = null;
    private Integer cookieSize = null;
    private List<String> cookieNames = new ArrayList<String>();
    private Integer cookieMaxLength = null;
    

    CookieInfoDtoBuilder() {
    }

    /**
     **/
    public CookieInfoDtoBuilder userAgent(String userAgent) {
      this.userAgent = userAgent;
      return this;
    }

    /**
     **/
    public CookieInfoDtoBuilder cookieSize(Integer cookieSize) {
      this.cookieSize = cookieSize;
      return this;
    }

    /**
     **/
    public CookieInfoDtoBuilder cookieNames(List<String> cookieNames) {
      this.cookieNames = cookieNames;
      return this;
    }

    /**
     **/
    public CookieInfoDtoBuilder cookieMaxLength(Integer cookieMaxLength) {
      this.cookieMaxLength = cookieMaxLength;
      return this;
    }


    public CookieInfoDto build() {
      CookieInfoDto cookieInfoDto = new CookieInfoDto();
      cookieInfoDto.setUserAgent(this.userAgent);
      cookieInfoDto.setCookieSize(this.cookieSize);
      cookieInfoDto.setCookieNames(this.cookieNames);
      cookieInfoDto.setCookieMaxLength(this.cookieMaxLength);
      return cookieInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CookieInfoDtoBuilder {\n");
      
      sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
      sb.append("    cookieSize: ").append(toIndentedString(cookieSize)).append("\n");
      sb.append("    cookieNames: ").append(toIndentedString(cookieNames)).append("\n");
      sb.append("    cookieMaxLength: ").append(toIndentedString(cookieMaxLength)).append("\n");
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

