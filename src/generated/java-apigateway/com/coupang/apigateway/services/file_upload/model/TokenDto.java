package com.coupang.apigateway.services.file_upload.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.278+09:00")
public class TokenDto   {
  
  private String token = null;
  private String paramName = null;
  private String iframeUrl = null;
  private String actionUrl = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("token")
  @com.fasterxml.jackson.annotation.JsonProperty("token")
  public String getToken() {
    return token;
  }
  
  /**
   **/
  public void setToken(String token) {
    this.token = token;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("paramName")
  @com.fasterxml.jackson.annotation.JsonProperty("paramName")
  public String getParamName() {
    return paramName;
  }
  
  /**
   **/
  public void setParamName(String paramName) {
    this.paramName = paramName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("iframeUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("iframeUrl")
  public String getIframeUrl() {
    return iframeUrl;
  }
  
  /**
   **/
  public void setIframeUrl(String iframeUrl) {
    this.iframeUrl = iframeUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("actionUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("actionUrl")
  public String getActionUrl() {
    return actionUrl;
  }
  
  /**
   **/
  public void setActionUrl(String actionUrl) {
    this.actionUrl = actionUrl;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenDto tokenDto = (TokenDto) o;
    return Objects.equals(this.token, tokenDto.token) &&
        Objects.equals(this.paramName, tokenDto.paramName) &&
        Objects.equals(this.iframeUrl, tokenDto.iframeUrl) &&
        Objects.equals(this.actionUrl, tokenDto.actionUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, paramName, iframeUrl, actionUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenDto {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
    sb.append("    iframeUrl: ").append(toIndentedString(iframeUrl)).append("\n");
    sb.append("    actionUrl: ").append(toIndentedString(actionUrl)).append("\n");
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

  public static TokenDtoBuilder builder() {
    return new TokenDtoBuilder();
  }

  public static class TokenDtoBuilder {

    private String token = null;
    private String paramName = null;
    private String iframeUrl = null;
    private String actionUrl = null;
    

    TokenDtoBuilder() {
    }

    /**
     **/
    public TokenDtoBuilder token(String token) {
      this.token = token;
      return this;
    }

    /**
     **/
    public TokenDtoBuilder paramName(String paramName) {
      this.paramName = paramName;
      return this;
    }

    /**
     **/
    public TokenDtoBuilder iframeUrl(String iframeUrl) {
      this.iframeUrl = iframeUrl;
      return this;
    }

    /**
     **/
    public TokenDtoBuilder actionUrl(String actionUrl) {
      this.actionUrl = actionUrl;
      return this;
    }


    public TokenDto build() {
      TokenDto tokenDto = new TokenDto();
      tokenDto.setToken(this.token);
      tokenDto.setParamName(this.paramName);
      tokenDto.setIframeUrl(this.iframeUrl);
      tokenDto.setActionUrl(this.actionUrl);
      return tokenDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TokenDtoBuilder {\n");
      
      sb.append("    token: ").append(toIndentedString(token)).append("\n");
      sb.append("    paramName: ").append(toIndentedString(paramName)).append("\n");
      sb.append("    iframeUrl: ").append(toIndentedString(iframeUrl)).append("\n");
      sb.append("    actionUrl: ").append(toIndentedString(actionUrl)).append("\n");
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

