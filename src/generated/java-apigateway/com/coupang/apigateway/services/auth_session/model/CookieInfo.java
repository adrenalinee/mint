package com.coupang.apigateway.services.auth_session.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.932+09:00")
public class CookieInfo   {
  
  private String value = null;
  private Integer maxAge = null;
  private String key = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("value")
  @com.fasterxml.jackson.annotation.JsonProperty("value")
  public String getValue() {
    return value;
  }
  
  /**
   **/
  public void setValue(String value) {
    this.value = value;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maxAge")
  @com.fasterxml.jackson.annotation.JsonProperty("maxAge")
  public Integer getMaxAge() {
    return maxAge;
  }
  
  /**
   **/
  public void setMaxAge(Integer maxAge) {
    this.maxAge = maxAge;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("key")
  @com.fasterxml.jackson.annotation.JsonProperty("key")
  public String getKey() {
    return key;
  }
  
  /**
   **/
  public void setKey(String key) {
    this.key = key;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CookieInfo cookieInfo = (CookieInfo) o;
    return Objects.equals(this.value, cookieInfo.value) &&
        Objects.equals(this.maxAge, cookieInfo.maxAge) &&
        Objects.equals(this.key, cookieInfo.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, maxAge, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CookieInfo {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

  public static CookieInfoBuilder builder() {
    return new CookieInfoBuilder();
  }

  public static class CookieInfoBuilder {

    private String value = null;
    private Integer maxAge = null;
    private String key = null;
    

    CookieInfoBuilder() {
    }

    /**
     **/
    public CookieInfoBuilder value(String value) {
      this.value = value;
      return this;
    }

    /**
     **/
    public CookieInfoBuilder maxAge(Integer maxAge) {
      this.maxAge = maxAge;
      return this;
    }

    /**
     **/
    public CookieInfoBuilder key(String key) {
      this.key = key;
      return this;
    }


    public CookieInfo build() {
      CookieInfo cookieInfo = new CookieInfo();
      cookieInfo.setValue(this.value);
      cookieInfo.setMaxAge(this.maxAge);
      cookieInfo.setKey(this.key);
      return cookieInfo;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CookieInfoBuilder {\n");
      
      sb.append("    value: ").append(toIndentedString(value)).append("\n");
      sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
      sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

